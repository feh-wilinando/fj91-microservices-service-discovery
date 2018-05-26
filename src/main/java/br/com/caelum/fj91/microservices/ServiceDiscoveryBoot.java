package br.com.caelum.fj91.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryBoot {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryBoot.class, args);
    }
}
