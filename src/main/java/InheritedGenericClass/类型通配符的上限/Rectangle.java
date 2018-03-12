package InheritedGenericClass.类型通配符的上限;

import java.awt.Canvas;

/**
@author junmeng.xu
@date  2016年4月7日下午1:34:44
 */
public class Rectangle extends Shape {

	@Override
	public void draw(Canvas c) {
		System.out.println("把一个矩形画在画布" + c + "上");
	}

}
