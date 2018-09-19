package javaStr.枚举类型的测试;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 2018/3/12.
 */
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("10001");

        boolean contains = list.contains(EnumQuotationTags.第一种情况.getTagNo());
        System.out.println(contains);

    }

    @Test
    public void test2() {
        MasterSlaveDataSourceDecision.markMaster();
        MasterSlaveDataSourceDecision.DataSourceType dataSourceType = MasterSlaveDataSourceDecision.getDataSourceType();
        if (null != dataSourceType) {
            String name = dataSourceType.name();
            System.out.println(name);
        }
    }

}
