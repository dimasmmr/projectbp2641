package com.example.projectbp2641

class Login {

    var username = ""
    var password = ""

    fun loginCheck():Boolean{
        if(username.equals("dimas") && password.equals("123")){
            return true
        }else {
            return false
        }
    }
}