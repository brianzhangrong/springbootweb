//package com.example.test.springbootweb.config;
//
//import io.jaegertracing.Configuration.SenderConfiguration;
//import io.opentracing.util.GlobalTracer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JaegerConfig {
//
//    @Bean
//    public io.opentracing.Tracer tracer() {
//        io.jaegertracing.Configuration config = new io.jaegertracing.Configuration("first-app");
//        SenderConfiguration sender = new SenderConfiguration();
//        sender.withEndpoint("http://jaeger-collector.istio-system.svc.cluster.local:14268/api/traces");
//        config.withSampler(new io.jaegertracing.Configuration.SamplerConfiguration().withType("const").withParam(1));
//        config.withReporter(new io.jaegertracing.Configuration.ReporterConfiguration().withFlushInterval(10).withSender(sender).withMaxQueueSize(10000).withLogSpans(true));
//        return config.getTracer();
//    }
//
//}
