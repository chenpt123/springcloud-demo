package com.chenpt.service;

import org.springframework.stereotype.Component;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述: 熔断器
 * 在微服务架构中，根据业务来拆分成一个个的服务，服务与服务之间可以相互调用（RPC），
 * 在Spring Cloud可以用RestTemplate+Ribbon和Feign来调用。为了保证其高可用，单个服务通常会集群部署。
 * 由于网络原因或者自身的原因，服务并不能保证100%可用，如果单个服务出现问题，调用这个服务就会出现线程阻塞，
 * 此时若有大量的请求涌入，Servlet容器的线程资源会被消耗完毕，导致服务瘫痪。服务与服务之间的依赖性，故障会传播，
 * 会对整个微服务系统造成灾难性的严重后果，这就是服务故障的“雪崩”效应。
 * 作者: chen_pt
 * 创建日期: 2018/6/12
 * 修改记录:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne() {
        return "sorry--error";
    }
}
