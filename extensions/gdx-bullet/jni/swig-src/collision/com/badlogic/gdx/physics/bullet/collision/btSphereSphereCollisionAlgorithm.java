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

public class btSphereSphereCollisionAlgorithm extends btActivatingCollisionAlgorithm {
	private long swigCPtr;
	
	protected btSphereSphereCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btSphereSphereCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSphereSphereCollisionAlgorithm, normally you should not need this constructor it's intended for low-level usage. */
	public btSphereSphereCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
		this("btSphereSphereCollisionAlgorithm", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btSphereSphereCollisionAlgorithm_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btSphereSphereCollisionAlgorithm obj) {
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
				CollisionJNI.delete_btSphereSphereCollisionAlgorithm(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btSphereSphereCollisionAlgorithm(btPersistentManifold mf, btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper col0Wrap, btCollisionObjectWrapper col1Wrap) {
    this(CollisionJNI.new_btSphereSphereCollisionAlgorithm__SWIG_0(btPersistentManifold.getCPtr(mf), mf, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(col0Wrap), col0Wrap, btCollisionObjectWrapper.getCPtr(col1Wrap), col1Wrap), true);
  }

  public btSphereSphereCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci) {
    this(CollisionJNI.new_btSphereSphereCollisionAlgorithm__SWIG_1(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci), true);
  }

  static public class CreateFunc extends btCollisionAlgorithmCreateFunc {
  	private long swigCPtr;
  	
  	protected CreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, CollisionJNI.btSphereSphereCollisionAlgorithm_CreateFunc_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CreateFunc, normally you should not need this constructor it's intended for low-level usage. */
  	public CreateFunc(long cPtr, boolean cMemoryOwn) {
  		this("CreateFunc", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(CollisionJNI.btSphereSphereCollisionAlgorithm_CreateFunc_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CreateFunc obj) {
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
  				CollisionJNI.delete_btSphereSphereCollisionAlgorithm_CreateFunc(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public CreateFunc() {
      this(CollisionJNI.new_btSphereSphereCollisionAlgorithm_CreateFunc(), true);
    }
  
  }

}
