package com.google.kozake.sh.kotlin.study.sample.functor

import com.google.kozake.sh.kotlin.study.functor.*
import java.util.*

fun main(args: Array<String>) {

    println(arrayListOf(1, 2, 3, 4, 5).asFunctor().myMap { n -> n * 3 })
    println(Optional.of(1).asFunctor().myMap { n -> n * 3 })
}
