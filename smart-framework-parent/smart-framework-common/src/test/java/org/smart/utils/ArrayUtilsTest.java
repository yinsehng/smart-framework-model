package org.smart.utils;

import org.junit.Test;

/**
 * @author yinsheng
 * @date 2018\12\14 0014 16:13
 */
public class ArrayUtilsTest {


    @Test
    private void testIsEmpty() {
        String[] names = {"zs"};
        if (ArrayUtil.isEmpty(names)) {
            System.out.println("----");
        }
    }

}
