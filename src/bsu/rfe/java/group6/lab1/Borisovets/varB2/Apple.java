package bsu.rfe.java.group6.lab1.Borisovets.varB2;

public class Apple extends Food 
{ 

	private String size; 
	public Apple(String size) 
	{ 
		
		super("������"); 
		this.size = size; 
		
	} 


	public String getSize() 
	{ 
		
		return size; 
		
	} 

	public void setSize(String size) 
	{ 
		
		this.size = size; 
		
	} 

	public boolean equals(Object arg0) 
	{ 
		
		if (super.equals(arg0)) 
		{
			
			if (!(arg0 instanceof Apple)) return false; 
			return size.equals(((Apple)arg0).size);
			
		} else 
			return false; 
	} 

	public String toString() 
	{ 
		
		return super.toString() + " ������� \"" + size + "\"" + ", ������������ : "
				+ calculateCalories() + "���" ;
		
	}


	@Override
	public int calculateCalories() 
	{
		
		if (size.equals("�����")) return 50;
		if (size.equals("�������")) return 75;
		return 0;
		
	}   
} 
