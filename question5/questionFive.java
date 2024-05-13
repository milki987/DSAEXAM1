package question5;

import java.util.Arrays;

public class questionFive {
    static void merge(int[] array) {
        if(array.length<2) {
            return;
        }
        int mid = array.length/2;
        int[] left = new int[mid];
        int[] right = new int[array.length-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length ; i++) {
            right[i-mid] = array[i];

        }
        merge(left);
        merge(right);
        mergeSort(array,left, right);
    } private static void mergeSort(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (left.length>i && right.length>j) {
            if (left[i] < right[j]){
                array[k] = left[i];
                i++;
            }else{
                array[k] = right[j];
                j++;
            }
            k++;
        } while(left.length>i) {
            array[k] = left[i];
            i++;
            k++;
        }while(right.length>j) {
            array[k] = right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {


    }



}
