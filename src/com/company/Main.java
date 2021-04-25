package com.company;

public class Main {

    public static void main(String[] args) {

        String result1 = person(25,10);
        System.out.println(result1);
        String result2 = person(30,15);
        System.out.println(result2);
        String result3 = person(15,30);
        System.out.println(result3);
        // write your code here
    }
    public static String person(int age, int temp){
        if ((age >20 && age <45) && (temp >-20 && temp <30)){
            return ("Можно идти гулять");
        } else if((age<20) && (temp >0 && temp <28)) {
            return ("Можно идти гулять");
        } else if((age >45) && (temp > -10 && temp <25)){
            return ("Можно идти гулять");
        }else{
            return ("Оставайтесь дома");
        }





    }
}
