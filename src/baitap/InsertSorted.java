package baitap;

public class InsertSorted {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    static void printArray(int[] list) {
        for (int i=0;i<list.length;i++) {
            System.out.print(list[i]+"\t");
        }
    }

    static void insertSorted(int[] list) {
        for (int i=1;i<list.length;i++) {
            int key=list[i];
            int j=i-1;

            while (j>=0 && list[j]>key) {
                list[j+1]=list[j];
                j=j-1;
            }
            list[j+1]=key;
        }
    }

    public static void main(String[] args) {
        System.out.println("List before sorted: ");
        printArray(list);
        insertSorted(list);
        System.out.println();
        System.out.println("List after sorted: ");
        printArray(list);
    }
}
