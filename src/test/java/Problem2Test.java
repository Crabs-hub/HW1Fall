
import org.junit.Test;

import static org.junit.Assert.*;

public class Test2{

    // Example test
    // Okay to change
    @Test
    public boolean testBubbleSort() {
        // add your tests here

        boolean check = true;
        for (int i = 0 ; i < data.length ; i++){
            if(data[i] < data[i+1]){

            }
            else if(data[i] > data[i+1]){
                check = false;
            }
        }
        return check;
    }


}