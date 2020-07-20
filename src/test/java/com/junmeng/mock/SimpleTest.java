package com.junmeng.mock;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

/**
 * @author james
 * @date 2020/7/17
 */
public class SimpleTest {

    @Test
    public void testMockBase() {
        //创建ArrayList的mock对象
        List mockList = mock(ArrayList.class);

        //pass
        Assert.assertTrue(mockList instanceof ArrayList);

        //当我们mockList调用方法去add("张三")的时候会返回true
        when(mockList.add("张三")).thenReturn(true);

        Assert.assertEquals(mockList.size(), 10);
    }

}
