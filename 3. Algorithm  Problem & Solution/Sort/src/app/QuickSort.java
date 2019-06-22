
package app;
import java.util.Random;

public class QuickSort implements Sort {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int l, int r) {

        // 本质是树的前序遍历操作
        if(l >= r) return;
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int[] arr, int l, int r) {
        // 随机选择基准值 放在最左端
        App.swap(arr, l, new Random().nextInt(r - l + 1) + l);
        int v = arr[l];
        //以 j 位置进行划分[l +1, j]小于 v; [j + 1, i) 大于v  初始位置即为最左端
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if(arr[i] < v){
                App.swap(arr, i, j + 1);
                j ++;
            }
        }
        App.swap(arr, l, j); 
        return j;
    }
    
}