package com.mousycoder.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/21 11:19 AM
 */
public class Person implements Cloneable, Serializable {

    private String name;

    private int age;

    private List<String> list = new ArrayList<>();


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Person() {
        System.out.println("Person.Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public Object deepClone(){
        try {
            //输出 序列化
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            //输入 反序列化
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Person person = (Person)ois.readObject();
            return person;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
