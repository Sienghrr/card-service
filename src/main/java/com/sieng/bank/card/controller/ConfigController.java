package com.sieng.bank.card.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.sieng.bank.card.config.CardServiceConfig;
import com.sieng.bank.card.property.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/config")
public class ConfigController {
    @Autowired
    private CardServiceConfig serviceConfig;

    @GetMapping("/properties")
    public String getProperties() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(
                serviceConfig.getMsg(),
                serviceConfig.getBuildVersion(),
                serviceConfig.getMailDetails(),
                serviceConfig.getActiveBranches());
        String json = objectWriter.writeValueAsString(properties);
        return json;
    }
}
