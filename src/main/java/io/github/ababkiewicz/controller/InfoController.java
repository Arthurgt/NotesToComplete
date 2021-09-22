package io.github.ababkiewicz.controller;

import io.github.ababkiewicz.TaskConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    private DataSourceProperties dataSource;
    private TaskConfigurationProperties taskConfigurationProperties;

    public InfoController(DataSourceProperties dataSource, TaskConfigurationProperties taskConfigurationProperties) {
        this.dataSource = dataSource;
        this.taskConfigurationProperties = taskConfigurationProperties;
    }

    @GetMapping("/info/allowMultipleTasksFromTemplate")
    boolean allowMultipleTasksFromTemplate() {
        return taskConfigurationProperties.isAllowMultipleTasksFromTemplate();
    }
}
