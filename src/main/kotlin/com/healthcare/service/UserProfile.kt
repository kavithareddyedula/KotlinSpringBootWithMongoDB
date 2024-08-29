package com.healthcare.service
// singleton design pattern based object
object UserProfile {
    @JvmStatic
    fun getUserDetails():String{
        // get Details from DB / ldap/ identityservice
        return "testing ";
    }
}
/*
fun main(){
   var result = UserProfile.getUserDetails()
    print(result);
}
*/
