package grailsvuetest

import grails.gorm.services.Service

@Service(Model)
interface ModelDataService {
    Model save(String name)
}
