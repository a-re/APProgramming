package com.restifo.TowersOfHanoi;
//********************************************************************
//  MazeSearch.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates recursion.
//********************************************************************
public class MazeSearch
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, tries to
   //  solve it, and prints out its final form.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
		  long millis = System.currentTimeMillis();
		  Maze labyrinth = new Maze();
		  if (labyrinth.traverse(0, 0))
		  {
			  System.out.println("The maze was successfully solved");
		  }
		  else
		  {
			  System.out.println("No solution");
		  }
	      System.out.println("Took " + (System.currentTimeMillis() - millis) + "ms");
   	}
}