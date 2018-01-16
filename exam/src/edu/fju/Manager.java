package edu.fju;

public class Manager extends Employee{

	public Manager(String name, int money) {
		super(name, money);
		super.money=money+5000;
	}

}
