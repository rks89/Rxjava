package com.rajnish.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObserberDemo
{
    public void createObserber(){

        Observable<Integer> integerObservable=Observable.just(1,2,3,4,5,6,7,8,9);

        Observer<Integer> observer= new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Next"+integer);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("Completed");

            }
        };
        integerObservable.subscribe(observer);
    }
}
