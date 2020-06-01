/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btDefaultCollisionConfiguration extends btCollisionConfiguration {
	private long swigCPtr;
	
	protected btDefaultCollisionConfiguration(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btDefaultCollisionConfiguration_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDefaultCollisionConfiguration, normally you should not need this constructor it's intended for low-level usage. */
	public btDefaultCollisionConfiguration(long cPtr, boolean cMemoryOwn) {
		this("btDefaultCollisionConfiguration", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btDefaultCollisionConfiguration_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDefaultCollisionConfiguration obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btDefaultCollisionConfiguration(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btDefaultCollisionConfiguration(btDefaultCollisionConstructionInfo constructionInfo) {
    this(CollisionJNI.new_btDefaultCollisionConfiguration__SWIG_0(btDefaultCollisionConstructionInfo.getCPtr(constructionInfo), constructionInfo), true);
  }

  public btDefaultCollisionConfiguration() {
    this(CollisionJNI.new_btDefaultCollisionConfiguration__SWIG_1(), true);
  }

  public void setConvexConvexMultipointIterations(int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
    CollisionJNI.btDefaultCollisionConfiguration_setConvexConvexMultipointIterations__SWIG_0(swigCPtr, this, numPerturbationIterations, minimumPointsPerturbationThreshold);
  }

  public void setConvexConvexMultipointIterations(int numPerturbationIterations) {
    CollisionJNI.btDefaultCollisionConfiguration_setConvexConvexMultipointIterations__SWIG_1(swigCPtr, this, numPerturbationIterations);
  }

  public void setConvexConvexMultipointIterations() {
    CollisionJNI.btDefaultCollisionConfiguration_setConvexConvexMultipointIterations__SWIG_2(swigCPtr, this);
  }

  public void setPlaneConvexMultipointIterations(int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
    CollisionJNI.btDefaultCollisionConfiguration_setPlaneConvexMultipointIterations__SWIG_0(swigCPtr, this, numPerturbationIterations, minimumPointsPerturbationThreshold);
  }

  public void setPlaneConvexMultipointIterations(int numPerturbationIterations) {
    CollisionJNI.btDefaultCollisionConfiguration_setPlaneConvexMultipointIterations__SWIG_1(swigCPtr, this, numPerturbationIterations);
  }

  public void setPlaneConvexMultipointIterations() {
    CollisionJNI.btDefaultCollisionConfiguration_setPlaneConvexMultipointIterations__SWIG_2(swigCPtr, this);
  }

}
