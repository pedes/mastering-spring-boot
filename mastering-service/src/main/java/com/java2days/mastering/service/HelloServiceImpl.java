package com.java2days.mastering.service;

/**
 * Basic implementation of @{@link HelloService}
 */
public class HelloServiceImpl implements HelloService{

    /**
     * Name to say hello.
     */
    private String name;

    /**
     * Says hello to the passed @param name.
     * @param name
     * @return
     */
    public String greetings(String name) {
        return "Hello " + name;
    }

    /**
     * Greetings with the implementation's private name.
     * @return
     */
    public String greetings(){
        return greetings(this.name);
    }

    /**
     * Constructor with custom name
     * @param name
     */
    public HelloServiceImpl(String name) {
        this.name = name;
    }

    /**
     * Default no-args constructor
     */
    public HelloServiceImpl() {
        this(null);
    }
}
