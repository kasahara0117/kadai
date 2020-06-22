package jp.techacademy.yoh.kasahara

import android.util.Log

open class Human: Animal,Thinkable{

    constructor(name: String, age: Int):super(name,age){

    }

    override fun say() {
        Log.d("kotlintest" ,"私の名前は"+ this.name + "です。年は" + this.age + "歳です。")
    }

    var hobby =("将来")

    override fun think(){
        Log.d("kotlintest","私は" + hobby + "について考える。")
    }
}