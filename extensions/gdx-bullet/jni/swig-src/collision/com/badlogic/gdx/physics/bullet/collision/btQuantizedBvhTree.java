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

public class btQuantizedBvhTree extends BulletBase {
	private long swigCPtr;
	
	protected btQuantizedBvhTree(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btQuantizedBvhTree, normally you should not need this constructor it's intended for low-level usage. */ 
	public btQuantizedBvhTree(long cPtr, boolean cMemoryOwn) {
		this("btQuantizedBvhTree", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btQuantizedBvhTree obj) {
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
				CollisionJNI.delete_btQuantizedBvhTree(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btQuantizedBvhTree() {
    this(CollisionJNI.new_btQuantizedBvhTree(), true);
  }

  public void build_tree(GIM_BVH_DATA_ARRAY primitive_boxes) {
    CollisionJNI.btQuantizedBvhTree_build_tree(swigCPtr, this, GIM_BVH_DATA_ARRAY.getCPtr(primitive_boxes), primitive_boxes);
  }

  public void quantizePoint(java.nio.IntBuffer quantizedpoint, Vector3 point) {
    assert quantizedpoint.isDirect() : "Buffer must be allocated direct.";
    {
      CollisionJNI.btQuantizedBvhTree_quantizePoint(swigCPtr, this, quantizedpoint, point);
    }
  }

  public boolean testQuantizedBoxOverlapp(int node_index, java.nio.IntBuffer quantizedMin, java.nio.IntBuffer quantizedMax) {
    assert quantizedMin.isDirect() : "Buffer must be allocated direct.";
    assert quantizedMax.isDirect() : "Buffer must be allocated direct.";
    {
      return CollisionJNI.btQuantizedBvhTree_testQuantizedBoxOverlapp(swigCPtr, this, node_index, quantizedMin, quantizedMax);
    }
  }

  public void clearNodes() {
    CollisionJNI.btQuantizedBvhTree_clearNodes(swigCPtr, this);
  }

  public int getNodeCount() {
    return CollisionJNI.btQuantizedBvhTree_getNodeCount(swigCPtr, this);
  }

  public boolean isLeafNode(int nodeindex) {
    return CollisionJNI.btQuantizedBvhTree_isLeafNode(swigCPtr, this, nodeindex);
  }

  public int getNodeData(int nodeindex) {
    return CollisionJNI.btQuantizedBvhTree_getNodeData(swigCPtr, this, nodeindex);
  }

  public void getNodeBound(int nodeindex, btAABB bound) {
    CollisionJNI.btQuantizedBvhTree_getNodeBound(swigCPtr, this, nodeindex, btAABB.getCPtr(bound), bound);
  }

  public void setNodeBound(int nodeindex, btAABB bound) {
    CollisionJNI.btQuantizedBvhTree_setNodeBound(swigCPtr, this, nodeindex, btAABB.getCPtr(bound), bound);
  }

  public int getLeftNode(int nodeindex) {
    return CollisionJNI.btQuantizedBvhTree_getLeftNode(swigCPtr, this, nodeindex);
  }

  public int getRightNode(int nodeindex) {
    return CollisionJNI.btQuantizedBvhTree_getRightNode(swigCPtr, this, nodeindex);
  }

  public int getEscapeNodeIndex(int nodeindex) {
    return CollisionJNI.btQuantizedBvhTree_getEscapeNodeIndex(swigCPtr, this, nodeindex);
  }

  public BT_QUANTIZED_BVH_NODE get_node_pointer(int index) {
    long cPtr = CollisionJNI.btQuantizedBvhTree_get_node_pointer__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new BT_QUANTIZED_BVH_NODE(cPtr, false);
  }

  public BT_QUANTIZED_BVH_NODE get_node_pointer() {
    long cPtr = CollisionJNI.btQuantizedBvhTree_get_node_pointer__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new BT_QUANTIZED_BVH_NODE(cPtr, false);
  }

}
