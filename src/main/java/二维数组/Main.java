package 二维数组;

import org.junit.Test;

/**
 * Created by junmeng.xu on 2016/11/16.
 */
public class Main {

    /**
     * 二维数组就是数组成员是一维数组的一维数组
     */
    @Test
    public void test22(){
        int a[][] = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        int length = a.length;
        for (int i = 0; i < length; i++){
            int length1 = a[i].length;
            for (int j = 0; j < length1; j++){
                System.out.println("a[" + i + "][" + j + "]=" + a[i][j]);
            }
        }
    }

    @Test
    public void test333(){

        //创建和打印不规则二维数组
        int arr[][];

        //现在说明为不规则数据
        arr = new int[3][];

        arr[0] = new int[10];//arr[0]指向另一个一维数组
        arr[1] = new int[3];
        arr[2] = new int[4];

        //赋值
        int length = arr.length;
        for(int i=0;i<length;i++){
            int length1 = arr[i].length;
            for(int j=0;j<length1;j++){

                arr[i][j]=j;
            }

        }

        //输出
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
