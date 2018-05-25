package com.iklymchuk.gTest.e2e.pages

import com.iklymchuk.gTest.e2e.modules.MenuModule
import geb.Page

class HomePage extends Page {

    static url = "http://gebish.org"

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module(MenuModule) }
    }
}
