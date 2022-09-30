package com.liuzhiyang.pojo;

//线程类
public class Talk extends Thread{
    private User user;

    public Talk(User user){
        this.user=user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        Communication.cummunicate(user);
    }
}
