package com.corejava;

public class MethodDemo {

	public static void main(String[] args) {
		// Created objects
		MethodDemo d = new MethodDemo();
		String name = d.getData();
		String name2 = getUserData();
		System.out.println(name);
		System.out.println(name2);
	}
	//created class
	public String getData()
	{
		System.out.println("Hi");
		return "I am going to learn Python";
	}
	//Access modifier - static - move the method to class level// need no to call method, call the class directly
	public static String getUserData()
	{
		System.out.println("Hello");
		return "I am going to learn TOSCA";
	}
}