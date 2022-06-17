package com.ignacio.espressocucumbertest.test.cucumber;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.ignacio.espressocucumbertest.MainActivity;
import com.ignacio.espressocucumbertest.R;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(AndroidJUnit4.class)
public class MainActivitySteps {
    @Given("I have a MainActivity")
    public void I_have_a_MainActivity() {
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
    }

    @When("I click button")
    public void I_click_button() {
        onView(withId(R.id.button)).perform(click());
    }

    @Then("I should see new text on the display")
    public void I_should_see_new_text_on_the_display() {
        onView(withId(R.id.textView)).check(matches(withText("Button clicked")));
    }
}
