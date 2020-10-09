public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution

        int l = data.length;

        for(int i = 0; i <  l - 1; i++){
            for (int j = 0; j < l - i - 1; j++){
                if (data[j] > data[j + 1])
                {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }
}
