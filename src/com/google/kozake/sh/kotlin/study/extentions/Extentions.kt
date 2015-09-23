package com.google.kozake.sh.kotlin.study.extentions

import java.util.*

fun <T, R> List<T>.myMap(f: (T) -> R): List<R> = this.map(f)
