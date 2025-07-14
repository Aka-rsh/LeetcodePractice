public class MovingZero {
        public static void main(String[] args) {
            int[] arr = {2, 0, 3, 1, 0, 0, 6, 7};
            int insertpos = 0;
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[insertpos++] = arr[i];
                }
            }

            while (insertpos < n) {
                arr[insertpos++] = 0;
            }

            // Correct way to print the array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}

// Below code is With Enhanced for Loop -->>

//class Main {
//    public static void main(String[] args) {
//        int[] arr = {2, 0, 3, 1, 0, 0, 6, 7};
//        int insertpos = 0;
//        int n = arr.length;
//
//        // Enhanced for loop used for reading
//        for (int num : arr) {
//            if (num != 0) {
//                arr[insertpos++] = num;
//            }
//        }
//
//        // Fill remaining positions with 0
//        while (insertpos < n) {
//            arr[insertpos++] = 0;
//        }
//
//        // Print the array
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}

