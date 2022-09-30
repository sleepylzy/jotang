package com.liuzhiyang.main;

import com.liuzhiyang.pojo.Talk;
import com.liuzhiyang.pojo.User;

//用来运行的主函数
public class MainFunction {
    public static void main(String[] args) {
        //创建用户对象
        User user1 = new User("刘志洋");
        User user2 = new User("某同学");

        //创建并开启线程
        new Talk(user1).start();
        new Talk(user2).start();
    }
}
