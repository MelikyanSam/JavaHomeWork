package com.company.HomeWork.Work8;

public class VowelsInString {
    char a = 'a';
    char e = 'e';
    char i = 'i';
    char o = 'o';
    char u = 'u';
    String s;

    VowelsInString(String s){
        this.s = s;
    }

    int vowels(){
        int count = 0;
        for (int j = 0; j < s.length(); j++){
            if(s.charAt(j) == a || s.charAt(j) == e || s.charAt(j) == i || s.charAt(j) == o || s.charAt(j) == u)
                count += 1;
        }
        return count;
    }


    public static void main(String[] args) {
        VowelsInString one = new VowelsInString("w3resource");
        System.out.println("Number of  Vowels in the string: " + one.vowels());
    }
}
