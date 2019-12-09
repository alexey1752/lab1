package bsu.rfe.java.group6.lab1.Borisovets.varB2;

import java.util.Arrays;

public class MainApplication 
{
	static boolean sort = false;
	static boolean bCalories = false;
	public static void main(String[] args)
	{
		
		Food[] breakfast = new Food[20];
		int i= 0;
		for (String arg: args) 
		{       
			
			if(!arg.startsWith("-")) continue;
			String[] parts = arg.split("/");
			if (parts[0].equals("-Cheese")) 
			{ 
				
				breakfast[i] = new Cheese();
				
			} 
			else 
				if (parts[0].equals("-Apple")) 
				{ 
					
					breakfast[i] = new Apple(parts[1]); 
					
				} 
			if (parts[0].equals("-Pie")) 
			{ 
				
				breakfast[i] = new Pie(parts[1]);
				
			} 
			
			if (parts[0].equals("-sort")) 
			{
				
				sort = true; 
				
			} 
			if (parts[0].equals("-calories")) 
			{ 
				
				bCalories = true;
				
			} 
			
			i++; 
			
		}   

		if(sort) 
		{
			
			Arrays.sort(breakfast, new FoodComparator());
			
		}

		int iCalories = 0;
		
		System.out.println("Ваш завтрак:");
		
		for(Food j:breakfast) 
		{
			
			if(j == null) break;
			System.out.println(j);
			iCalories += j.calculateCalories();
			
		}
		
		if(bCalories) System.out.println("Общая калорийность завтрака " + iCalories + " кал");
		
		System.out.flush();

	}

}
