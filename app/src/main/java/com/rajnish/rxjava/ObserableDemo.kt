package com.rajnish.rxjava

import io.reactivex.Observable

class ObserableDemo
{
    fun declaredObserable(){

        var observable= Observable.just(1,2,3,4,5).subscribe()
    }
}