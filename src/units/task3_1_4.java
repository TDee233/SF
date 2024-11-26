package units;

import java.util.Arrays;

public class task3_1_4 {
    public static void main(String[] args) {
        int [] massiv = new int[11];

        for (int b = 0; b < 11; b++){
            massiv[b] = b + 5;
        }

        for (int i = 0; i<massiv.length; i++){
            System.out.println(massiv[i]);
        }

    }
}
