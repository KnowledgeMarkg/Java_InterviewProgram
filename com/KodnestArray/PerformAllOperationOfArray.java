package com.KodnestArray;

import java.util.Arrays;
import java.util.Scanner;

class ArrayFun {
    int[] arr;
    public ArrayFun(int[] arr) {
        this.arr = arr;
    }
    public void checkSort() {
        boolean b = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("Array " + Arrays.toString(arr) + " is not sorted");
        } else {
            System.out.println("Array " + Arrays.toString(arr) + " is sorted");
        }
    }

    public void linearSearch() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Element Which You Want To Search");
            int num = sc.nextInt();
            boolean b = false;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    b = true;
                    index = i;
                    break;
                }
            }
            if (b) {
                System.out.println("The Number " + num + " is found on index " + index);
            } else {
                System.out.println("The Number " + num + " is not found ");
            }
        }
    }

    public int binarySearch(int binarySearchTarget) {
        bubbleSort();
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == binarySearchTarget) {
                return mid;
            }
            if (arr[mid] < binarySearchTarget) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void insertionSort() {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int item = arr[i];
            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = item;
        }

    }

    public void selectionSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public void findMinEle() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element in this Array " + Arrays.toString(arr) + " is " + min);
    }

    public void findMaxEle() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element in this Array Is " + Arrays.toString(arr) + " is " + max);
    }
}

public class PerformAllOperationOfArray {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ArrayFun arrayFun = new ArrayFun(arr);
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {
        	  System.out.println();
        	  System.out.println("Press 1 To check whether Array is sorted or not");
              System.out.println("Press 2 To Perform Linear Search");
              System.out.println("Press 3 To Perform Binary Search");
              System.out.println("Press 4 To Sort An Array Using Bubble Sort");
              System.out.println("Press 5 To Sort An Array Using Insertion Sort");
              System.out.println("Press 6 To Sort An Array Using Selection Sort");
              System.out.println("Press 7 to Print minimum Element Element");
              System.out.println("Press 8 To Print Maximum Element");
              System.out.println("Press 9 for Close The Program");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        arrayFun.checkSort();
                        break;
                    case 2:
                        arrayFun.linearSearch();
                        break;
                    case 3:
                        System.out.print("Enter the target element for binary search: ");
                        int binarySearchTarget = sc.nextInt();
                        int binarySearchResult = arrayFun.binarySearch(binarySearchTarget);
                        if (binarySearchResult != -1) {
                            System.out.println("Element " + binarySearchTarget + " found at index " + binarySearchResult);
                        } else {
                            System.out.println("Element not found");
                        }
                        break;
                    case 4:
                        arrayFun.bubbleSort();
                        break;
                    case 5:
                        arrayFun.insertionSort();
                        System.out.println("Array after Insertion Sort: " + Arrays.toString(arrayFun.arr));
                        break;
                    case 6:
                        arrayFun.selectionSort();
                        System.out.println("Array after Selection Sort: " + Arrays.toString(arrayFun.arr));
                        break;
                    case 7:
                        arrayFun.findMinEle();
                        break;
                    case 8:
                        arrayFun.findMaxEle();
                        break;
                    case 9:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid input. Please choose a valid option.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer choice.");
                sc.next(); 
            }
        }

        sc.close(); 
    }
}
