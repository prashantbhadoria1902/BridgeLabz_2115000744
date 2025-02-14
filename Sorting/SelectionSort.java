package Sorting;

import java.util.*;

public class SelectionSort{

    public static void selectionSort(double arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            double temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the number students: ");
        int n = cin.nextInt();

        System.out.println("Enter the score of each student respectively: ");
        double studentScore[] = new double[n];
        for(int i=0;i<studentScore.length;i++){
            studentScore[i] = cin.nextDouble();
        }

        selectionSort(studentScore);
    }
}