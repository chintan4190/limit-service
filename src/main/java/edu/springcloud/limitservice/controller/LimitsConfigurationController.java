package edu.springcloud.limitservice.controller;

import edu.springcloud.limitservice.bean.LimitConfiguration;
import edu.springcloud.limitservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(),
                configuration.getMinimum());
        return limitConfiguration;
    }

}
