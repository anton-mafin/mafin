package Juice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ju 
{
	private Scanner scan;
	private Set<Fruits> set;
	private Set<Fruits> SortedSet;
	Ju(String filename) throws FileNotFoundException
	{
		scan = new Scanner( new FileInputStream (filename));
		set = new LinkedHashSet<Fruits>();
		SortedSet = new TreeSet<Fruits>();
		while(scan.hasNext())
		{
			Fruits newFruits = new Fruits(scan.next());
			set.add(newFruits);
			SortedSet.add(newFruits);
		}
		scan.close();
	}
	
	
	
	
}
