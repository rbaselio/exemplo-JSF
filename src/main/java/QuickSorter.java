import java.util.ArrayList;
import java.util.List;


public class QuickSorter {

    public static void sort(Comparable[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(Comparable[] array, int start, int end) {
        if(start > end) return;
        int position = sortOut(array, start, end);
        sort(array, start, position - 1);
        sort(array, position + 1, end);
    }

    private static int sortOut(Comparable[] array, int start, int end) {
        Comparable initialPoint = array[start];
        int s = start + 1, e = end;
        while (s <= e) {
            if (array[s].compareTo(initialPoint) <= 0) {
                s++;
            } else if (array[e].compareTo(initialPoint) > 0) {
                e--;
            } else {
                Comparable aux = array[s];
                array[s++] = array[e];
                array[e--] = aux;
            }
        }
        array[start] = array[e];
        array[e] = initialPoint;
        return e;
    }
    
}
