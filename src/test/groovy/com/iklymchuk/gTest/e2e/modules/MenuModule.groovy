package com.iklymchuk.gTest.e2e.modules

import geb.Module

class MenuModule extends Module {

    static content  = {
        toggle { $("div.menu a.manuals") }
        linksContainer { $("#manuals-menu") }
        links { linksContainer.find("a") }
    }

    def open() {
        toggle.click()
        waitFor { !linksContainer.hasClass('animating') }
    }
}
