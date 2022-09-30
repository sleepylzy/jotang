package com.liuzhiyang.pojo;

//封装对话内容和对话方法的工具类
public class Communication {

    private static String[] communications = new String[]{"同学你好","你好","你在干什么？","我在做焦糖工作室的招新题",
            "焦糖工作室是什么？","是一个面点屋，里面全是大佬","真的吗，那我也要参加","那就快来做招新题吧","好的我知道了，再见","再见"};
    //count用于计数防止输出内容重复以及判断结束
    public static int count = 0;

    public static synchronized void cummunicate(User user){
        try {
            while(count<communications.length){
                System.out.println(user.getName()+"说："+communications[count]);
                count++;
                Thread.sleep(1000);
                Communication.class.notify();
                Communication.class.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            //最后唤醒所有线程用来退出程序，防止有线程一直在等待
            Communication.class.notifyAll();
        }
    }
}
