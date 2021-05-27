package id.farrel.dbmovie.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import id.farrel.dbmovie.R
import id.farrel.dbmovie.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(EspressoIdlingResource.espressoTestIdlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.espressoTestIdlingResource)
    }

    @Test
    fun loadMovie() {
        onView(withText("MOVIE")).perform(click())
        onView(withId(R.id.rv_listMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_listMovie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                19
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withText("MOVIE")).perform(click())
        onView(withId(R.id.rv_listMovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_item_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(matches(isDisplayed()))
    }

    @Test
    fun loadSeries() {
        onView(withText("SERIES")).perform(click())
        onView(withId(R.id.rv_listSeries)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_listSeries)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                19
            )
        )
    }

    @Test
    fun loadDetailSeries() {
        onView(withText("SERIES")).perform(click())
        onView(withId(R.id.rv_listSeries)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_item_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(matches(isDisplayed()))
    }
}