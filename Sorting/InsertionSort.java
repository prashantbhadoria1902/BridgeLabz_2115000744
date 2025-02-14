package Sorting;

import java.util.Scanner;

public class InsertionSort{

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the number employee: ");
        int n = cin.nextInt();

        System.out.println("Enter the Employee Id of each employee: ");
        int employeeId[] = new int[n];
        for(int i=0;i<employeeId.length;i++){
            employeeId[i] = cin.nextInt();
        }

        insertionSort(employeeId);
    }
}