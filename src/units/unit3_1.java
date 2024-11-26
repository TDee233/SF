package units;

import java.util.Arrays;

public class unit3_1 {
    public static void main(String[] args) {
        int [] numms = {15,32,31,44,25,86,700,78,99,190};
        int [] nums = new int[10];




        String [] m1 = {"sdf", "asdd", "wwrt" };


        int [][] dvumerny = {
                {22,33,5,4,442,627},
                {31,83,87},
                {322,5455,76}
        };

        int [] dvumerny1 = dvumerny [0];
        int [] dvumerny2 = dvumerny [1];

        System.out.println(dvumerny1);
////        for (int i = 0; i<numms.length; i++){
////            System.out.println(numms[i]);
//        }
        int [][] copy = Arrays.copyOf(dvumerny, dvumerny.length);
        System.out.println(Arrays.toString(numms));

        String vivod = Arrays.toString(m1);
        System.out.println(vivod);

        Arrays.stream(dvumerny).map(Arrays::toString).forEach(System.out::println);

    }
}
