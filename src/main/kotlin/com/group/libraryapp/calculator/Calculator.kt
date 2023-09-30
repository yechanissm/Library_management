package com.group.libraryapp.calculator

//데이터 클래스일 경우 number가 private이지만 테스트 결과를 확인할 수 있다.
class Calculator (
       private var _number: Int
        ){

    val number: Int
        get() = this._number

    fun add(operand: Int) {
        this._number += operand
    }

    fun minus(operand: Int) {
        this._number -= operand
    }

    fun multiply(operand: Int) {
        this._number *= operand
    }

    fun divide(operand: Int) {
        if(operand==0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다")
        }
        this._number /= operand
    }
}