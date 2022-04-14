package com.crm.comcast.SDET32GitPracticse;

import org.testng.annotations.Test;

public class ClassATest {
	@Test
	public void jenkisTest() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");


		System.out.println("First from jenkins");
		System.out.println("second from jenkins");
		System.out.println("third from jenkins");
	} }