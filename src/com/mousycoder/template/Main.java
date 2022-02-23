package com.mousycoder.template;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 10:29 AM
 */
public class Main {

    public static void main(String[] args) {
        AbstractProjectManager projectManager ;
        projectManager = new PayServiceProjectManager();
        projectManager.processProject();
        System.out.println("====");
        projectManager = new UserServiceProjectManager();
        projectManager.processProject();

    }
}
