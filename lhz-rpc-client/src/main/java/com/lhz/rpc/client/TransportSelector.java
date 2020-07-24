package com.lhz.rpc.client;

import com.lhz.rp.transport.TransportClient;
import com.lhz.rpc.Peer;

import java.util.List;

public interface    TransportSelector {
    /**
     * 初始化selector
     * @param peers 可以连接的server端点信息
     * @param count client和server可以建立多少个连接
     * @param clazz client实现class
     */
    void init(List<Peer> peers, int count, Class<? extends TransportClient> clazz);

    /**
     * 选择一个transport和server做交互
     *
     * @return
     */
    TransportClient select();
    void release(TransportClient client);

    void close();
}
