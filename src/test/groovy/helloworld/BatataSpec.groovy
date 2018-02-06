package helloworld

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BatataSpec extends Specification implements DomainUnitTest<Batata> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
