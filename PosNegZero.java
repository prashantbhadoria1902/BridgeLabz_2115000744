import java.util.*;

public class PosNegZero {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = cin.nextInt();;

            if(arr[i]>0){
                System.out.println(arr[i]+" is positive");
                if(arr[i]%2==0){
                    System.out.println(arr[i]+" is even");
                }else{
                    System.out.println(arr[i]+" is odd");
                }
            }else if(arr[i]<0){
                System.out.println(arr[i]+" is negative");
            }else{
                System.out.println(arr[i]+" is zero");
            }
        }

        if(arr[0]==arr[arr.length-1]){
            System.out.println("Number at starting index is equal to the number at ending index");
        }else if(arr[0]>=arr[arr.length-1]){
            System.out.println("Number at starting index is greater than the number at ending index");
        }else{
            System.out.println("Number at starting index is lesser than the number at ending index");
        }
    }
}