package com.google.kozake.sh.kotlin.study.functor

interface MyFunctor<A> {

    fun myMap<B>(f: (A) -> B): MyFunctor<B>
}
