package practice.algorithm.searching;

public class LinearSearchAlgo {

    public static void main(String[] args) {

        int[] arr = {12,45,11,9,32,55,99,10,4,01};

        int index = linearSearch(arr, 4);
        System.out.println(index);
    }
    public static int linearSearch(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
}
