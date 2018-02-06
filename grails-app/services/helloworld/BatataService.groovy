package helloworld

import grails.gorm.transactions.Transactional

@Transactional
class BatataService {

    def listAll() {
        Batata.findAll()
    }
}
