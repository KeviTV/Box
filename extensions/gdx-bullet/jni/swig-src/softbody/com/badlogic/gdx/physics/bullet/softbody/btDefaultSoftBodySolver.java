/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.collision.*;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btDefaultSoftBodySolver extends btSoftBodySolver {
	private long swigCPtr;
	
	protected btDefaultSoftBodySolver(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, SoftbodyJNI.btDefaultSoftBodySolver_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDefaultSoftBodySolver, normally you should not need this constructor it's intended for low-level usage. */
	public btDefaultSoftBodySolver(long cPtr, boolean cMemoryOwn) {
		this("btDefaultSoftBodySolver", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(SoftbodyJNI.btDefaultSoftBodySolver_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDefaultSoftBodySolver obj) {
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
				SoftbodyJNI.delete_btDefaultSoftBodySolver(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btDefaultSoftBodySolver() {
    this(SoftbodyJNI.new_btDefaultSoftBodySolver(), true);
  }

  public void optimize(SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t softBodies, boolean forceUpdate) {
    SoftbodyJNI.btDefaultSoftBodySolver_optimize__SWIG_0(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t.getCPtr(softBodies), forceUpdate);
  }

  public void optimize(SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t softBodies) {
    SoftbodyJNI.btDefaultSoftBodySolver_optimize__SWIG_1(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t.getCPtr(softBodies));
  }

  public void copyBackToSoftBodies(boolean bMove) {
    SoftbodyJNI.btDefaultSoftBodySolver_copyBackToSoftBodies__SWIG_0(swigCPtr, this, bMove);
  }

  public void copyBackToSoftBodies() {
    SoftbodyJNI.btDefaultSoftBodySolver_copyBackToSoftBodies__SWIG_1(swigCPtr, this);
  }

  public void copySoftBodyToVertexBuffer(btSoftBody softBody, btVertexBufferDescriptor vertexBuffer) {
    SoftbodyJNI.btDefaultSoftBodySolver_copySoftBodyToVertexBuffer(swigCPtr, this, btSoftBody.getCPtr(softBody), softBody, btVertexBufferDescriptor.getCPtr(vertexBuffer), vertexBuffer);
  }

  public void processCollision(btSoftBody arg0, btCollisionObjectWrapper arg1) {
    SoftbodyJNI.btDefaultSoftBodySolver_processCollision__SWIG_0(swigCPtr, this, btSoftBody.getCPtr(arg0), arg0, btCollisionObjectWrapper.getCPtr(arg1), arg1);
  }

  public void processCollision(btSoftBody arg0, btSoftBody arg1) {
    SoftbodyJNI.btDefaultSoftBodySolver_processCollision__SWIG_1(swigCPtr, this, btSoftBody.getCPtr(arg0), arg0, btSoftBody.getCPtr(arg1), arg1);
  }

}
