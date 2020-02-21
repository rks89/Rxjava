package com.rajnish.rxjava;

import android.content.Intent;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

public class OberableInjava {

    public void createObserableWithJust()
    {

        Observable<Integer> integerObservable=Observable.just(1,2,3,4,5,6,7,8,9);
        integerObservable.subscribe(item ->System.out.println(item));
    }
    public void ObservabelIterator()
    {
        List<Integer> integerList= Arrays.asList(1,2,34,5,6);
        Observable<Integer> integerObservable=Observable.fromIterable(integerList);
                integerObservable.subscribe(item-> System.out.println("Observable "+item));

    }

    public void createObservableUsingCreate(){

        Observable<Integer> observable= Observable.create(emitter->{
            emitter.onNext(1);
            emitter.onNext(2);
            emitter.onNext(3);
        });

        observable.subscribe(item->System.out.println("Observable "+item)
        ,error->System.out.println(error.getMessage()),()->System.out.println("Completed"));
    }

}
