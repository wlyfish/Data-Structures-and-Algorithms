/**
 * @author wly
 * @create 2022-10-03 22:54
 */
public class SelectionSort {

    private SelectionSort(){}

    public static void sort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            // 选择 arr[i...n)中的最小值索引
            int minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
