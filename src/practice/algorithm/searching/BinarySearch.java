package practice.algorithm.searching;

import java.util.ArrayDeque;
import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {

        int[] arr = {12, 45, 11, 9, 32, 55, 99, 10, 4, 01};
        Arrays.sort(arr);
        System.out.println("Sorted array : " +Arrays.toString(arr));
        int key = 55;
        int index = binarySearch(arr, key, 0 , arr.length-1);
        System.out.println("Found Key:"+key+ " at Index : "+index);
    }
    public static int binarySearch(int[] array, int key, int start, int end) {

        if (array.length > 0) {
            int mid = (start+end)/2;
            if(key == array[mid]){
                return  mid;
            }else if (key > array[mid]){
                start = mid+1;
                return  binarySearch(array, key, start, end);
            }else if(key<array[mid]){
                end = mid-1;
                return  binarySearch(array, key, start, end);
            }

        }
        return -1;
    }
}
