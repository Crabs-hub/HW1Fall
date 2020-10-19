import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public boolean testBubbleSort() {
        // add your tests here
        int sort[] = {6, 4, 5, 3, 2, 1};
        int answer[] = {1, 2, 3, 4, 5, 6};
        Problem2 test = new Problem2();
        test.bubbleSort(sort);
        return true;
    }
}