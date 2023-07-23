package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/PolicyFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macos-aarch64/zulu-src/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, January 13, 2022 6:45:12 AM PST
*/


/**
   * Enables policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>.
   * <p>
   * A portable ORB service implementation registers an instance of the 
   * <code>PolicyFactory</code> interface during ORB initialization in order 
   * to enable its policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>. The POA is required to preserve 
   * any policy which is registered with <code>ORBInitInfo</code> in this 
   * manner.
   *
   * @see ORBInitInfo#register_policy_factory
   */
public interface PolicyFactoryOperations 
{

  /**
       * Returns an instance of the appropriate interface derived from 
       * <code>CORBA.Policy</code> whose value corresponds to the 
       * specified any. 
       * <p>
       * The ORB calls <code>create_policy</code> on a registered 
       * <code>PolicyFactory</code> instance when 
       * <code>CORBA.ORB.create_policy</code> is called for the 
       * <code>PolicyType</code> under which the <code>PolicyFactory</code> has 
       * been registered. The <code>create_policy</code> operation then 
       * returns an instance of the appropriate interface derived from 
       * <code>CORBA.Policy</code> whose value corresponds to the specified 
       * any. If it cannot, it shall throw an exception as described for 
       * <code>CORBA.ORB.create_policy</code>. 
       * 
       * @param type An int specifying the type of policy being created. 
       * @param value An any containing data with which to construct the 
       *     <code>CORBA.Policy</code>. 
       * @return A <code>CORBA.Policy<code> object of the specified type and 
       *     value.
       */
  org.omg.CORBA.Policy create_policy (int type, org.omg.CORBA.Any value) throws org.omg.CORBA.PolicyError;
} // interface PolicyFactoryOperations
