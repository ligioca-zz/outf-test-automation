package com.outfittery.pages

import geb.Page

/**
 * Created by administrator on 10.01.17.
 */
class WorkStylePage extends Page {

    static url = "https://www.outfittery.com/funnels/new/#/questionnaire/workStyle"

    static at = { $("h3", translate:"workStyle.title").text().equals("What do you wear to work?")} //for english version

    static content = {
        continueButton(to: ShoeStylePage) { $("a",translate:"workStyle.nextBtn") }
        firstSelection() { $(".answer-button__link__overlay", 0) }
        secondSelection() { $(".answer-button__link__overlay", 1) }
        tirdSelection() { $(".answer-button__link__overlay", 2) }
        fourthSelection() { $(".answer-button__link__overlay", 3) }
        fifthSelection() { $(".answer-button__link__overlay", 4) }
        sixthSelection() { $(".answer-button__link__overlay", 5) }
        seventhSelection() { $(".answer-button__link__overlay", 6) }
        noneOfTheseSelection() { $(".answer-button__link__overlay", 7) }
    }

    def "fill work style"(String AllOrNone) {
        if(AllOrNone.equals("All")){
            firstSelection.click()
            secondSelection.click()
            tirdSelection.click()
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
