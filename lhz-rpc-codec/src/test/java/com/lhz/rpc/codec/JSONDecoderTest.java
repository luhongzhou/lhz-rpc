package com.lhz.rpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONDecoderTest {

    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean= new TestBean();
        bean.setAge(19);
        bean.setName("lhz");
        byte[] bytes = encoder.encode(bean);
        Decoder decoder = new JSONDecoder();
        TestBean bean1 = decoder.decode(bytes,TestBean.class);
        assertEquals(bean.getAge(),bean1.getAge());
        assertEquals(bean.getName(),bean1.getName());
    }
}