package helloworld

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class BatataServiceSpec extends Specification implements ServiceUnitTest<BatataService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
