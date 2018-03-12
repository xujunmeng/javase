package javaStr.枚举类型的测试;

/**
 * Created by james on 2018/3/12.
 */
public enum  EnumQuotationTags {

    第一种情况("10001"),
    第二情况("10002");

    private String tagNo;

    private EnumQuotationTags(String tagNo) {
        this.tagNo = tagNo;
    }

    public String getTagNo() {
        return this.tagNo;
    }
}
