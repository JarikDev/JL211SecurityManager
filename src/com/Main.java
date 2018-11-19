package com;

public class Main {
    public static void main(String[] args) {
        System.setProperty("java.security.policy","src/myapp.policy");
        System.setSecurityManager(new SecurityManager());
        System.out.println(System.getProperty("os.name"));

    }
}
