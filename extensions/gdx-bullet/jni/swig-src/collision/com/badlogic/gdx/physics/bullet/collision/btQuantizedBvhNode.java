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

public class btQuantizedBvhNode extends BulletBase {
	private long swigCPtr;
	
	protected btQuantizedBvhNode(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btQuantizedBvhNode, normally you should not need this constructor it's intended for low-level usage. */ 
	public btQuantizedBvhNode(long cPtr, boolean cMemoryOwn) {
		this("btQuantizedBvhNode", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btQuantizedBvhNode obj) {
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
				CollisionJNI.delete_btQuantizedBvhNode(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btQuantizedBvhNode_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btQuantizedBvhNode_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btQuantizedBvhNode_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btQuantizedBvhNode_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btQuantizedBvhNode_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btQuantizedBvhNode_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btQuantizedBvhNode_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btQuantizedBvhNode_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void setQuantizedAabbMin(int[] value) {
    CollisionJNI.btQuantizedBvhNode_quantizedAabbMin_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMin() {
    return CollisionJNI.btQuantizedBvhNode_quantizedAabbMin_get(swigCPtr, this);
  }

  public void setQuantizedAabbMax(int[] value) {
    CollisionJNI.btQuantizedBvhNode_quantizedAabbMax_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMax() {
    return CollisionJNI.btQuantizedBvhNode_quantizedAabbMax_get(swigCPtr, this);
  }

  public void setEscapeIndexOrTriangleIndex(int value) {
    CollisionJNI.btQuantizedBvhNode_escapeIndexOrTriangleIndex_set(swigCPtr, this, value);
  }

  public int getEscapeIndexOrTriangleIndex() {
    return CollisionJNI.btQuantizedBvhNode_escapeIndexOrTriangleIndex_get(swigCPtr, this);
  }

  public boolean isLeafNode() {
    return CollisionJNI.btQuantizedBvhNode_isLeafNode(swigCPtr, this);
  }

  public int getEscapeIndex() {
    return CollisionJNI.btQuantizedBvhNode_getEscapeIndex(swigCPtr, this);
  }

  public int getTriangleIndex() {
    return CollisionJNI.btQuantizedBvhNode_getTriangleIndex(swigCPtr, this);
  }

  public int getPartId() {
    return CollisionJNI.btQuantizedBvhNode_getPartId(swigCPtr, this);
  }

  public btQuantizedBvhNode() {
    this(CollisionJNI.new_btQuantizedBvhNode(), true);
  }

}
