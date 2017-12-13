package com.design.patterns.structural.proxy;

public class ProxyPatternTestApp {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Rhye", "password");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
