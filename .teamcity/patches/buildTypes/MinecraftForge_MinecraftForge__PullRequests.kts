package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.PullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'MinecraftForge_MinecraftForge__PullRequests'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("MinecraftForge_MinecraftForge__PullRequests")) {
    features {
        add {
            pullRequests {
                id = "MinecraftForge_BuildPullRequests_PullRequestInformation"
                vcsRootExtId = "${DslContext.settingsRoot.id}"
                provider = github {
                    authType = vcsRoot()
                    filterAuthorRole = PullRequests.GitHubRoleFilter.EVERYBODY
                }
            }
        }
    }
}
