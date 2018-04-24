package com.pjw;

import java.util.ArrayList;
import java.util.Arrays;

public class WordGenerator {

    String TestNum1 = "2255.63";
    ArrayList<String> Period = new ArrayList<>(Arrays.asList("-"));
    ArrayList<String> Digit1 = new ArrayList<>(Arrays.asList("1"));
    ArrayList<String> Digit2 = new ArrayList<>(Arrays.asList("A","B","C"));
    ArrayList<String> Digit3 = new ArrayList<>(Arrays.asList("D","E","F"));
    ArrayList<String> Digit4 = new ArrayList<>(Arrays.asList("G","H","I"));
    ArrayList<String> Digit5 = new ArrayList<>(Arrays.asList("J","K","L"));
    ArrayList<String> Digit6 = new ArrayList<>(Arrays.asList("M","N","O"));
    ArrayList<String> Digit7 = new ArrayList<>(Arrays.asList("P","Q","R","S"));
    ArrayList<String> Digit8 = new ArrayList<>(Arrays.asList("T","U","V"));
    ArrayList<String> Digit9 = new ArrayList<>(Arrays.asList("W","X","Y","Z"));

    // Output one possible word encoding per line

    public WordGenerator(){



    }

    // One Line
    // Single Digits are allowed
    // No two consecutive digits can remain unchanged
    public ArrayList<String> R(ArrayList<String> in){
        ArrayList<String> out = new ArrayList<>();
         if (in.size() == 1 && in.get(0).length() == 1){
             if (in.get(0).substring(0,1).equals(".")) out = Period;
            if (in.get(0).substring(0,1).equals("1")) out = Digit1;
             if (in.get(0).substring(0,1).equals("2")) out = Digit2;
             if (in.get(0).substring(0,1).equals("3")) out = Digit3;
             if (in.get(0).substring(0,1).equals("4")) out = Digit4;
             if (in.get(0).substring(0,1).equals("5")) out = Digit5;
             if (in.get(0).substring(0,1).equals("6")) out = Digit6;
             if (in.get(0).substring(0,1).equals("7")) out = Digit7;
             if (in.get(0).substring(0,1).equals("8")) out = Digit8;
             if (in.get(0).substring(0,1).equals("9")) out = Digit9;

         }else{ // split off last one
             if (in.get(0).substring(0,1).equals(".")) out = Period;
             if (in.get(0).substring(0,1).equals("1")) out = Digit1;
             if (in.get(0).substring(0,1).equals("2")) out = Digit2;
             if (in.get(0).substring(0,1).equals("3")) out = Digit3;
             if (in.get(0).substring(0,1).equals("4")) out = Digit4;
             if (in.get(0).substring(0,1).equals("5")) out = Digit5;
             if (in.get(0).substring(0,1).equals("6")) out = Digit6;
             if (in.get(0).substring(0,1).equals("7")) out = Digit7;
             if (in.get(0).substring(0,1).equals("8")) out = Digit8;
             if (in.get(0).substring(0,1).equals("9")) out = Digit9;

             in.set(0, in.get(0).substring(1));
             ArrayList<String> RecurOut = R(in);

             ArrayList<String> CombinedList = new ArrayList<>();

             for(String s1: out){
                 for (String s2: RecurOut){
                     CombinedList.add(s1+s2);
                 }
             }
            out = CombinedList;

         }

return out;

        // First output Every variation of the combination.

        //for(String number: numberList){
            //ArrayList<String> Variations = new ArrayList<String>();
            //int numberOfDigits = number.length();
            //for (int pin = 0; pin < number.length(); pin++){
              //  int digitPin
            //}
            //Variations.add()
                    // Pin First Letter, cycle all other letters



        //}
    }
}
