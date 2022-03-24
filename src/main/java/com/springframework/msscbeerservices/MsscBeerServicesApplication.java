package com.springframework.msscbeerservices;

import com.springframework.msscbeerservices.bootStrap.BeerLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MsscBeerServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerServicesApplication.class, args);
    }


}
