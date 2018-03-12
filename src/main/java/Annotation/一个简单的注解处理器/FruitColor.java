package Annotation.一个简单的注解处理器;

import java.lang.annotation.*;

/**
 * 水果颜色注解
 * Created by james on 2017/6/1.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {

    /**
     * 颜色枚举
     */
    public enum Color {
        BULE,
        RED,
        GREEN}

    /**
     * 颜色属性
     */
    Color fruitColor() default Color.GREEN;


}
