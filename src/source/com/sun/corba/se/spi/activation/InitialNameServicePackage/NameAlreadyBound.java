package com.sun.corba.se.spi.activation.InitialNameServicePackage;


/**
* com/sun/corba/se/spi/activation/InitialNameServicePackage/NameAlreadyBound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macos-aarch64/zulu-src/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, January 13, 2022 6:45:12 AM PST
*/

public final class NameAlreadyBound extends org.omg.CORBA.UserException
{

  public NameAlreadyBound ()
  {
    super(NameAlreadyBoundHelper.id());
  } // ctor


  public NameAlreadyBound (String $reason)
  {
    super(NameAlreadyBoundHelper.id() + "  " + $reason);
  } // ctor

} // class NameAlreadyBound
