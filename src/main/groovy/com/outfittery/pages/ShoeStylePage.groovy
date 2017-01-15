package com.outfittery.pages

import geb.Page

/**
 * Created by administrator on 13.01.17.
 */
class ShoeStylePage extends Page {

    static url = "https://www.outfittery.com/funnels/new/#/questionnaire/shoeStyle"

    static at = { $("h3", translate:"shoeStyle.title").text().equals("Which shoes would you wear?")}

    static content = {
        continueButton(to: ShoeStylePage) { $("a",translate:"shoeStyle.nextBtn") }
}}
