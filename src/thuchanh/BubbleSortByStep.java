package thuchanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=scanner.nextInt();
        int[] list=new int[size];
        System.out.println("Enter "+list.length+" values");
        for (int i=0;i<list.length;i++) {
            list[i]=scanner.nextInt();
        }
        System.out.println("Your list is: ");
        for (int i=0;i<list.length;i++) {
            System.out.print(list[i]+"\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSorted(list);
    }

    public static void bubbleSorted(int[] list) {
        boolean needNextPass=true;
        for (int k=1;k<list.length && needNextPass;k++) {
            needNextPass=false;
            for (int i=0;i<list.length-k;i++) {
                if (list[i]>list[i+1]) {
                    System.out.println("Swap "+list[i]+" with "+list[i+1]);
                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;
                }
            }
            if (needNextPass==false) {
                System.out.println("Array may be sorted and next pass not need.");
                break;
            }
            System.out.println("list after the "+k+" sort: ");
            for (int j=0;j<list.length;j++) {
                System.out.print(list[j]+"\t");
            }
            System.out.println();
        }
    }
}
