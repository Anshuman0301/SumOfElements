package JavaCodes;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Array elements are:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int sum=0;
        System.out.println();
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements are : "+sum);

    }
}
