package com.sunlands.zipkin.back.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenao
 * @Description
 * @Date Created in 2018/8/9.
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/call/{id}")
    public String callHome(@PathVariable String id){
//        logger.info("calling trace demo backend");
//        return "hello"+id;
        logger.info("calling from trace demo backend");
//        String result= this.restTemplate.getForObject("http://localhost:8081/api/category/front/list", String.class);
        return " world";
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

//    @BeanSleuthTracingContext
//    sleuthTracingContext(@Autowired(required = false) org.springframework.cloud.sleuth.Tracer tracer){
//        SleuthTracingContext context = new SleuthTracingContext();
//        context.setTracerFactory(new SleuthTracerFactory() {
//            @Override
//            public org.springframework.cloud.sleuth.Tracer getTracer() {
//                return tracer;
//            }
//        });
//        return context;
//    }
//
//    @RequestMapping("/goods")
//    public String getGoodsList() {
//        logger.info("getGoodsList invoking ...");
//        return goodsApi.getGoodsList();
//    }
//
//    basicServiceConfigBean.setFilter("sleuth-tracing");basicRefererConfigBean.setFilter("sleuth-tracing");
//
//    @MotanServicepublic
//    class GoodsApiImpl implements GoodsApi {
//        Logger logger = LoggerFactory.getLogger(GoodsApiImpl.class);
//        @Override
//        public String getGoodsList() {
//            logger.info("GoodsApi invoking ...");
//            return "success";
//        }
//    }
}
