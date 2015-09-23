package com.google.kozake.sh.kotlin.study.simple

import com.google.kozake.sh.kotlin.study.extentions.*

fun main(args: Array<String>) {

    println(arrayListOf(1, 2, 3, 4, 5).myMap { n -> n * 3})
}
