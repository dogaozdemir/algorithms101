package challenges.interviews;


import java.util.Arrays;

public class AmazonArrayMerger {

    public AmazonArrayMerger() {
    }

    public int[] merge(int[] array1, int[] array2) {

        int[] merged =new int[array1.length+array2.length];

      for(int i=0;i<array1.length;i++){
           merged[i]=array1[i];
        }

        for(int j=0;j<array2.length;j++){
          merged[array1.length+j]=array2[j];
      }
      Arrays.sort(merged);
        return merged;
    }











































    /*
    This is the merge method taken from merge sort algorithm.

    My  answer, while close, missed copying the remaining elements from L1 and L2 (even more wrong than
    I originally thought when creating this lesson).

    But you can see the this one beautiful little algorithm handles all test cases Amazon threw at it.
    I will remember this for next time. And so will you :)

     */
    public int[] mergex(int[] L1, int[] L2) {

        int[] merged = new int[L1.length + L2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < L1.length && j < L2.length)
        {
            if (L1[i] <= L2[j])
            {
                merged[k] = L1[i];
                i++;
            }
            else
            {
                merged[k] = L2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L1
        while (i < L1.length)
        {
            System.out.println("Remaining L1 = " + L1[i] + " k = " + k);
            merged[k] = L1[i];
            i++;
            k++;
        }

        // Copy remaining elements of L2
        while (j < L2.length)
        {
            System.out.println("Remaining L2 = " + L2[j] + " k = " + k);
            merged[k] = L2[j];
            j++;
            k++;
        }

        return merged;
    }


























}
