package com.punchy.udemyempty;

public class User {

    public static void main(String[] args) {
        User userWrapper = new User("wrap", 42);
        userWrapper.logIn();
    }

    private String name;
    private int age;

    private Message message;

    private int counter;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.counter = 0;
    }

    public void logIn() {
        if (message == null) {
            message = new Message(this);
        }

        if (counter < 10) {
            counter++;
            message.send();
        } else {
            System.out.println("User " + this.name + " is now logged in");
        }
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
