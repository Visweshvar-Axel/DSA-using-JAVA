package com.ust.LP2.c2.a3;

public class Data {
    private int id;
    private String msg;
    public Data(){}
    public Data(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
