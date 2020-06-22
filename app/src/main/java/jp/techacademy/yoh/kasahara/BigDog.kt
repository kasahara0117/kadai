package jp.techacademy.yoh.kasahara

import  android.util.Log

class BigDog:Dog {

    constructor(name: String, age: Int):super(name, age){
    }

    override fun say() {
        super.say()
        Log.d("kotlintest","大きな犬です。")
    }

}