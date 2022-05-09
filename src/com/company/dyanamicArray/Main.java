package com.company.dyanamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray one = new DynamicArray(0);

        DynamicArray two = new DynamicArray();

        one.add(12);
        one.add(102);
        one.add(62);
        one.add(1082);
//        one.add(12);
//        one.add(102);
//        one.add(62);
//        one.add(1082);
//        one.add(12);
//        one.add(102);
//        one.add(62);
//        one.add(1082);

        two.add(451);
        two.add(202);
        two.add(30);

        one.add(2, 98);
//        one.add(8, 898);

//        one.add(two);
//        one.add(two);

//        one.add(1,two);
//        one.add(9,two.getArr());

//        one.add(two);

//        one.add(two.getArr());

//        one.removeByIndex(0);
//        one.removeByValue(92);

//        System.out.println(one.indexOf(98) + " *");
//        System.out.println(one.lastIndexOf(62) + " *");

//        one.sort();
//        one.sort(1);

//        one.removeByValue(102);
        for (int i = 0; i < one.getCapacity(); i++) {
            System.out.println(one.getArr(i));
        }
        System.out.println("-------------------------");
        System.out.println(one.getCapacity());
        System.out.println(one.len);

//        System.out.println(one.contains(200));
    }
}
