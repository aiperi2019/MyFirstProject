package Sample;

import java.util.Arrays;
import java.util.List;

public class J {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 3, 3, 2, 1};

        System.out.println(cutTheSticks(arr));
    }


        static int[] cutTheSticks(int[] arr) {
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

             int count= 0;

            int min2 = Integer.MAX_VALUE;

             int [] arr2 = new int [arr.length];

            for (int i = 0; i < arr.length; i++) {

                  if(arr[i] > min){
                      count++;
                    arr2[i] = arr[i]- min;

                    if(min2 > arr[i]){
                        min2 = arr[i];
                    }

                  }

            }



            return arr;
        }
}
