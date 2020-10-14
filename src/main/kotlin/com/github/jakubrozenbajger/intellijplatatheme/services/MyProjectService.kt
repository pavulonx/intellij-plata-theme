package com.github.jakubrozenbajger.intellijplatatheme.services

import com.intellij.openapi.project.Project
import com.github.jakubrozenbajger.intellijplatatheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
