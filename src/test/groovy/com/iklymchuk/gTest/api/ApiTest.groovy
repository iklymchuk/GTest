package com.iklymchuk.gTest.api

import groovyx.net.http.RESTClient
import spock.lang.Specification

class ApiTest extends Specification {

    def "Should return 200 & a message with the input appended"() {
        setup:
            def primerEndpoint = new RESTClient('http://faker.hook.io')

        when:
            def resp = primerEndpoint.get([ path: '/', query : [ property : 'name.findName',  locale : 'de']])

        then:
            with(resp) {
                status == 200
                //contentType == "application/json"
            }

            with(resp.data) {
                text.length() > 0;

            }


    }

}
