package com.lhz.rpc.example;

import com.lhz.rpc.client.RpcClient;

public class Client {
    public static void main(String[] args) {
        RpcClient client= new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int r = service.add(1,3);
        int r1 = service.minus(10,9);

        System.out.println(r);
        System.out.println(r1);
    }
}
