package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class normalclass(val id: String, val ad: String)
data class dataclass(val id: String, val ad: String)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(".................. Normal Class ..................")

        var sinan = normalclass("41","Sinan")
        var suzan = normalclass("37","Suzan")
        var sinem = normalclass("1","Sinem")
        var sinankopya=sinan
        var sinankopya2=normalclass("41","Sinan")

        println(sinan)
        println(sinan.hashCode())
        println(sinan.equals(suzan))
        println(sinan.equals(sinankopya))
        println(sinan.equals(sinankopya2))




        println(".................. Data Class ..................")

        var sinand = dataclass("41","Sinan")
        var suzand = dataclass("37","Suzan")
        var sinemd = dataclass("1","Sinem")
        var sinankopyad=sinand
        var sinankopya2d=dataclass("41","Sinan")

        println(sinand)
        println(sinand.hashCode())
        println(sinand.equals(suzand))
        println(sinand.equals(sinankopyad))
        println(sinand.equals(sinankopya2d))

    }
}