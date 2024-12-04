package com.demo.spring_shell.commands;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;
import org.springframework.validation.annotation.Validated;

@Command(group = "test commands")
public class MyCommands {

    @Validated
    @Command(command = "hi", description = "say hello")
    public void sayHello(
            @NotBlank
            @NotNull
            @Size(min = 2, max = 10)
            @Option(shortNames = 'n', longNames = "name", description = "name input") String name
    ) {
        System.out.printf("hello, %s%n", name);
    }

}
