package cglib处理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author james
 * @date 2019/9/16
 */
public class CglibProxy implements MethodInterceptor {

    //这里的目标类型为Object, 则可以接受任意一种参数作为被代理类，实现了动态代理
    private Object targetObject;

    public Object getInstance(Object target) {
        //设置需要创建子类的类
        this.targetObject = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开启事务");
        Object result = proxy.invoke(targetObject, args);
        System.out.println("关闭事务");
        return result;
    }

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = (UserDao) cglibProxy.getInstance(new UserDao());
        userDao.save();
    }
}
