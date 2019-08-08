package Sample;

public class Jj {
    public static void main(String[] args) {
        int arr [] =  {1, 2, 3, 4, 5};

       miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int big = 0;
        int small = 0;

        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                continue;
            } else {
                System.out.println(arr[i]);
                small += arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(min == arr[i]){
                continue;
            }else{

                big += arr[i] ;
            }
        }



        System.out.println("min "+ min);
        System.out.println("max "+max);

        System.out.println(small +" "+big);
    }



}
