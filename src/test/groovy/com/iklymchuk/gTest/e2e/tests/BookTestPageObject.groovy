package com.iklymchuk.gTest.e2e.tests

import com.iklymchuk.gTest.e2e.pages.BookPage
import com.iklymchuk.gTest.e2e.pages.HomePage
import geb.spock.GebSpec

class BookTestPageObject extends GebSpec {

    def "can access to the Book from homepage"() {

        given:
            to HomePage

        when:
            manualsMenu.open()
            manualsMenu.links[0].click()

        then:
            at BookPage

    }
}
