package com.gentech.methods;

class Array {
    void array(String a[]) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

public class array1 {
    public static void main(String[] args) {
        String b[] = {"gentech", "jsjgug", "hdiss", "khakh"};
        Array a = new Array();
        a.array(b);
    }
}
