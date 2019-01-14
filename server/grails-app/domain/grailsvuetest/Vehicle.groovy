package grailsvuetest

import grails.rest.Resource

@Resource(uri= '/vehicle')
class Vehicle {

    String name
    Make make
    Model model

    static belongsTo = [driver: Driver]


    static constraints = {
        name(nullable: false, blank: false)
        make(nullable: false, blank: false)
        model(nullable: false, blank: false)
    }
}
