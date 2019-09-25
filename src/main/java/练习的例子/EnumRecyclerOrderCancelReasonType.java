package 练习的例子;

import java.math.BigDecimal;

/**
 * @author hong@aihuishou.com.
 * @date 2019/7/15 16:50
 */
public enum EnumRecyclerOrderCancelReasonType {

    平台原因(1),
    买家原因(2),
    卖家原因(3)
    ;

    private int value;

    EnumRecyclerOrderCancelReasonType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static String getName(int index) {
        for (EnumRecyclerOrderCancelReasonType c : EnumRecyclerOrderCancelReasonType.values()) {
            if (c.getValue() == index) {
                return c.name();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(9.90).setScale(2);
        System.out.println(a);
    }
}
