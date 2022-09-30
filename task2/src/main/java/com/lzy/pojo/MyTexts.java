package com.lzy.pojo;

//内容封装
public class MyTexts {
    private int id;
    private String myText;

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

    public MyTexts(String myText) {
        this.myText = myText;
    }

    public MyTexts(int id, String myText) {
        this.id = id;
        this.myText = myText;
    }

    public MyTexts(int id, String myText, int status) {
        this.id = id;
        this.myText = myText;
        this.status = status;
    }

    @Override
    public String toString() {
        return "MyTexts{" +
                "id=" + id +
                ", myText='" + myText + '\'' +
                ", status=" + status +
                '}';
    }
}
