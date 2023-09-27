package com.punchy.udemyempty

//kotlin and java are interoperable
class Message(private var user: User) {


    fun send() {
        if (user.name == null) {
            user = User("Matheus", 27)
        }
        println("Inside Login!")
        user.logIn()
    }
}