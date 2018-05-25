package com.iklymchuk.gTest.e2e.pages

import geb.Page

class BookPage extends Page {

    static at = { title.startsWith("The Book Of Geb") }

}
