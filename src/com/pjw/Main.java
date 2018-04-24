package com.pjw;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World!");
	    WordGenerator myGen = new WordGenerator();
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("1.23456789.1");
        int i = 0;
	    for (String str:  myGen.R(inputList)){
	        System.out.println(i+ ":"+str);
	        i++;
        }
    }
}
