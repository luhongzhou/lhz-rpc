package com.lhz.rpc.example;

import com.lhz.rpc.server.RpcServer;
import com.lhz.rpc.server.RpcServerConfig;

public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer(new RpcServerConfig());
        server.register(CalcService.class,new CalcServiceImpl());
        server.start();
    }
}
