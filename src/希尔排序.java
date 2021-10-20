import java.util.Arrays;

/**
 * auth：ptbigfish-2021-10.20
 *
 * 希尔排序，插入排序的改进版，在向后排序的过程中反复把排序元素逐步向后挪位，为新元素提供插入的空间
 * <p>
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序：
 * 1.选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 2.按增量序列个数k，对序列进行k 趟排序；
 * 3.每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class 希尔排序 {
    public static void main(String[] args) {
        //希尔排序按照一个增量gap进行分组标记数组,gap做索引使用
        int []arr = {5, 1, 4, 9, 7, 2, 3, 8};

        int len = arr.length;

        for (int gap = len / 2; gap > 0; gap = gap / 2) {
            System.out.println("分组大小："+gap);
            //分组完成，如此就知道了gap索引为标记的数组的大小
            int befor = 0;
            int now = 0;
            for (int i = gap; i < len; i++) {
                befor = i;
                now = arr[i];
                while (befor-gap >= 0 && arr[befor-gap] > now) {
                    System.out.println("交换：" + arr[befor] + "和" + arr[befor-gap]);
                    arr[befor] = arr[befor-gap];
                    befor-=gap;
                }
                arr[befor] = now;
            }
            System.out.println("交换完成后数组：" + Arrays.toString(arr));
        }
        System.out.println("排序后数组：" + Arrays.toString(arr));
    }

}

