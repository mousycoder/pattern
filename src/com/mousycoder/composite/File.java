package com.mousycoder.composite;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 7:10 PM
 */
public class File extends Root{

    public File(String name){
        super(name);
    }

    @Override
    public void addFile(Root root) {

    }

    @Override
    public void removeFile(Root root) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i <depth; i++){
            sb.append("-");
        }
        System.out.println(sb.toString() + this.getName());
    }
}
