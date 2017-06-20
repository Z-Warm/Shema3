package com.shema3.shema3.cucumber.stepdefs;

import com.shema3.shema3.Shema3App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Shema3App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
