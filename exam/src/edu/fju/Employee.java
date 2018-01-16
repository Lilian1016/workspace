package edu.fju;

public class Employee {
  String name;
   int money;
  public Employee(String name,int money){
	  this.money=money;
	  this.name=name;
  }
    public void print(){
    	System.out.println(name+"\t"+money);
    }
  
  
}
