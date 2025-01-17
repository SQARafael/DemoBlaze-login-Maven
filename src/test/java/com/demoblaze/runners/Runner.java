package com.demoblaze.runners;
/*
 * @(#) Runner.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@login",
        glue = "com.demoblaze.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
