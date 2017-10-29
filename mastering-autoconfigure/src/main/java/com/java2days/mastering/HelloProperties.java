package com.java2days.mastering;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hello")
public class HelloProperties {

    /**
     * Specify the name to say hello
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
