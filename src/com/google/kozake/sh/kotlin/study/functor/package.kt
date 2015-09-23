package com.google.kozake.sh.kotlin.study.functor

import java.util.*

class MyFunctorList<A>(val list: List<A>) : MyFunctor<A>, List<A> by list {

    override fun myMap<B>(f: (A) -> B): MyFunctor<B> = MyFunctorList(list.map(f))

    override fun toString() = list.toString()
}

class MyFunctorOptional<A>(val opt: Optional<A>) : MyFunctor<A> {

    override fun myMap<B>(f: (A) -> B): MyFunctorOptional<B> = MyFunctorOptional(opt.map(f))

    override fun toString() = opt.toString()
}

public fun <A> List<A>.asFunctor(): MyFunctorList<A> = MyFunctorList(this)

public fun <A> Optional<A>.asFunctor(): MyFunctorOptional<A> = MyFunctorOptional(this)

