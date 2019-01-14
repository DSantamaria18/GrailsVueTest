package grailsvuetest

import grails.rest.Resource

@Resource(uri = '/driver')
class Driver {

    String name

    static hasMany = [vehicles: Vehicle]

    static constraints = {
        name(nullable: false, blank: false)
        vehicles(nullable: true)
    }
}
