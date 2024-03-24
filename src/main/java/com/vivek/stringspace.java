package com.vivek;
//Given a string A and a list of n words B,\
//        find out if A can be segmented into a space-separated sequence of words.
//        Example:
//        Input: n = 12
//        B = { "i", "like", "sam", "sung", "samsung", "mobile", "ice","cream", "icecream", "man", "go", "mango" }
//
//        test case 1:
//        ===============
//        A = "ilike"
//        Output: “i like”
//        Explanation:The string can be segmented as "i like".
//
//
//
//        test case 2:
//        ============================
//        Other Test cases: A = "likei"
//        Output: “like i”
//        Explanation:The string can be segmented as "like i".
//
//
//        test case 3:
//        =====================
//        A = "ilikeilike"
//        Output: “i like i like”
//        Explanation:The string can be segmented as "i like i like".
//
//
//      test case 4:
//      ======================
//      A = "ilikeicecream"
//      Output: "i like icecream"
import java.util.Scanner;

public class stringspace {
    public static void main(String[] args){
        System.out.println("hello world");
//        // Create a Scanner object to read user input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the input string value");
        String input1 = "ilike";
        String input2 = "likei";
        String input3 = "ilikeilike";
        String input4 = "ilikeicecream";

        String[] b = { "i", "like", "sam", "sung", "samsung", "mobile", "ice","cream", "icecream", "man", "go", "mango" };
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        String result1 = separatingWordsWithSpace(b,input1);
        String result2 = separatingWordsWithSpace(b,input2);
        String result3 = separatingWordsWithSpace(b,input3);
        String result4 = separatingWordsWithSpace(b,input4);

        System.out.println(input1+": "+result1.trim());
        System.out.println(input2+": "+result2.trim());
        System.out.println(input3+": "+result3.trim());
        System.out.println(input4+": "+result4.trim());
    }

    private static String separatingWordsWithSpace(String[] b, String input) {
        String result = "";
        String temp = "";
        String best = "";
        int z = 0;
        while(z<input.length()){
            for(int i=z;i<input.length();i++){
                temp = temp + input.charAt(i);
                for(int j=0;j<b.length;j++){
                    if(temp.equals(b[j])){
                        best = temp;
                        z = i+1;
                    }
                }
            }
            if(best.length()==0){
                z=input.length();
            }
            if(best.length()!=0) {
                result = result + best + " ";
                best = "";
                temp = "";
               //System.out.println("intermediate:" + result);
            }
        }

        return result;
    }
}
