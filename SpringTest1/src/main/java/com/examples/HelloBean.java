package com.examples;

public class HelloBean {
private String name;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public HelloBean()
{

}
public void sayHello()
{
System.out.println("hello"+name);
}

}