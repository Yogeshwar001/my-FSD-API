package com.example.demo;


	public class User {
	    private String name;
	    private int age;
	    private String address;
	    private int salary;

	    // Constructors
	    public User(String name, int age, String address, int salary) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.salary = salary;
	    }

	    public User() {}

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	}
