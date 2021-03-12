package 两点坐标;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;

import java.util.List;
import java.util.Optional;

/**
 * @author xujunmeng
 * @date 2021/1/23
 */
public class CaculateDistanceTest {

    public static void main(String[] args){

        GlobalCoordinates source = new GlobalCoordinates(34.700336976893624, 114.01585769136045);
        GlobalCoordinates target = new GlobalCoordinates(34.697968098641, 114.001340852);

        double meter1 = getDistanceMeter(source, target, Ellipsoid.Sphere);
        double meter2 = getDistanceMeter(source, target, Ellipsoid.WGS84);

        System.out.println("Sphere坐标系计算结果："+meter1 + "米");
        System.out.println("WGS84坐标系计算结果："+meter2 + "米");

        List a = Lists.newArrayList();

        a.add(23);
        a.add(24);
        System.out.println(a.toString());

    }

    public static double getDistanceMeter(GlobalCoordinates gpsFrom, GlobalCoordinates gpsTo, Ellipsoid ellipsoid){

        //创建GeodeticCalculator，调用计算方法，传入坐标系、经纬度用于计算距离
        GeodeticCurve geoCurve = new GeodeticCalculator().calculateGeodeticCurve(ellipsoid, gpsFrom, gpsTo);

        return geoCurve.getEllipsoidalDistance();
    }


}



