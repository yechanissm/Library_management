package com.group.libraryapp.calculator

import java.lang.IllegalStateException

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.multiplyTest()
    calculatorTest.minusTest()
}

class CalculatorTest {

    fun addTest() {
        //기브웬덴팬턴
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        if(calculator.number != 8) {
            throw IllegalStateException()
        }
    }

    fun minusTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.minus(3)

        //then
        if(calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {

        //given
        val calculator = Calculator(5)

        //when
        calculator.multiply(3)

        //then
        if(calculator.number != 15) {
            throw IllegalStateException()
        }
    }
}