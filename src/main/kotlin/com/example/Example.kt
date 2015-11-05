package com.example

import net.arnx.jsonic.JSON

fun main(args: Array<String>) {
    println("Hello World!")
    val map = JSON.decode<Map<String, String>>("")
}