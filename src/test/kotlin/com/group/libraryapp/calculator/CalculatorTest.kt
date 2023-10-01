package com.group.libraryapp.calculator

import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.multiplyTest()
    calculatorTest.minusTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
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

    fun divideTest() {

        //given
        val calculator = Calculator(5)

        //when
        calculator.divide(2)

        //then
        if(calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest() {

        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        } catch(e: IllegalArgumentException) {
            if( e.message != "0으로 나눌 수 없습니다") {
                throw IllegalStateException("메시지가 다릅니다")
            }
            return
        } catch(e : Exception) {
            throw IllegalStateException()
        }
        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다.")
    }
}