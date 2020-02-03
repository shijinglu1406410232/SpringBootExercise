package com.sjl.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 建一个Person类模型，里面封装6个属性及其get、set、toString方法
 * */
@Component
//将该组件注入到Spring容器中
@ConfigurationProperties(prefix = "person")
//相当于是将配置文件中所有以person开头的值注入到当前类中。   注意：在pom里要添加processor包
public class Person {
    private int id;
    private String name;
    private List hobby;
    private String[] family;
    private Map map;
    private Pet pet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", family=" + Arrays.toString(family) +
                ", map=" + map +
                ", pet=" + pet +
                '}';
    }
}
