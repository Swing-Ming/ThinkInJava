package com.day.session;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class SessionDemo {

	public static void main(String[] args) throws NamingException {

		Context con = InitialContext.doLookup("");

	}

}
