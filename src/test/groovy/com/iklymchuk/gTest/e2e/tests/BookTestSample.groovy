package com.iklymchuk.gTest.e2e.tests

import geb.spock.GebSpec

class BookTestSample extends GebSpec {
    def "Sample e2e test"() {

        when:
        go "http://gebish.org"

        then:
        //assert title == "Geb - Very Groovy Browser Automation"

        $("div.menu a.manuals").click()
        waitFor { !$("#manuals-menu").hasClass("animating") }

        $("#manuals-menu a")[0].click()

        assert title.startsWith("The Book Of Geb")

    }
}
