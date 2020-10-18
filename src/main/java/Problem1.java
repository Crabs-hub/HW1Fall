
public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int low = 0;
        int high = data.length - 1;


        while (low <= high){
            int mid = (low + high)/2;
            if(target > data[mid]){
                low = mid + 1;
            }
            else if (target < data[mid]){
                high = mid - 1;
            }
            else if ( target == data[mid]){
                return mid;
            }
        }
        return -1; // Place holder   
    }
}