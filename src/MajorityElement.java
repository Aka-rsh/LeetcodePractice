public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 4, 3};
        int n = arr.length;
        boolean isFound = false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            // checking the count is max or not
            if (count >= n / 2) {
                System.out.println("Majority Element :" + arr[i]);
                isFound =true;
                break; // Important: without break, same majority element could be printed again
            }
        }
        // Handles edge case where no majority exists — useful for general cases without "guaranteed majority"
        if (!isFound){
            System.out.println("Majority element is not found");
        }
    }
}
