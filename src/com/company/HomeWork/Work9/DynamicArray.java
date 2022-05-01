package com.company.HomeWork.Work9;

public class DynamicArray {
    private int capacity;
    private int len;
    private int[] arr;

    //   Constructors

    DynamicArray() {
        capacity = 10;
        arr = new int[capacity];
    }

    DynamicArray(int num) {
        capacity = num;
        arr = new int[capacity];
    }


    // Methods

    int getLen() {
        len = 0;
        for (int i = 0; i < capacity; i++) {
            if (arr[i] != 0)
                len += 1;
        }
        return len;
    }

    int getCapacity() {
        return capacity;
    }

    int[] getArr() {
        return arr;
    }

    int getArr(int num) {
        return arr[num];
    }

    void swap(int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    int[] add(int e) {
        if (capacity == len)
            capacity += 10;
        int[] a = new int[capacity + 1];

        for (int i = 0; i < capacity; i++) {

            if (i == len) {
                a[i] = e;
                break;
            }
            a[i] = arr[i];
        }
        len++;
        return arr = a;
    }

//    int[] add( int e, int capacity){
//        if(this.capacity == len)
//            this.capacity += capacity;
//
//        int[] a = new int[capacity +1] ;
//
//        for(int i = 0; i < capacity; i++){
//
//            if(i == len ) {
//                a[i] = e;
//                break;
//            }
//                a[i] = arr[i];
//        }
//        len++;
//        return arr = a;
//    }

    int[] add(int p, int e) {
        if (capacity == len)
            capacity += 10;

        int[] a = new int[capacity + 1];

        for (int i = 0; i < capacity; i++) {
            if (i == capacity - 1) {
                a[p] = e;
                break;
            } else if (i >= p) {
                a[i + 1] = arr[i];
            } else
                a[i] = arr[i];
        }
        len++;
        return arr = a;
    }

    int[] add(DynamicArray e) {
        capacity = len + e.capacity;
        int[] a = new int[capacity];

        for (int i = 0; i < len; i++) {
            a[i] = arr[i];
        }
        int i = len;
        for (int j = 0; j < e.getLen(); j++) {
            a[i] = e.getArr(j);
            i++;
            if (j == e.getLen() - 1)
                break;
        }
        return arr = a;
    }

    int[] add(int p, DynamicArray e) {
        capacity = len + e.capacity;
        int le = len + e.getLen();
        int[] a = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            if (i == p) {
                for (int j = 0; j < e.getLen(); j++) {
                    a[i] = e.getArr(j);
                    i++;
                    if (j == e.getLen() - 1)
                        break;
                }
                i =  p + e.getLen() ;

                for (int k = p; k < len; k++) {
                    a[i] = arr[k];
                    ++i;
                    if(k == len -1)
                        break;
                }
            }
            else
                a[i] = arr[i];

            if (i >= le)
                break;
        }
        return arr = a;
    }

    int[] add(int[] e) {
        capacity = len + e.length;
        int[] a = new int[capacity];

        for (int i = 0; i < len; i++) {
            a[i] = arr[i];
        }
        int i = len;
        for (int j = 0; j < e.length; j++) {
            a[i] = e[j];
            i++;
            if (j == e.length - 1)
                break;
        }
        return arr = a;
    }
    int[] add(int p, int[] e) {
        capacity = len + e.length;
        int[] a = new int[capacity];
        int l = 0;
        for (int i = 0; i < capacity; i++) {
            if (i == p) {
                for (int j = 0; j < e.length; j++) {
                    a[i] = e[j];
                    i++;
                    if(e[j] > 0)
                        l += 1;
                    if (j == e.length - 1)
                        break;
                }
                i =  p + l ;

                for (int k = p; k < len; k++) {
                    a[i] = arr[k];
                    ++i;
                    if(k == len -1)
                        break;
                }
            }
            else
                a[i] = arr[i];

            if (i >= (len + l))
                break;
        }

        return arr = a;
    }

    int[] removeByIndex(int e) {
        int a[] = new int[capacity];
        for (int i = 0; i < len; i++) {
            if (i >= e) {
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }

    int[] removeByValue(int e) {
        int inx = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == e)
                inx = i;
        }
        removeByIndex(inx);
        return arr;
    }

    int indexOf(int e) {
        int inx = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == e)
                inx = i;
        }
        return inx;
    }

    int lastIndexOf(int e) {
        int inx = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == e)
                inx = i;
        }
        return len - (inx + 1);
    }

    int[] sort() {
        int z = arr[0];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[j] > z) {
                    swap(i, j);
                    z = arr[j];
                }
            }
            z = arr[len - 1];
        }
        return arr;
    }

    int[] sort(int n) {
        int z;
        for (int i = 0; i < len; i++) {
            z = arr[i];
            for (int j = 0; j < len; j++) {
                if (arr[j] < z) {
                    z = arr[j];
                    swap(j, i);
                }
            }
        }
        return arr;
    }

    boolean contains(int e) {
        boolean a = false;
        for (int i = 0; i < len; i ++){
            if(arr[i] == e)
                a = true;
        }
        return  a;
    }

    public static void main(String[] args) {


    }
}
