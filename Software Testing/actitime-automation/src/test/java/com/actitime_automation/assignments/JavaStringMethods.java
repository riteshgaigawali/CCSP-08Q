/* Assignment question from class on 12-11-24, on Java String methods. */
package com.actitime_automation.assignments;

public class JavaStringMethods {
    public static void main(String[] args) {
        String str = "Hello Cyber Success";

        System.out.println("Output No 1 :-");
        String[] arr = str.split(" ");
        for(String s : arr){
            System.out.println(s);
        }

        System.out.println("Output No 2 :-");
        for(int i = (arr.length-1); i >=0; i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Output No 3 :-");
        if(str.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }else{
            System.out.println("String does not starts with Hello");
        }

    }
}
