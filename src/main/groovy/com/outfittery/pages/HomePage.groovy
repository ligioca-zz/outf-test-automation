package com.outfittery.pages

import geb.Page

/**
 * Created by administrator on 13.01.17.
 */
class HomePage extends Page {

    static url = "https://www.outfittery.com/"
    static at = {
        $(".navbar-right.nav.navbar-nav").verifyNotEmpty()
        heading.isDisplayed()
    }
    static content = {
        heading { $(".navbar-header") }
        letsGoButton() { $(".center.btn.btn-primary.width-full", 1) }
        loginButton(to: LoginPage) { $(".login.open-login") }
    }

    def "click on first 'Let's go' option"() {
        letsGoButton.click()
        return new LeisureStylePage()
    }

    def "Click on 'Customer Login' (header)"() {
        loginButton.click()
        return new LoginPage()
    }

}
