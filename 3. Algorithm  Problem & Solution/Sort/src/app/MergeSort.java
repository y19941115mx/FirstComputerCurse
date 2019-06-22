package app;

class MergeSort implements Sort {

    @Override
    public void sort(int[] arr) {
        mergekSort(arr, 0, arr.length - 1);
        
    }
    // 递归使用归并排序 对arr[l, r]进行排序 本质是树的后序遍历操作
    private void mergekSort(int[] arr, int l, int r) {
        if(l >= r)
            return;
        int mid = (l + r) / 2;
        mergekSort(arr, l, mid);
        mergekSort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    // 将arr[l, mid] arr[mid+1,r] 进行归并
    private void merge(int[] arr, int l, int mid, int r) {
        // 构建辅助数组
        int[] aux = new int[r-l+1];
        for (int i = l; i <= r; i++) {
            aux[i - i] = arr[i];
        }
        // 进行归并
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if( i > mid ) {
                arr[k] = aux[j-l];
                j++;
            }
            else if( j > r) {
                arr[k] = aux[i-l];
                i++;
            }
            else if( aux[i-l] < aux[j-l] ) {
                arr[k] = aux[i-l];
                i++;
            }
            else {
                arr[k] = aux[j-l];
                j++;
            }
        }
    }

}