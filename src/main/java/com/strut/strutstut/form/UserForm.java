package com.strut.strutstut.form;

import com.strut.strutstut.models.User;
import org.apache.struts.action.ActionForm;

import java.util.List;

public class UserForm extends ActionForm {
    private String name;
    private int age;

    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
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
}
