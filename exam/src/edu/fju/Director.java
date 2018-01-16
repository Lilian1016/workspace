package edu.fju;

public class Director extends Manager {
      int red ;
	public Director(String name, int money,int red) {
		super(name, money);
		this.red=red;
	}
	
	@Override
	public void print(){
		System.out.println(name+"\t"+money+"("+red+")");
	}
	

}
