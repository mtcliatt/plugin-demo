package com.github.mtcliatt.plugindemo.services

import com.github.mtcliatt.plugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
