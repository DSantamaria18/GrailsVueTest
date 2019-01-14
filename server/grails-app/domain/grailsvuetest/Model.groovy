package grailsvuetest

import grails.rest.Resource

@Resource(uri = '/model')
class Model {

    String name

    static constraints = {
        name(nullable: false, blank: false)
    }
}
