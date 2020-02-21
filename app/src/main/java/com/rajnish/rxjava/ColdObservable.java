package com.rajnish.rxjava;

import io.reactivex.Observable;

public class ColdObservable
{
    public void createColdObserver() throws InterruptedException {

        Observable<Integer> integerObservable=Observable.just(1,2,3,4,5,6,7,8,9);

        integerObservable.subscribe(item->System.out.println("Cold 1 "+item));
        Thread.sleep(3000);
        integerObservable.subscribe(item->System.out.println("Cold 2 "+item));
    }


}
