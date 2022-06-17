package com.ignacio.espressocucumbertest.test.cucumber

import androidx.test.core.app.ActivityScenario
import com.ignacio.espressocucumbertest.MainActivity
import io.cucumber.java.en.Given
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.ignacio.espressocucumbertest.R
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivitySteps {
    private lateinit var scenario: ActivityScenario<MainActivity>

    @Given("I have a MainActivity")
    fun I_have_a_MainActivity() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @When("I click button")
    fun I_click_button() {
        onView(withId(R.id.button)).perform(click())
    }

    @Then("I should see new text on the display")
    fun I_should_see_new_text_on_the_display() {
        onView(withId(R.id.textView)).check(matches(withText("Button clicked")))
    }
}
