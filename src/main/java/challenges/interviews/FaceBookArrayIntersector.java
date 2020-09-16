package challenges.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FaceBookArrayIntersector {

    public FaceBookArrayIntersector() {
    }


    public ArrayList<Integer> intersect(int[] array1, int[] array2) {
        ArrayList<Integer> collector = new ArrayList<>();

        for(int i:array1){
            for(int j:array2){

                if(i==j){
                    collector.add(i);
                }
            }
        }


        return collector;

    }

    public ArrayList<Integer> intersectOld(int[] array1, int[] array2) {

        List<Integer> firstArray= Arrays.stream(array1)     // IntStream
                .boxed()        // Stream<Integer>
                .collect(Collectors.toList());
        List<Integer> secondArray= Arrays.stream(array2)     // IntStream
                .boxed()        // Stream<Integer>
                .collect(Collectors.toList());
        ArrayList<Integer> collector = new ArrayList<>();

        for(int i=0;i<firstArray.size();i++){
            if(secondArray.contains(firstArray.get(i))){
                collector.add(firstArray.get(i));
            }
        }

        // you try... scroll down to see solution below

        return collector;
    }



























    public ArrayList<Integer> intersectBruteForce(int[] array1, int[] array2) {

        ArrayList<Integer> collector = new ArrayList<>();

        // O(n)
        for (int i : array1) {
            // O(m)
            for (int j : array2) {
                if (i == j) {
                    collector.add(i);
                }
            }
        }

        return collector;
    }

    public ArrayList<Integer> intersectElegant(int[] array1, int[] array2) {

        // array1: i length m
        // array2: i length n

        // loop through both arrays
        // if one element is less than the other ... there can be no intersection
        //  - increment the lower pointer
        //  - if elements are equal collect
        //    - then increment either of the pointers

        int i = 0; int m = array1.length;
        int j = 0; int n = array2.length;

        ArrayList<Integer> collector = new ArrayList<>();

        // O(n + m)
        while (i < m && j < n) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array1[i]) {
                j++;
            } else { // equal
                collector.add(array1[i]);
                i++;
            }
        }

        return collector;
    }

    public ArrayList<Integer> intersectElegantByDoga(int[] array1, int[] array2) {
        ArrayList<Integer> collector = new ArrayList<>();

        int i=0; int array1Length=array1.length;
        int j=0; int array2Length=array2.length;

        while(i<array1Length && j<array2Length){

            if(array1[i]<array2[j]){
                i++;
            }else if(array2[j]<array1[i]){
                j++;
            }else{
                collector.add(array1[i]);
                i++;
            }

        }


        return collector;

    }


}
