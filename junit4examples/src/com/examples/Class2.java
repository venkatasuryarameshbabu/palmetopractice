package com.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Class2 {
@Test
public void test1()
{
	Class1 c=new Class1();
	assertEquals("Hello message1",c.message1());
}
}
