package com.sieng.bank.card.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "card") // prefix in configuration
@Data
public class CardServiceConfig {
    private String msg;
    private String buildVersion; // when write as properties (build-version)
    private Map<String, String> mailDetails;
    private List<String> activeBranches;
}
