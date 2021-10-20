/**
 * 归并排序
 * <p>
 * 归并排序 ，采用分治思想！从 2 开始2的N次方依次治理
 *
 * 1、把长度为n的输入序列分成两个长度为n/2的子序列；
 * 2、对这两个子序列分别采用归并排序；
 * 3、将两个排序好的子序列合并成一个最终的排序序列。
 */

public class 归并排序 {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 9, 7, 2, 3, 8};


    }


    public static int[] sort(int[] arr,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            //左右归并
            merge(arr,low,mid,high);
        }
        return arr;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = arr[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            arr[x+low] = temp[x];
        }
    }


}
