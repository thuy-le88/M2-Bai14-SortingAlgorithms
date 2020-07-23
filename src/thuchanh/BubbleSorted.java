package thuchanh;

public class BubbleSorted {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    static void bubbleSort(int[] list) {
        for (int i=0;i<list.length;i++) {
            for (int j=0;j<list.length-1;j++) {
                if (list[j]>list[j+1]) {
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }
    static void printArray(int[] list) {
        for (int i=0;i<list.length;i++) {
            System.out.print(list[i]+"\t");
        }
    }

    public static void main(String[] args) {
        System.out.println("List before sorted:");
        printArray(list);
        System.out.println();
        bubbleSort(list);
        System.out.println("List after sorted: ");
        printArray(list);
    }
}
