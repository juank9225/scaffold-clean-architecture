/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package co.com.bancolombia;

import co.com.bancolombia.task.*;
import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.Task;
import org.gradle.api.tasks.TaskContainer;

/**
 * A simple 'hello world' plugin.
 */
public class PluginCleanPlugin implements Plugin<Project> {

    private static String taskGroup = "Clean Architecture";

    public void apply(Project project) {

        // Register a task
        TaskContainer tasks = project.getTasks();

        Task generateStructure = tasks.create("cleanArchitecture", GenerateStructureTask.class);
        tasks.create("ca", GenerateStructureTask.class);
        generateStructure.setGroup(taskGroup);
        generateStructure.setDescription("Scaffolding clean architecture project");

        Task generateModel = tasks.create("generateModel", GenerateModelTask.class);
        tasks.create("gm", GenerateModelTask.class);
        generateModel.setGroup(taskGroup);
        generateModel.setDescription("Generate model in domain layer");

        Task generateUseCase = tasks.create("generateUseCase", GenerateUseCaseTask.class);
        tasks.create("guc", GenerateUseCaseTask.class);
        generateUseCase.setGroup(taskGroup);
        generateUseCase.setDescription("Generate use case in domain layer");

        Task generateEntryPoint = tasks.create("generateEntryPoint", GenerateEntryPointTask.class);
        tasks.create("gep", GenerateEntryPointTask.class);
        generateEntryPoint.setGroup(taskGroup);
        generateEntryPoint.setDescription("Generate entry point in infrastructure layer");

        Task generateDrivenAdapter = tasks.create("generateDrivenAdapter", GenerateDrivenAdapterTask.class);
        tasks.create("gda", GenerateDrivenAdapterTask.class);
        generateDrivenAdapter.setGroup(taskGroup);
        generateDrivenAdapter.setDescription("Generate driven adapter in infrastructure layer");

        Task validateStructure = tasks.create("validateStructure", ValidateStructureTask.class);
        tasks.create("vs", ValidateStructureTask.class);
        validateStructure.setGroup(taskGroup);
        validateStructure.setDescription("Validate that project references are not violated");


    }
}
