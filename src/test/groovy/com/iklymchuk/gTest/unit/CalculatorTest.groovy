package com.iklymchuk.gTest.unit

import spock.lang.Specification
import spock.lang.Unroll

class CalculatorTest extends Specification {

    def calculator

    def setup() {
        calculator = new Calculator()
    }

    def "Test Simple Addition"() {
        expect:
                calculator.add(2,2) == 4
    }

    @Unroll
    def "#a + #b = #c"() {
        expect:
            calculator.add(a,b) == c
        where:
            a | b || c
            2 | 2 || 4
            3 | 2 || 5
    }

    @Unroll
    def "BDD: #a + #b = #c"() {
        given: "a new calculator"
            def calculator = new Calculator()
        and: "nothing is done to the calculator before addition"
        when: "adding two values together"
            def sum = calculator.add(a,b)
        then: "the result is the expected sum"
            c == sum
        where:
            a | b || c
            2 | 2 || 4
            3 | 2 || 5
    }

    def "Mocked calculator"() {
        setup:
            def calculator = Mock(Calculator);
        when:
            calculator.add(2,2)
            calculator.add(2,2)
            calculator.add(2,2)

        then:
            2 * calculator.add(2,2)
    }

    def "Stubbed calculator"() {
        setup:
            def calculator = Stub(Calculator) {
                add(2,2) >> 4
                add(3, _) >> 6
                add(_, _) >> {x, y -> x + y}
            }
        expect:
            calculator.add(a, b) == c
        where:
            a | b || c
            2 | 2 || 4
            3 | 0 || 6
            4 | 3 || 7

    }


}
