/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.inversedynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;

public class MultiBodyTree extends BulletBase {
	private long swigCPtr;
	
	protected MultiBodyTree(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new MultiBodyTree, normally you should not need this constructor it's intended for low-level usage. */ 
	public MultiBodyTree(long cPtr, boolean cMemoryOwn) {
		this("MultiBodyTree", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(MultiBodyTree obj) {
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
				InverseDynamicsJNI.delete_MultiBodyTree(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return InverseDynamicsJNI.MultiBodyTree_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    InverseDynamicsJNI.MultiBodyTree_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return InverseDynamicsJNI.MultiBodyTree_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    InverseDynamicsJNI.MultiBodyTree_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return InverseDynamicsJNI.MultiBodyTree_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    InverseDynamicsJNI.MultiBodyTree_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return InverseDynamicsJNI.MultiBodyTree_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    InverseDynamicsJNI.MultiBodyTree_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public MultiBodyTree() {
    this(InverseDynamicsJNI.new_MultiBodyTree(), true);
  }

  public int addBody(int body_index, int parent_index, int joint_type, SWIGTYPE_p_vec3 parent_r_parent_body_ref, SWIGTYPE_p_mat33 body_T_parent_ref, SWIGTYPE_p_vec3 body_axis_of_motion, float mass, SWIGTYPE_p_vec3 body_r_body_com, SWIGTYPE_p_mat33 body_I_body, int user_int, long user_ptr) {
    return InverseDynamicsJNI.MultiBodyTree_addBody(swigCPtr, this, body_index, parent_index, joint_type, SWIGTYPE_p_vec3.getCPtr(parent_r_parent_body_ref), SWIGTYPE_p_mat33.getCPtr(body_T_parent_ref), SWIGTYPE_p_vec3.getCPtr(body_axis_of_motion), mass, SWIGTYPE_p_vec3.getCPtr(body_r_body_com), SWIGTYPE_p_mat33.getCPtr(body_I_body), user_int, user_ptr);
  }

  public void setAcceptInvalidMassParameters(boolean flag) {
    InverseDynamicsJNI.MultiBodyTree_setAcceptInvalidMassParameters(swigCPtr, this, flag);
  }

  public boolean getAcceptInvalidMassProperties() {
    return InverseDynamicsJNI.MultiBodyTree_getAcceptInvalidMassProperties(swigCPtr, this);
  }

  public int finalizeInternal() {
    return InverseDynamicsJNI.MultiBodyTree_finalizeInternal(swigCPtr, this);
  }

  public void printTree() {
    InverseDynamicsJNI.MultiBodyTree_printTree(swigCPtr, this);
  }

  public void printTreeData() {
    InverseDynamicsJNI.MultiBodyTree_printTreeData(swigCPtr, this);
  }

  public int calculateInverseDynamics(SWIGTYPE_p_vecx q, SWIGTYPE_p_vecx u, SWIGTYPE_p_vecx dot_u, SWIGTYPE_p_vecx joint_forces) {
    return InverseDynamicsJNI.MultiBodyTree_calculateInverseDynamics(swigCPtr, this, SWIGTYPE_p_vecx.getCPtr(q), SWIGTYPE_p_vecx.getCPtr(u), SWIGTYPE_p_vecx.getCPtr(dot_u), SWIGTYPE_p_vecx.getCPtr(joint_forces));
  }

  public int calculateMassMatrix(SWIGTYPE_p_vecx q, boolean update_kinematics, boolean initialize_matrix, boolean set_lower_triangular_matrix, SWIGTYPE_p_matxx mass_matrix) {
    return InverseDynamicsJNI.MultiBodyTree_calculateMassMatrix__SWIG_0(swigCPtr, this, SWIGTYPE_p_vecx.getCPtr(q), update_kinematics, initialize_matrix, set_lower_triangular_matrix, SWIGTYPE_p_matxx.getCPtr(mass_matrix));
  }

  public int calculateMassMatrix(SWIGTYPE_p_vecx q, SWIGTYPE_p_matxx mass_matrix) {
    return InverseDynamicsJNI.MultiBodyTree_calculateMassMatrix__SWIG_1(swigCPtr, this, SWIGTYPE_p_vecx.getCPtr(q), SWIGTYPE_p_matxx.getCPtr(mass_matrix));
  }

  public int calculateKinematics(SWIGTYPE_p_vecx q, SWIGTYPE_p_vecx u, SWIGTYPE_p_vecx dot_u) {
    return InverseDynamicsJNI.MultiBodyTree_calculateKinematics(swigCPtr, this, SWIGTYPE_p_vecx.getCPtr(q), SWIGTYPE_p_vecx.getCPtr(u), SWIGTYPE_p_vecx.getCPtr(dot_u));
  }

  public int calculatePositionKinematics(SWIGTYPE_p_vecx q) {
    return InverseDynamicsJNI.MultiBodyTree_calculatePositionKinematics(swigCPtr, this, SWIGTYPE_p_vecx.getCPtr(q));
  }

  public int calculatePositionAndVelocityKinematics(SWIGTYPE_p_vecx q, SWIGTYPE_p_vecx u) {
    return InverseDynamicsJNI.MultiBodyTree_calculatePositionAndVelocityKinematics(swigCPtr, this, SWIGTYPE_p_vecx.getCPtr(q), SWIGTYPE_p_vecx.getCPtr(u));
  }

  public int setGravityInWorldFrame(SWIGTYPE_p_vec3 gravity) {
    return InverseDynamicsJNI.MultiBodyTree_setGravityInWorldFrame(swigCPtr, this, SWIGTYPE_p_vec3.getCPtr(gravity));
  }

  public int numBodies() {
    return InverseDynamicsJNI.MultiBodyTree_numBodies(swigCPtr, this);
  }

  public int numDoFs() {
    return InverseDynamicsJNI.MultiBodyTree_numDoFs(swigCPtr, this);
  }

  public int getBodyOrigin(int body_index, SWIGTYPE_p_vec3 world_origin) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyOrigin(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(world_origin));
  }

  public int getBodyCoM(int body_index, SWIGTYPE_p_vec3 world_com) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyCoM(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(world_com));
  }

  public int getBodyTransform(int body_index, SWIGTYPE_p_mat33 world_T_body) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyTransform(swigCPtr, this, body_index, SWIGTYPE_p_mat33.getCPtr(world_T_body));
  }

  public int getBodyAngularVelocity(int body_index, SWIGTYPE_p_vec3 world_omega) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyAngularVelocity(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(world_omega));
  }

  public int getBodyLinearVelocity(int body_index, SWIGTYPE_p_vec3 world_velocity) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyLinearVelocity(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(world_velocity));
  }

