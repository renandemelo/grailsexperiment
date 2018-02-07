package helloworld

class BatataController {

    BatataService batataService

    static defaultAction = "list"

    def list() {
        [someVar: 'Heeeey', allBatatas: batataService.listAll(), allBatatasCounter: batataService.listAll().size()]
    }

    def save(){
        def b = new Batata(color: params['color'])
        batataService.save(b)
        redirect action: "list"
    }
}
