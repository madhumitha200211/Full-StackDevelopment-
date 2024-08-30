package com.gentech.methods;


class Concat {
    void concat(char b[][]) {
        String conc = ""; // Declare and initialize the variable
        int i = 1; // Index to select the second row
        for (int j = 0; j <= b[i].length - 1; j++) { // Fix the loop to iterate over the selected row
            conc += b[i][j];
        }
        System.out.println(conc);
    }
}

public class example{
    public static void main(String[] args) {
        char b[][] = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        Concat c = new Concat();
        c.concat(b);
    }
}
