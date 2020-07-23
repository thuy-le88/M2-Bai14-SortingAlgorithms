package thuchanh;

public class SelectionSorted {
    static double[] list={1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSorted(double[] list) {
        for (int i=0;i<list.length;i++) {
            double currentMin=list[i];
            int currentMinIndex=i;
            for (int j=i+1;j<list.length;j++) {
                if (currentMin>list[j]) {
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex!=i) {
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("List before sorted: ");
        for (int i=0;i<list.length;i++) {
            System.out.print(list[i]+"\t");
        }
        System.out.println();
        selectionSorted(list);
        System.out.println("List after sorted: ");
        for (int i=0;i<list.length;i++) {
            System.out.print(list[i]+"\t");
        }
    }
}
