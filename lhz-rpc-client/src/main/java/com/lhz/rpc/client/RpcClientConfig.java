package com.lhz.rpc.client;

import com.alibaba.fastjson.JSON;
import com.lhz.rp.transport.HTTPTransportClient;
import com.lhz.rp.transport.TransportClient;
import com.lhz.rpc.Peer;
import com.lhz.rpc.codec.Decoder;
import com.lhz.rpc.codec.Encoder;
import com.lhz.rpc.codec.JSONDecoder;
import com.lhz.rpc.codec.JSONEncoder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass  = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass  = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass  = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1", 3000));
}
