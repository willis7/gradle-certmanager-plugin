package io.byteshifter

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * CertManagerPlugin configures the Project object by adding tasks and extensions.
 *
 * @author Sion Williams
 */
class CertManagerPlugin implements Plugin<Project> {
    /**
     * Apply this plugin to the given target object.
     *
     * @param target The target object
     */
    @Override
    void apply(Project project) {
        project.task("installCert", type: InstallCertTask)
    }
}
