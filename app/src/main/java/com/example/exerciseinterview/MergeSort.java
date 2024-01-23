package com.example.exerciseinterview;

public class MergeSort {

    //Divide and conquer
    //Split array in half, leftArray, rightArray until the size of array = 1
    //run-time complexity = O(n log n)
    //space complexity = O(n)

    public static void main(String[] args) {
        int[] exArray = {8, 3, 2, 9, 6, 1, 4, 5};
        mergeSort(exArray);

        for (int i = 0; i<exArray.length; i++){
            System.out.print(exArray[i] + " ");
        }
    }

    public static void mergeSort(int[] array){

        //create left array half size of the origin array
        int length = array.length;
        int middle = length/2;

        //guarding size of array
        if (length <= 1){
            return;
        }

        //initialize new array (splitted from origin) left & right
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        //initialize each of the indices
        int i = 0; //for left array
        int j = 0; //for right array

        //loop through origin array
        //copy value of origin array to both splitted array
        for (; i< length; i++){
            //assign value to leftArray
            if (i < middle){
                leftArray[i] = array[i];
            } else {
                //assign value to rightArray
                rightArray[j] = array[i];
                //increment j
                j++;
            }
        }
        //call function recursively
        //Split array until length = 1
        mergeSort(leftArray);
        mergeSort(rightArray);

        //sort and merge the array
        merge(leftArray, rightArray, array);
    }

    //helper function to merge splitted array
    public static void merge(int[] leftArray, int[] rightArray, int[] array){
        //define both size of array
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        //indices for loop through the arrays
        int i=0; int l=0; int r=0;

        //while loop, comparing smaller number from each of the array
        while (l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                //store value from leftArray to Origin
                array[i] = leftArray[l];
                //increment indices
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        //when the total elemen of the array are odd, so there was a remaining element without comparable value
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
