package com.company.HomeWork.Work6;

public class Add {
    static int[] add(int a[], int e){
        int arr[] = new int [a.length + 1];
        for(int i = 0; i < arr.length; i++){
           if(i == arr.length-1) {
               arr[i] = e;
               break;
           }
           arr[i] = a[i];
        }
        return arr;
    }


    String[] add(String a[], String e){
        String arr[] = new String [a.length + 1];
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1) {
                arr[i] = e;
                break;
            }
            arr[i] = a[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int array[] = {5, 8, 12, 30, 2, 10 };

        array = add(array, 400);
        array = add(array, 4120);


        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
