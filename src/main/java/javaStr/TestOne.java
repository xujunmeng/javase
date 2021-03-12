package javaStr;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by james on 2018/5/23.
 */
public class TestOne {

    private static final Logger logger = org.apache.log4j.Logger.getLogger(TestOne.class);

    public static void main(String[] args) {

        /**
         * cancel.get.push.citys:1
         *
         *
         * apollo配置：cityRule
         * 在这个里面的就是废弃geonear查询。
         * 如果这个值为0就表示全国的单都不走geonear查询。
         * 如果车型id为0，表示这个城市都不走geonear查询，否则就是只有某个指定的车型不走
         * 格式: 城市1_车型id,车型id2;城市2_车型id,车型id2;
         */
        String cityRule = "1002_0;1007_222,888;";
        //String cityRule = "0";

        Integer currentOrderCityId = 1002;

        boolean canGeoNear = true; //默认是可以去查询geoNear的
        Set<Integer> vehicles = new HashSet<>();
        if (cityRule != null) {
            String[] cityRuleStringArr = cityRule.split(";");
            for (String cityRlueString : cityRuleStringArr) {
                String[] rule = cityRlueString.split("_");
                Set<Integer> citySet = Arrays.stream(rule[0].split(",")).map(Integer::valueOf).collect(Collectors.toSet());
                if (citySet.contains(0)) {
                    canGeoNear = false;
                    break;
                }
                if (citySet.contains(currentOrderCityId)
                        && ((rule.length > 1 && rule[1].contains("0")) || rule.length == 1)) {
                    canGeoNear = false;
                    break;
                }
                if (citySet.contains(currentOrderCityId) && (rule.length > 1)) {
                    vehicles = Arrays.stream(rule[1].split(",")).map(Integer::valueOf).collect(Collectors.toSet());
                    break;
                }
            }
        }
    }

}
