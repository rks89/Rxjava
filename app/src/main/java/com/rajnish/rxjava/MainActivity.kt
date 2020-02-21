package com.rajnish.rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var obserableDemo=OberableInjava()
            //obserableDemo.createObserableWithJust()
            //obserableDemo.ObservabelIterator()
            //obserableDemo.createObservableUsingCreate()

        //var obser=ObserberDemo()
        //obser.createObserber()

        var coldObservable=ColdObservable()
        //coldObservable.createColdObserver()

        var hotAndConenct=HotObservableandConnectableObservable()
        hotAndConenct.createHotandConnectableObserver()

    }
}
