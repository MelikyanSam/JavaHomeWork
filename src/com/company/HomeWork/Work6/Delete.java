package com.company.HomeWork.Work6;

public class Delete {
    static int find(int a[], int e){
        int w = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == e) {
                w += i;
                break;
            }
        }
        return w;
    }
    static int[] delete(int a[], int e){

        int arr[] = new int [a.length-1];
        int inx = find(a,e);

        for (int i = 0; i< arr.length; i++){
            if (i == arr.length)
                break;
            else if (i >= inx)
                arr[i] = a[i + 1];
            else
                arr[i] = a[i];
        }
            return arr;
    }

    public static void main(String[] args) {
        int array[] = {5, 8, 12, 30, 2, 10 };


        array = delete(array, 30);

        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }
}
