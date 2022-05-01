package com.company.HomeWork.Work8;

public class WordsInSring {
    String s;
    WordsInSring(String s){
        this.s = s;

    }

   int wordsNum(){
        String arr;
        int count = 0;
        char spc = ' ';
        for (int j = 1; j < s.length(); j++){
            if(s.charAt(j - 1) == spc && s.charAt(j) == spc || s.length() == j+1)
                continue;
            else if(s.charAt(j - 1) != spc && s.charAt(j) == spc)
                count += 1;
        }
        return count;
    }


    public static void main(String[] args) {
        WordsInSring one = new WordsInSring("The  quick brown fox jumps over  the lazy dog.  ");
        System.out.println("Number of words in the string: " + "." + one.wordsNum() + ".");

    }
}
