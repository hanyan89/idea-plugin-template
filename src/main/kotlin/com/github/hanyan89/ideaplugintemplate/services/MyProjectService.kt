package com.github.hanyan89.ideaplugintemplate.services

import com.github.hanyan89.ideaplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
