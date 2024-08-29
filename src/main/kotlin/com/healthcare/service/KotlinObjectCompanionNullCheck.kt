package com.healthcare.service

import com.healthcare.model.Claim

class KotlinObjectCompanionNullCheck {
    fun addTwoIntegers(a: Int, b: Int): Int {
        return a + b;
    }
    companion object { // static
        val stateTax: Double = 2.1 // java ==public static final double stateTax = 2.1;
        @JvmStatic
        fun greetings(): String {
            return "hi how are you";
        }
    }
}

fun main() {
    val tax = KotlinObjectCompanionNullCheck.stateTax
    println(tax)// companion  constant === static
    val greetings = KotlinObjectCompanionNullCheck.greetings()
    println(greetings) // companion function === static

    var obj = KotlinObjectCompanionNullCheck()// default constructor
    println(obj.addTwoIntegers(10, 12))

    var income: Double =0.0
    if(income > 0.0){
        println(income)
    }
   // var temp : String = "" /// no null value is allowed
    // String temp ;
    //temp = null //--> null safe

    var temp : String?  //  safe call --> null is allowed.. no initialization is required
    temp = null


    var temp2 : String? = null  //  safe call --> null is allowed.. no initialization is required
    // Elvis --> ?:
    // ?: == ternary operation == if else block
    // if(a>10){sys("do some")} else{sys("do some")}
    //.result == (a>10)? sys("do some"):sys("do some")
    var a=30;
    var result = (a>10)?: 20

   /* int[] array={1,2,2,2,4,4}
    sys(array[6]) --> arrayindex out of bound error */
    var claimone: Claim
 //|| NPE== operator
  /*  if(claimone||.id == "200"){

    }*/


}

