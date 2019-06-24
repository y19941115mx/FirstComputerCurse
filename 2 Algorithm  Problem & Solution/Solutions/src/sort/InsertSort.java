package sort;

/**
 * InsertSort
 */
public class InsertSort implements Sort {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // j 保存 i 位置元素应该插入的位置
            int e = arr[i], j; // 
            for (j = i; j > 0 && arr[j - 1] > e;  j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    
}