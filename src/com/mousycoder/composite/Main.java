package com.mousycoder.composite;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 7:13 PM
 */
public class Main {

    public static void main(String[] args) {
        Root root1 = new Folder("C://");

        Root desktop = new Folder("桌面");

        Root myComputer = new Folder("我的电脑");

        //
        Root javaFile = new File("Helloworld.java");


        root1.addFile(desktop);
        root1.addFile(myComputer);

        myComputer.addFile(javaFile);


        root1.display(0);


        Root root2 = new Folder("D:");
        root2.display(0);



    }
}
