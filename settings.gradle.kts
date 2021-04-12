pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if(requested.id.name == "kotlinx-atomicfu") {
                useModule("org.jetbrains.kotlinx:atomicfu-gradle-plugin:${requested.version}")
            }
        }
    }
}

rootProject.name = "state-machine"