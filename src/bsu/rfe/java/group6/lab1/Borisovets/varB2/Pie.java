package bsu.rfe.java.group6.lab1.Borisovets.varB2;

public class Pie extends Food
{
	
	String flavour;
	Pie(String flavour)
	{
		
		super("�����");
		this.flavour = flavour;
		
	}
	
	public int calculateCalories() 
	{
		
		if (flavour.equals("����������")) return 150;
		if (flavour.equals("��������")) return 110;
		if (flavour.equals("��������")) return 120;
		return 0;
		
	}
	
	public boolean equals(Object arg0) 
	{
		
		if(!super.equals(arg0)) return false;
		if(!(arg0 instanceof Pie)) return false;
		return this.flavour.equals(((Pie)arg0).flavour);
		
	}
	
	public String toString() 
	{
		
		return super.toString() + " \"" + flavour + "\"" + ", ������������ : "
	+ calculateCalories() + "���" ;
		
	}
	
}
