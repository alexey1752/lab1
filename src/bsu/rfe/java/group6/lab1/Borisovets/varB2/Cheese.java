package bsu.rfe.java.group6.lab1.Borisovets.varB2;

public class Cheese extends Food { 

	public Cheese() { 
		super("���"); 
	} 

	public int calculateCalories() {
		return 600;
	}
	public String toString() { 
		return super.toString() + ", ������������ : "
				+ calculateCalories() + " ���" ; 
	}
} 

