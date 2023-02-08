package com.Visitors.visit.model;

public class Visit {
    private int count;
    private String username;
    public Visit (String username, int count){
        this.count=count;
        this.username=username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "count=" + count +
                ", username='" + username + '\'' +
                '}';
    }
}
