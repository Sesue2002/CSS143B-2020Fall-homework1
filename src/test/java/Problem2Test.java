import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {

        // add your tests here

        //test 1
        int input[] = {3,2,1,5,6};
        int answer[] = {1,2,3,5,6};

        Problem2.bubbleSort(input);
        assertArrayEquals(answer, input);

        //test 2
        int input1[] = {3};
        int answer1[] = {3};

        Problem2.bubbleSort(input1);
        assertArrayEquals(answer1, input1);

        //test 3
        int input0[] = {0};

        Problem2.bubbleSort(input0);

    }
}
