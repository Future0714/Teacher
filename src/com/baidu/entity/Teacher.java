package com.baidu.entity;

public class Teacher {
    private int tid;
    private String sname;

    public Teacher() {
    }

    public Teacher(int tid, String sname) {
        this.tid = tid;
        this.sname = sname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
