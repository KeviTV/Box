/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class btGeneric6DofConstraintData extends BulletBase {
	private long swigCPtr;
	
	protected btGeneric6DofConstraintData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGeneric6DofConstraintData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGeneric6DofConstraintData(long cPtr, boolean cMemoryOwn) {
		this("btGeneric6DofConstraintData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGeneric6DofConstraintData obj) {
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
				DynamicsJNI.delete_btGeneric6DofConstraintData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTypeConstraintData(btTypedConstraintData value) {
    DynamicsJNI.btGeneric6DofConstraintData_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
  }

  public btTypedConstraintData getTypeConstraintData() {
    long cPtr = DynamicsJNI.btGeneric6DofConstraintData_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
  }

  public void setRbAFrame(btTransformFloatData value) {
    DynamicsJNI.btGeneric6DofConstraintData_rbAFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getRbAFrame() {
    long cPtr = DynamicsJNI.btGeneric6DofConstraintData_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setRbBFrame(btTransformFloatData value) {
    DynamicsJNI.btGeneric6DofConstraintData_rbBFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getRbBFrame() {
    long cPtr = DynamicsJNI.btGeneric6DofConstraintData_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setLinearUpperLimit(btVector3FloatData value) {
    DynamicsJNI.btGeneric6DofConstraintData_linearUpperLimit_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLinearUpperLimit() {
    long cPtr = DynamicsJNI.btGeneric6DofConstraintData_linearUpperLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setLinearLowerLimit(btVector3FloatData value) {
    DynamicsJNI.btGeneric6DofConstraintData_linearLowerLimit_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLinearLowerLimit() {
    long cPtr = DynamicsJNI.btGeneric6DofConstraintData_linearLowerLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAngularUpperLimit(btVector3FloatData value) {
    DynamicsJNI.btGeneric6DofConstraintData_angularUpperLimit_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAngularUpperLimit() {
    long cPtr = DynamicsJNI.btGeneric6DofConstraintData_angularUpperLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAngularLowerLimit(btVector3FloatData value) {
    DynamicsJNI.btGeneric6DofConstraintData_angularLowerLimit_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAngularLowerLimit() {
    long cPtr = DynamicsJNI.btGeneric6DofConstraintData_angularLowerLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setUseLinearReferenceFrameA(int value) {
    DynamicsJNI.btGeneric6DofConstraintData_useLinearReferenceFrameA_set(swigCPtr, this, value);
  }

  public int getUseLinearReferenceFrameA() {
    return DynamicsJNI.btGeneric6DofConstraintData_useLinearReferenceFrameA_get(swigCPtr, this);
  }

  public void setUseOffsetForConstraintFrame(int value) {
    DynamicsJNI.btGeneric6DofConstraintData_useOffsetForConstraintFrame_set(swigCPtr, this, value);
  }

  public int getUseOffsetForConstraintFrame() {
    return DynamicsJNI.btGeneric6DofConstraintData_useOffsetForConstraintFrame_get(swigCPtr, this);
  }

  public btGeneric6DofConstraintData() {
    this(DynamicsJNI.new_btGeneric6DofConstraintData(), true);
  }

}
