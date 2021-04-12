pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if(requested.id.name == "kotlinx-atomicfu") {
                useModule("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.14.2")
            }
        }
    }
}

rootProject.name = "state-machine"