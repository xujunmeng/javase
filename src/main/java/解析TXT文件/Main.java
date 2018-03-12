package 解析TXT文件;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * Created by junmeng.xu on 2016/11/3.
 */
public class Main {

    public static void main(String[] args) {

        String filePath = "D:\\announcement一条纪录存在多个A股代码.xls20161103.txt";
//      "res/";
        readTxtFile(filePath);

    }



    @Test
    public void getDelayTime() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = new GregorianCalendar();
        c.setTime(date);//设置参数时间
        c.add(Calendar.SECOND,-30);//把日期往后增加SECOND 秒.整数往后推,负数往前移动
        System.out.println(c.getTime()); //这个时间就是日期往后推的结果
    }

    @Test
    public void test22(){
        String filePath = "D:\\hq_all.log.bak";

        readTxtFile(filePath);
    }

    public static void readTxtFile(String filePath){
        try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                Set<String> set = Sets.newHashSet();
                while((lineTxt = bufferedReader.readLine()) != null){
                    String[] split = lineTxt.split(";");
                    String result = split[split.length - 3 ];
                    set.add(result);
                }
                System.out.println(set);
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
    }

}
