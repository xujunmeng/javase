package MD5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;

/**
 * Created by james on 2017/11/15.
 */
public class MD5 {

    /**
     * 默认构造方法
     */
    private MD5() {

    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        String str = getMD5("急 啊抗衰   老的肌膚".replaceAll("\\s*", ""));
        String str2 = getMD5("急 啊抗衰 老的肌 膚".replaceAll("\\s*", ""));
        String str3 = getMD5("急 啊asd膚".replaceAll("\\s*", ""));
        String str4 = getMD5("急 啊抗asdf老的肌 膚".replaceAll("\\s*", ""));
        //System.out.println(str);
        //System.out.println(str2);
        //System.out.println(str3);
        //System.out.println(str4);

        System.out.println(EncoderByMd5("爱丽丝肯德基发射"));
        System.out.println(new String(encryptByMD5("爱丽丝的会计法", "UTF-8"), "UTF-8"));
    }

    /**
     * 获得MD5加密字符串
     *
     * @param source 源字符串
     *
     * @return 加密后的字符串
     *
     */
    public static String getMD5(String source) throws UnsupportedEncodingException {
        String mdString = null;
        if (source != null) {
            try {
                //关键是这句
                mdString = getMD5(source.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return mdString;
    }

    /**
     * 获得MD5加密字符串
     *
     * @param source 源字节数组
     *
     * @return 加密后的字符串
     */
    public static String getMD5(byte[] source) {
        String s = null;
        char [] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        final int temp = 0xf;
        final int arraySize = 32;
        final int strLen = 16;
        final int offset = 4;
        try {
            MessageDigest md = MessageDigest
                    .getInstance("MD5");
            md.update(source);
            byte [] tmp = md.digest();
            char [] str = new char[arraySize];
            int k = 0;
            for (int i = 0; i < strLen; i++) {
                byte byte0 = tmp[i];
                str[k++] = hexDigits[byte0 >>> offset & temp];
                str[k++] = hexDigits[byte0 & temp];
            }
            s = new String(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static byte[] encryptByMD5(String plainText, String charset) {
        MessageDigest md5;
        byte[] encryptByte;
        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.update(plainText.getBytes(charset));
            encryptByte = md5.digest();

            return encryptByte;
        } catch (Exception e) {
            throw new RuntimeException(MessageFormat.format(
                    "failed to sign by md5 :[{0}]", plainText), e);
        }
    }

    public static String EncoderByMd5(String str) throws NoSuchAlgorithmException {
        String result = "";
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            // 这句是关键
            md5.update(str.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        byte b[] = md5.digest();
        int i;
        StringBuffer buf = new StringBuffer("");
        for (int offset = 0; offset < b.length; offset++) {
            i = b[offset];
            if (i < 0)
                i += 256;
            if (i < 16)
                buf.append("0");
            buf.append(Integer.toHexString(i));
        }
        result = buf.toString();

        return result;
    }

}
