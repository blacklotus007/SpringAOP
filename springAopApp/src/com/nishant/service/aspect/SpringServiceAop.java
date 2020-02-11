package com.nishant.service.aspect;

import org.aopalliance.intercept.Joinpoint;

public class SpringServiceAop {

	public void beforeAdvice(Joinpoint joinpoint) {
		System.out.println("Before Method:");
	}

}
