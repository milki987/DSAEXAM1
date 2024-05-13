package question4;
import java.util.*;

public class questionFour {
    public static void bubbleSort(char[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        //without temp variable using XOR
                        array[j] = (char) (array[j+1] ^ array[j]);
                        array[j+1] = (char) (array[j+1] ^ array[j]);
                        array[j] = (char) (array[j+1] ^ array[j]);


                    }
                }
            }
        System.out.println(Arrays.toString(array));
        }

    public static void main(String[] args) {
        char[] array = {'a', 't', 'c', 'k'};
        bubbleSort(array);
    }

    }


