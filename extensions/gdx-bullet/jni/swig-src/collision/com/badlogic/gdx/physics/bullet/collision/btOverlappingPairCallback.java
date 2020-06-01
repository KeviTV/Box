/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btOverlappingPairCallback extends BulletBase {
	private long swigCPtr;
	
	protected btOverlappingPairCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btOverlappingPairCallback, normally you should not need this constructor it's intended for low-level usage. */ 
	public btOverlappingPairCallback(long cPtr, boolean cMemoryOwn) {
		this("btOverlappingPairCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btOverlappingPairCallback obj) {
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
				CollisionJNI.delete_btOverlappingPairCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btBroadphasePair addOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
	return btBroadphasePair.internalTemp(CollisionJNI.btOverlappingPairCallback_addOverlappingPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1), false);
}

  public long removeOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1, btDispatcher dispatcher) {
    return CollisionJNI.btOverlappingPairCallback_removeOverlappingPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void removeOverlappingPairsContainingProxy(btBroadphaseProxy proxy0, btDispatcher dispatcher) {
    CollisionJNI.btOverlappingPairCallback_removeOverlappingPairsContainingProxy(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

}
