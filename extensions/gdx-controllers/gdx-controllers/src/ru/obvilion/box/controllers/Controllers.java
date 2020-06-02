/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package ru.obvilion.box.controllers;

import ru.obvilion.box.Box;
import ru.obvilion.box.constructors.Application;
import ru.obvilion.box.constructors.Application.ApplicationType;
import ru.obvilion.box.constructors.Graphics.GraphicsType;
import ru.obvilion.box.LifecycleListener;
import ru.obvilion.box.utils.Array;
import ru.obvilion.box.utils.GdxRuntimeException;
import ru.obvilion.box.utils.ObjectMap;
import ru.obvilion.box.utils.reflect.ClassReflection;

/** Provides access to connected {@link Controller} instances. Query the available controllers via {@link #getControllers()}, add
 * and remove global {@link ControllerListener} instances via {@link #addListener(ControllerListener)} and
 * {@link #removeListener(ControllerListener)}. The listeners will be invoked on the rendering thread. The global listeners will
 * be invoked for all events generated by all controllers. Polling a Controller can be done by invoking one of its getter methods.
 * 
 * @author Nathan Sweet */
public class Controllers {
	private static final String TAG = "Controllers";
	static final ObjectMap<Application, ControllerManager> managers = new ObjectMap<Application, ControllerManager>();
    /**
     * The class name of a preferred {@link ControllerManager}. If this is null then an appropriate ControllerManager will
     *  automatically be selected. This must be set before any controllers or managers are found.
     */
	public static String preferredManager = null;

	/** Returns an array of connected {@link Controller} instances. This method should only be called on the rendering thread.
	 * 
	 * @return the connected controllers */
	static public Array<Controller> getControllers () {
		initialize();
		return getManager().getControllers();
	}

	/** Add a global {@link ControllerListener} that can react to events from all {@link Controller} instances. The listener will be
	 * invoked on the rendering thread.
	 * @param listener */
	static public void addListener (ControllerListener listener) {
		initialize();
		getManager().addListener(listener);
	}

	/** Removes a global {@link ControllerListener}. The method must be called on the rendering thread.
	 * @param listener */
	static public void removeListener (ControllerListener listener) {
		initialize();
		getManager().removeListener(listener);
	}
	
	/** Removes every global {@link ControllerListener} previously added. */
	static public void clearListeners () {
		initialize();
		getManager().clearListeners();
	}
	
	/** Returns all listeners currently registered. Modifying this array will result in undefined behaviour. **/
	static public Array<ControllerListener> getListeners() {
		initialize();
		return getManager().getListeners();
	}

	static private ControllerManager getManager () {
		return managers.get(Box.app);
	}

	static private void initialize () {
		if (managers.containsKey(Box.app)) return;

		String className = null;
		ApplicationType type = Box.app.getType();
		ControllerManager manager = null;

		if (preferredManager != null) {
			className = preferredManager;
		} else if (type == ApplicationType.Android) {
			className = "com.badlogic.gdx.controllers.android.AndroidControllers";
		} else if (type == ApplicationType.Desktop) {
			if(Box.graphics.getType() == GraphicsType.LWJGL3) {
				className = "com.badlogic.gdx.controllers.lwjgl3.Lwjgl3ControllerManager";
			} else {
				className = "com.badlogic.gdx.controllers.desktop.DesktopControllerManager";
			}
		} else if (type == ApplicationType.WebGL) {
			className = "com.badlogic.gdx.controllers.gwt.GwtControllers";
		} else {
			Box.app.log(TAG, "No controller manager is available for: " + Box.app.getType());
			manager = new ControllerManagerStub();
		}

		if (manager == null) {
			try {
				Class controllerManagerClass = ClassReflection.forName(className);
				manager = (ControllerManager)ClassReflection.newInstance(controllerManagerClass);
			} catch (Throwable ex) {
				throw new GdxRuntimeException("Error creating controller manager: " + className, ex);
			}
		}

		managers.put(Box.app, manager);
		final Application app = Box.app;
		Box.app.addLifecycleListener(new LifecycleListener() {
			@Override
			public void resume () {
			}

			@Override
			public void pause () {
			}

			@Override
			public void dispose () {
				managers.remove(app);
				Box.app.log(TAG, "removed manager for application, " + managers.size + " managers active");

			}
		});
		Box.app.log(TAG, "added manager for application, " + managers.size + " managers active");
	}
}