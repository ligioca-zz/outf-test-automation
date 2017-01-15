package com.outfittery.pages

import geb.Page

/**
 * Created by administrator on 09.01.17.
 */
class LeisureStylePage extends Page {

    static url = "https://www.outfittery.com/funnels/new/#/questionnaire/leisureStyle"

    static at = { $("h3", translate:"leisureStyle.title").text().equals("What do you like to wear in your free time?")} //for english version

    static content = {
        continueButton(to: WorkStylePage) { $("a",translate:"leisureStyle.nextBtn") }
        firstSelection() { $(".answer-button__link__overlay", 0) }
        secondSelection() { $(".answer-button__link__overlay", 1) }
        tirdSelection() { $(".answer-button__link__overlay", 2) }
        fourthSelection() { $(".answer-button__link__overlay", 3) }
        fifthSelection() { $(".answer-button__link__overlay", 4) }
        sixthSelection() { $(".answer-button__link__overlay", 5) }
        seventhSelection() { $(".answer-button__link__overlay", 6) }
        noneOfTheseSelection() { $(".answer-button__link__overlay", 7) }
    }

    def "fill leisure style"(String AllOrNone) {
        if(AllOrNone.equals("All")){
            firstSelection.click()
            secondSelection.click()
            tirdSelection.click()
            fourthSelection.click()
            fifthSelection.click()
            sixthSelection.click()
            seventhSelection.click()
        }
        else {
            noneOfTheseSelection.click()
        }

    }

    def "click on Continue"(){
        continueButton.click()
    }
}
