package com.github.vivilor.webstormtestplugin.services

import com.github.vivilor.webstormtestplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
