package sort;

/**
 * SelectionSort
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            // 找到[i, length) 区间的最小值
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) 
                    minIndex = j;
            }
            // 交换 minIndex 与 此时 i位置的元素
            App.swap(arr, i, minIndex);
        }
    }

    
}