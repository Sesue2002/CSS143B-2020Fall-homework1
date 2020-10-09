public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int mid;
        int l = data.length;
        mid = l / 2;

        if (data.length == 0){
            return -1; // Place holder
        }
        if (data[mid] == target){
            return mid;
        }
        if (data[mid] < target){
            for (int i = mid; i < data.length; i++)
            if(data[i] == target)
            {
                return i;
            }
        }
        if (data[mid] > target)
        {
            for (int i = 0; i < mid; i--){
                if (data[i] == target)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
