package org.tek.code;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Nick
 * @CreateTime 2020/9/7
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("$config.info")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
