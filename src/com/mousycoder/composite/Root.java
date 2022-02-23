package com.mousycoder.composite;

/**
 * @author mousycoder
 * @version 1.0
 * @description: 根节点，通用属性和方法
 * @date 2022/2/21 7:00 PM
 */
public abstract class Root {
    private String name;

    public Root() {
    }

    public Root(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addFile(Root root);

    public abstract void removeFile(Root root);

    public abstract void display(int depth);


}
