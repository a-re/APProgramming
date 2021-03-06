package com.restifo.Elevens.Activity3;
import java.lang.Math;

import static java.lang.System.out;
public class Shuffler {
    private static final int SHUFFLE_COUNT = 5;
    private static final int VALUE_COUNT = 10;

    public static void main(String[] args) 
    {
        out.printf("Results of %d consecutive perfect shuffles:\n", SHUFFLE_COUNT);
        int[] values1 = new int[VALUE_COUNT];
        for (int i = 0; i < values1.length; i++) 
        {
            values1[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) 
        {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++)
            {
                out.printf("%2d", values1[k]);
            }
            out.println();
        }
        
        out.println();
        out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) 
        {
            values2[i] = i;
        }
        
        for (int j = 1; j <= SHUFFLE_COUNT; j++) 
        {
            selectionShuffle(values2);
            out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) 
            {
                out.printf(" %2d", values2[k]);
            }
            out.println();
        }
        out.println();
    }

	public static void perfectShuffle(int[] values) 
    {
        int[] half1 = new int[VALUE_COUNT / 2];
        int[] half2 = new int[VALUE_COUNT - VALUE_COUNT / 2];

        for( int i = 0; i < VALUE_COUNT / 2; i++ )
        {
            half1[i] = values[i];
        }
        
        for( int i = 0; i < VALUE_COUNT - VALUE_COUNT / 2; i++ ) 
        {
            half2[i] = values[i + VALUE_COUNT / 2];
        }

        for( int i = 0; i < VALUE_COUNT / 2; i++ ) 
        {
            values[2 * i] = half2[i];
            values[2 * i + 1] = half1[i];
        }
    }

    public static void selectionShuffle(int[] values) 
    {
        for(int k = VALUE_COUNT - 1; k >= 0; k--) 
        {
            int r = (int)(Math.random() * k);
            int tmp = values[r];
            values[r] = values[k];
            values[k] = tmp;
        }
    }
}