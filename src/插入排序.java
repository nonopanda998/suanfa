import java.util.ArrayList;
import java.util.Arrays;

/**
 * auth：ptbigfish-2021-10.20
 * 插入排序：
 * 原理：通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 代码规则：
 * <p>
 * 1.从第一个元素开始，该元素可以认为已经被排序；
 * 2。取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 5.将新元素插入到该位置后；
 * 6.重复步骤2~5。
 */

public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 9, 7, 2, 3};
        //之前的索引
        int befor = 0;
        //当前元素
        int now = 0;
        //第一次从1开始循环因为第一个元素可以认为已经排序
        for (int i = 1; i < arr.length; i++) {
            //已经排序的最后一个位置的索引
            befor = i - 1;
            //当前元素，从1位置开始
            now = arr[i];
            //如果之前的元素大于0并且之前的元素比现在的大则需要移动当前元素到befor之前
            while (befor >= 0 && arr[befor] > now) {
                //把now的值赋给befor
                arr[befor + 1] = arr[befor];
                befor--;
            }
            arr[befor + 1] = now;
        }

        System.out.println(Arrays.toString(arr));
    }
}
