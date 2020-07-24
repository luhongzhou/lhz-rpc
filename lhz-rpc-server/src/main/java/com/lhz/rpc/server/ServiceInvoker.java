package com.lhz.rpc.server;

import com.lhz.rpc.Request;
import com.lhz.rpc.common.util.ReflectionUtils;

public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtils.invoke(service.getTarget(), service.getMethod(), request.getParameters());
    }
}
