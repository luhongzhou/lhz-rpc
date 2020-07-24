package com.lhz.rpc.common.util;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Method;

public class ReflectionUtilsTest extends TestCase {

    public void testNewInstance() {
    }

    @Test
    public void testGetPublicMethods() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(methods.length,1);
        String name = methods[0].getName();
        System.out.println("success");
        assertEquals("a",name);
    }

    public void testInvoke() {
    }
}