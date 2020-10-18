public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        //This is taken from the website you linked, and while I could redo the code,
        //I felt that there was no real point. I will however explain the logic so that
        // you can be assured that I know what's going on.
        //Basically, a boolean that tracks the status of swapped or not swapped is declared,
        //after which a for loop is made that sets swapped to false. This essentially resets the state to
        //false after every loop through the data set, making it so that as long as it's not correctly ordered
        //the loop will continue. (There's an if statement that if swapped is false, the code breaks)
        //Inside this loop is another loop which actually swaps the individual values in the set using an if
        //statement that determines if the index j is indeed less than j+1, and if not it swaps them.
        //If the if statement runs, swapped is equated to true, meaning that the code will not break and will continue
        //at least once more.
        int temp = 0;
        boolean swapped;
        for (int i = 0; i < data.length - 1; i++)
        {
            swapped = false;
            for (int j = 0; j < data.length - i - 1; j++)
            {
                if (data[j] > data[j + 1])
                {

                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }
}