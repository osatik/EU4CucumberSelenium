package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("the user navigates to Fleet, Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("the title should be Vehicles");
    }

    @When("the user navigates to Activities, Calender events")
    public void the_user_navigates_to_Activities_Calender_events() {
        System.out.println("the user navigates to Activities, Calender events");
    }

    @Then("the title should be Calender")
    public void the_title_should_be_Calender() {
        System.out.println("the title should be Calender");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing, Campaigns");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("the title should be Campaigns");
    }
}
