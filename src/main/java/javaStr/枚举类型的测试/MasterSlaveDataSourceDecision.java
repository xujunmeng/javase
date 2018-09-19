package javaStr.枚举类型的测试;

/**
 * @author james
 * @date 2018/8/14
 */
public class MasterSlaveDataSourceDecision {

    public enum DataSourceType {
        master, slave
    }

    private static final ThreadLocal<DataSourceType> holder = new ThreadLocal<>();

    public static void markMaster() {
        holder.set(DataSourceType.master);
    }

    public static void markSlave() {
        holder.set(DataSourceType.slave);
    }

    public static DataSourceType getDataSourceType() {
        return holder.get();
    }

}
