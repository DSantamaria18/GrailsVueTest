package grailsvuetest

import grails.rest.Resource

@Resource(uri = '/make')
class Make {

    String name

    static constraints = {
        name(unique: true, nullable: false, blank: false)
    }
}
