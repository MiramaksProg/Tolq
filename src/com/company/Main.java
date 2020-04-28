package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = {-5, -4 , -3 , -2 -1, 1 , 2 , 3 , 4 ,5 };
        for (int i = 0; i <array.length; i++) {
            int k = array[i];
            int y = (int) ((16.5 * k) + (9 * k) - (12.5 * k));
            System.out.println(y);

        }
    }
}
