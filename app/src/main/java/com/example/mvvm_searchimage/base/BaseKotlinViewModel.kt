package com.example.mvvm_searchimage.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseKotlinViewModel : ViewModel() {

    //RxJava의 observing을 이용한 부분.
    //addDisposable을 이용하여 추가하기만 하면 된다.

    private val compositeDisposable = CompositeDisposable()

    fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    //ViewModel은 View와의 lifeCycle 공유
    //View가 부서짐에 따라 onCleared() 호출 및 observable 클리어
    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}