package com.outfittery

import com.outfittery.pages.HomePage
import com.outfittery.pages.LeisureStylePage
import com.outfittery.pages.ShoeStylePage
import com.outfittery.pages.WorkStylePage
import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class FunnelFlow extends GebReportingSpec {

    def "Funnel Flow"(){
        when:
        to HomePage
        and:
        "click on first 'Let's go' option"()
        to LeisureStylePage
        "fill leisure style"("All")
        "click on Continue"()
        to WorkStylePage
        "fill work style"("All")
        "click on Continue"()
        to ShoeStylePage
        //TODO: this test case is not done...even the scenario is not done..it is just to test automation

        then: "User is registered."
        at ShoeStylePage

    }

}
