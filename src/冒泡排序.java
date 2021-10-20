import sun.security.util.ArrayUtil;

import java.util.Arrays;

/**
 * 从尾部一个一个冒出来！每次遍历就能冒出一个最大的，所以叫冒泡O（n）
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 9, 7, 2, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
