package com.company.dyanamicArray;

public class DynamicArray {
    public int capacity;
    public int len;
    private int[] arr;

    //   Constructors

    DynamicArray() {
        capacity = 10;
        arr = new int[capacity];
        len = getLen();
    }

    DynamicArray(int num) {
        capacity = num;
        arr = new int[capacity];
        len = getLen();
    }


    // Methods

    private int getLen() {
        len = 0;
        for (int i = 0; i < capacity; i++) {
            if (arr[i] != 0)
                len += 1;
        }
        return len;
    }
    private int getLen(int[] e) {
        int l = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] != 0)
                l += 1;
        }
        return l;
    }
    public int getCapacity() {
        return capacity;
    }

    public int[] getArr() {
        return arr;
    }

    protected int getArr(int num) {
        return arr[num];
    }

    private void swap(int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
    private int[] swich(){
        int[] a = new int[capacity];
        for (int i = 0; i < len; i++) {
            a[i] = arr[i];
        }
        return a;
    }

    public DynamicArray add(int e) {
        if (capacity == len) {
            capacity += 10;
            int[] a = swich();
            a[len++] = e;
            arr = a;
            return this;
        }
        else{
            arr[len++] = e;
            return this;
        }
    }

    public DynamicArray add(int p, int e) {
        if (capacity == len) {
            capacity += 10;
            int[] a = swich();
            for (int i = p; i < len; i++) {
                if (i >= p) {
                    a[i + 1] = arr[i];
                    a[p] = e;
                }
            }
            arr = a;
        } else {
            for (int j = len ,i = len+1; i > p; i--, j--) {
                    swap(j,i);
            }
            arr[p] = e;
        }
        len++;
        return this;
    }

    public DynamicArray add(DynamicArray e) {
        if (capacity - len < e.len) {
            capacity += e.capacity;
            int[] a = swich();
            for (int j = 0, i = len; j < e.len; j++) {
                a[i] = e.getArr(j);
                i++;
            }
            len += e.len;
            arr = a;
        }else {
            for (int j = 0, i = len; j < e.len; j++) {
                arr[i] = e.getArr(j);
                i++;
            }
            len += e.len;
        }
        return this;
    }

    public DynamicArray add(int p, DynamicArray e) {
        if(p < 0 || p > len)
            p  = len;

        if ( capacity - len < e.len )
            capacity += e.capacity;
        len += e.len;
            int[] a = new int[capacity];
            for (int i = 0, j = 0; i < len; i++) {
                if (i == p) {
                    for (; j < e.len; j++, i++) {
                        a[i] = e.arr[j];
                    }
                    i--;
                } else if (i == (p + e.len)) {
                    a[i] = arr[p++];
                } else
                    a[i] = arr[i];
            }
        arr = a;
        return this;
    }

    public DynamicArray add(int[] e) {
        int leng = getLen(e);
        if (capacity - len < leng) {
            this.capacity += e.length;
            int[] a = swich();
            for (int j = 0, i = len; j < leng; j++) {
                a[i++] = e[j];
            }
            arr = a;
        } else {
            for (int j = 0; j < leng; j++) {
                arr[len++] = e[j];
            }
        }
        len = getLen();
        return this;
    }
    public DynamicArray add(int p, int[] e) {
        int leng = getLen(e);

        if ( capacity - len < leng )
            capacity += e.length;

        if(p < 0 || p > len)
            add(e);
        else{
            len += leng;
            int[] a = new int[capacity];
            for (int i = 0, j = 0; i < len; i++) {
                if (i == p) {
                    for (; j < leng; j++, i++) {
                        a[i] = e[j];
                    }
                    i--;
                } else if (i == (p + leng)) {
                    a[i] = arr[p++];
                } else
                    a[i] = arr[i];
            }
            arr = a;
        }
        return this;
    }

    public DynamicArray removeByIndex(int e) {
        if(e < 0 || e > len)
            arr[len - 1] = 0;
        else {
            for (int i = 0; i < len; i++) {
                if (i >= e) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        len--;
        return this;
    }

    public DynamicArray removeByValue(int e) {
        removeByIndex(indexOf(e));
        return this;
    }

    public int indexOf(int e) {
        int inx = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == e)
                inx = i;
        }
        return inx;
    }

    public int lastIndexOf(int e) {
        int inx = indexOf(e);
        return len - (inx + 1);
    }

    public int[] sort() {
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

    public int[] sort(int n) {
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

    public boolean contains(int e) {
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
