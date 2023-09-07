package week1.day1assignment;

public class Car {
	public void applyBreak() {
		System.out.println("Applied break");
	}
	public void soundHorn() {
		System.out.println("Sound horn");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyBreak();
		c.soundHorn();
	}
	}
