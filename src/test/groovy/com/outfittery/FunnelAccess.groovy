package com.outfittery

import com.outfittery.pages.HomePage
import com.outfittery.pages.LeisureStylePage
import geb.spock.GebReportingSpec
import spock.lang.Stepwise


@Stepwise
class FunnelAccess extends GebReportingSpec{

    def "Let's go option should bring user to the Funnel page"() {

        given: "I am at the login page."
        to HomePage

        when: "User access funnel"
        "click on first 'Let's go' option"()
        to LeisureStylePage

        then: "I'm at the first funnel page."
        at LeisureStylePage
    }

}