  public int getBodyLinearVelocityCoM(int body_index, SWIGTYPE_p_vec3 world_velocity) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyLinearVelocityCoM(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(world_velocity));
  }

  public int getBodyAngularAcceleration(int body_index, SWIGTYPE_p_vec3 world_dot_omega) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyAngularAcceleration(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(world_dot_omega));
  }

  public int getBodyLinearAcceleration(int body_index, SWIGTYPE_p_vec3 world_acceleration) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyLinearAcceleration(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(world_acceleration));
  }

  public int getParentIndex(int body_index, java.nio.IntBuffer parent_index) {
    assert parent_index.isDirect() : "Buffer must be allocated direct.";
    {
      return InverseDynamicsJNI.MultiBodyTree_getParentIndex(swigCPtr, this, body_index, parent_index);
    }
  }

  public int getJointType(int body_index, SWIGTYPE_p_btInverseDynamicsBullet3__JointType joint_type) {
    return InverseDynamicsJNI.MultiBodyTree_getJointType(swigCPtr, this, body_index, SWIGTYPE_p_btInverseDynamicsBullet3__JointType.getCPtr(joint_type));
  }

  public int getJointTypeStr(int body_index, SWIGTYPE_p_p_char joint_type) {
    return InverseDynamicsJNI.MultiBodyTree_getJointTypeStr(swigCPtr, this, body_index, SWIGTYPE_p_p_char.getCPtr(joint_type));
  }

  public int getParentRParentBodyRef(int body_index, SWIGTYPE_p_vec3 r) {
    return InverseDynamicsJNI.MultiBodyTree_getParentRParentBodyRef(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(r));
  }

  public int getBodyTParentRef(int body_index, SWIGTYPE_p_mat33 T) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyTParentRef(swigCPtr, this, body_index, SWIGTYPE_p_mat33.getCPtr(T));
  }

  public int getBodyAxisOfMotion(int body_index, SWIGTYPE_p_vec3 axis) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyAxisOfMotion(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(axis));
  }

  public int getDoFOffset(int body_index, java.nio.IntBuffer q_offset) {
    assert q_offset.isDirect() : "Buffer must be allocated direct.";
    {
      return InverseDynamicsJNI.MultiBodyTree_getDoFOffset(swigCPtr, this, body_index, q_offset);
    }
  }

  public int getUserInt(int body_index, java.nio.IntBuffer user_int) {
    assert user_int.isDirect() : "Buffer must be allocated direct.";
    {
      return InverseDynamicsJNI.MultiBodyTree_getUserInt(swigCPtr, this, body_index, user_int);
    }
  }

  public int getUserPtr(int body_index, SWIGTYPE_p_p_void user_ptr) {
    return InverseDynamicsJNI.MultiBodyTree_getUserPtr(swigCPtr, this, body_index, SWIGTYPE_p_p_void.getCPtr(user_ptr));
  }

  public int setUserInt(int body_index, int user_int) {
    return InverseDynamicsJNI.MultiBodyTree_setUserInt(swigCPtr, this, body_index, user_int);
  }

  public int setUserPtr(int body_index, long user_ptr) {
    return InverseDynamicsJNI.MultiBodyTree_setUserPtr(swigCPtr, this, body_index, user_ptr);
  }

  public int setBodyMass(int body_index, float mass) {
    return InverseDynamicsJNI.MultiBodyTree_setBodyMass(swigCPtr, this, body_index, mass);
  }

  public int setBodyFirstMassMoment(int body_index, SWIGTYPE_p_vec3 first_mass_moment) {
    return InverseDynamicsJNI.MultiBodyTree_setBodyFirstMassMoment(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(first_mass_moment));
  }

  public int setBodySecondMassMoment(int body_index, SWIGTYPE_p_mat33 second_mass_moment) {
    return InverseDynamicsJNI.MultiBodyTree_setBodySecondMassMoment(swigCPtr, this, body_index, SWIGTYPE_p_mat33.getCPtr(second_mass_moment));
  }

  public int getBodyMass(int body_index, java.nio.FloatBuffer mass) {
    assert mass.isDirect() : "Buffer must be allocated direct.";
    {
      return InverseDynamicsJNI.MultiBodyTree_getBodyMass(swigCPtr, this, body_index, mass);
    }
  }

  public int getBodyFirstMassMoment(int body_index, SWIGTYPE_p_vec3 first_mass_moment) {
    return InverseDynamicsJNI.MultiBodyTree_getBodyFirstMassMoment(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(first_mass_moment));
  }

  public int getBodySecondMassMoment(int body_index, SWIGTYPE_p_mat33 second_mass_moment) {
    return InverseDynamicsJNI.MultiBodyTree_getBodySecondMassMoment(swigCPtr, this, body_index, SWIGTYPE_p_mat33.getCPtr(second_mass_moment));
  }

  public void clearAllUserForcesAndMoments() {
    InverseDynamicsJNI.MultiBodyTree_clearAllUserForcesAndMoments(swigCPtr, this);
  }

  public int addUserForce(int body_index, SWIGTYPE_p_vec3 body_force) {
    return InverseDynamicsJNI.MultiBodyTree_addUserForce(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(body_force));
  }

  public int addUserMoment(int body_index, SWIGTYPE_p_vec3 body_moment) {
    return InverseDynamicsJNI.MultiBodyTree_addUserMoment(swigCPtr, this, body_index, SWIGTYPE_p_vec3.getCPtr(body_moment));
  }

}
