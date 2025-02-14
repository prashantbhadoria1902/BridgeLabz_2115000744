package Sorting;
import java.util.*;

public class BubbleSort{

    public static void bubbleSort(double arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the number students: ");
        int n = cin.nextInt();

        System.out.println("Enter the marks of each student respectively: ");
        double studentMarks[] = new double[n];
        for(int i=0;i<studentMarks.length;i++){
            studentMarks[i] = cin.nextDouble();
        }

        bubbleSort(studentMarks);
    }
}