package Annotation.一个简单的注解处理器;

import java.lang.annotation.*;

/**
 * 水果供应者注解
 * Created by james on 2017/6/1.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

    /**
     * 供应商编号
     */
    public int id() default -1;

    /**
     * 供应商名称
     */
    public String name() default "";

    /**
     * 供应商地址
     */
    public String address() default "";

}
