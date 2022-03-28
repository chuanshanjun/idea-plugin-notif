package com.github.chuanshanjun.ideapluginnotif.services

import com.intellij.openapi.project.Project
import com.github.chuanshanjun.ideapluginnotif.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
