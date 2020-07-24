package com.lhz.rpc.server;

import com.lhz.rp.transport.HttpTransportServer;
import com.lhz.rp.transport.TransportServer;
import com.lhz.rpc.codec.Decoder;
import com.lhz.rpc.codec.Encoder;
import com.lhz.rpc.codec.JSONDecoder;
import com.lhz.rpc.codec.JSONEncoder;
import lombok.Data;

/**
 * server 配置
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private Class<? extends Encoder> encoderClass  = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port  =  3000;
}
