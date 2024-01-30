public class Assignment1 {
    public static void main(String[] args){
        int[] arr1 = {0, 1, 2, 3, 4, 5};
        int[][] arr2 = {{00,01,02,03},
                        {10,11,12,13},
                        {20,21,22,23}};
        //I made the values similar to index of each.
        //Task 1:
        int max = arr1[0];
        for(int x : arr1){
            if(x > max){
                max = x; }} //Checking Max value for arr1
        for(int[] row : arr2){
            for(int element : row){
                if(element > max){
                    max = element;}}
        } //Checking Max value for arr2 compared to arr1..
        System.out.println("The maximum value for arr1 & arr2 = " + max);

        //Task 2:
        int min = arr1[0];
        for(int x : arr1){
            if(x < min){
                min = x; }} //Checking min value for arr1
        for(int[] row : arr2){
            for(int element : row){
                if(element < min){
                    min = element;}}
        } //Checking min value for arr2 compared to arr1..
        System.out.println("The minimum value for arr1 & arr2 = " + min);

        System.out.println();
        //Task 3, 4:
        int sum1 = 0;
        double avg1;
        for(int x : arr1){
            sum1 += x;
        }
        avg1 = (double) sum1 / arr1.length;
        int sum2 = 0;
        double avg2;
        for(int[] row : arr2){
            for(int element : row){
                sum2 += element;

            }
        }
        avg2 = (double) sum2 / (arr2[0].length + arr2[1].length + arr2[2].length);
        System.out.println("The sum of arr1 elements = " + sum1 +
                           "\nAnd its average is: " + avg1 +
                           "\nThe sum of arr2 = " + sum2 +
                           "\nAnd its average is: " + avg2);

        //Task 5:
        System.out.println("\nEven values in arr1 & arr2 is: ");
        for(int x : arr1){
            System.out.print((x % 2 == 0? x + "\t" : ""));
        }
        for(int[] row : arr2){
            for(int y : row){
                System.out.print((y % 2 == 0? y + "\t" : ""));
            }
        }

        //Task 6:
        System.out.println("\nOdd values in arr1 & arr2 is: ");
        for(int x : arr1){
            System.out.print((x % 2 != 0? x + "\t" : ""));
        }
        for(int[] row : arr2){
            for(int y : row){
                System.out.print((y % 2 != 0? y + "\t" : ""));
            }
        }

        System.out.println();
        //Task 7:
        System.out.println("\nSquare values of arr1: ");
        for(int x : arr1){
            System.out.print(x * x + "\t");
        }
        System.out.println("\nSquare values of arr2: ");
        for(int[] row : arr2){
            for(int y : row){
                System.out.print((int)Math.pow(y, 2) + "\t");
            }
        }

        System.out.println();
        //Task 8:
        int[] arr3 = {10, 10, 20, 5, 100, 2};
        int[] arr4 = new int[6];
        System.out.println("\nThe sum of arr1 and arr3 elements stored i arr4:");
        for(int i = 0; i < arr1.length; i++){
            arr4[i] = arr1[i] + arr3[i];
            System.out.print(arr4[i] + "\t");
        }

        //Task 9:
        int[][] arr5 = {{1,1,2},{2,5,2},{4,4,4},{3,0,0}};
        int[][] arr6 = new int[3][3];
        for(int i = 0; i < arr2.length - 1; i++){
            for(int j = 0; j < arr5[0].length - 1; j++){
                for(int k = 0; k < arr2[0].length /*Or arr5.length*/ - 1; k++){ // (since arr2 columns equal arr5 rows)
                    arr6[i][j] += arr2[i][k] * arr5[k][j];
                }
            }
        }
        System.out.print("\nThe multiplication of arr2 & arr5 stored in arr6:");
        for(int[] row : arr6){
            System.out.println("\n");
            for(int x : row){
                System.out.print(x + "\t\t");
            }
        }
    }
}
