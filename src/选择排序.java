import java.util.Arrays;

/**
 * 每次遍历都能找出一个为遍历到的最大的值，速度还行叫选择排序 O(logn)
 */

class 选择排序 {

    public static void main(String[] args) {
        //找最小
        int tmp = 0;
        int min = 0;
        int arr[] = {5, 8, 1, 9, 7, 2, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = 1 + i; j < arr.length; j++) {
                //保留第一个最小的索引
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //将最小的放到头部
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
