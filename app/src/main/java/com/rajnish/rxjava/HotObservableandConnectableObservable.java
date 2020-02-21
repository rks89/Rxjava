package com.rajnish.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.observables.ConnectableObservable;

public class HotObservableandConnectableObservable {

    public void createHotandConnectableObserver() throws InterruptedException {

        ConnectableObservable<Integer> integerConnectableObservable= Observable.just(1,2,3,4,5,6,7,8,9).publish();

        integerConnectableObservable.subscribe(item->System.out.println("Hot and ConnectAble 1 "+item));
        integerConnectableObservable.connect();
        Thread.sleep(3000);
        integerConnectableObservable.subscribe(item->System.out.println("Hot and ConnectAble 2 "+item));
        integerConnectableObservable.connect();

    }

}
