package com.mousycoder.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 7:02 PM
 */
public class Folder extends Root{

    List<Root> folders = new ArrayList<>();


    public Folder(String name){
        super(name);
    }

    public List<Root> getFolders() {
        return folders;
    }

    public void setFolders(List<Root> folders) {
        this.folders = folders;
    }

    @Override
    public void addFile(Root root) {
        folders.add(root);
    }

    @Override
    public void removeFile(Root root) {
        folders.remove(root);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i <depth; i++){
            sb.append("-");
        }
        System.out.println(sb.toString() + this.getName());

        for (Root r : folders){
            r.display(depth+2);
        }
    }
}
