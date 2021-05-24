package id.farrel.dbmovie.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import id.farrel.dbmovie.MainActivity
import id.farrel.dbmovie.R
import id.farrel.dbmovie.utils.DataDummy
import id.farrel.dbmovie.utils.EspressoIdlingResource
import org.junit.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class HomeActivityTest {

    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummySeries = DataDummy.generateDummySeries()

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getEspressoIdlingResource())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getEspressoIdlingResource())
    }

    @Test
    fun loadMovie() {
        onView(withText("SERIES")).perform(click())
        /*onView(withId(R.id.rv_listMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_listMovie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )*/
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_listMovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_item_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_title)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.tv_item_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre)).check(matches(withText(dummyMovie[0].genre)))
        onView(withId(R.id.tv_item_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_year)).check(matches(withText(dummyMovie[0].year)))
        onView(withId(R.id.tv_item_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_rating)).check(matches(withText(dummyMovie[0].rating.toString())))
        onView(withId(R.id.tv_item_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_desc)).check(matches(withText(dummyMovie[0].desc)))
        onView(withId(R.id.imgPoster)).check(matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(matches(withText(dummyMovie[0].img)))

    }

    @Test
    fun loadSeries() {
        onView(withId(R.id.rv_listSeries)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_listSeries)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    @Test
    fun loadDataSeries() {
        onView(withId(R.id.rv_listSeries)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_item_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_title)).check(matches(withText(dummySeries[0].title)))
        onView(withId(R.id.tv_item_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre)).check(matches(withText(dummySeries[0].genre)))
        onView(withId(R.id.tv_item_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_year)).check(matches(withText(dummySeries[0].year)))
        onView(withId(R.id.tv_item_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_rating)).check(matches(withText(dummySeries[0].rating.toString())))
        onView(withId(R.id.tv_item_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_desc)).check(matches(withText(dummySeries[0].desc)))
        onView(withId(R.id.imgPoster)).check(matches(isDisplayed()))
        onView(withId(R.id.imgPoster)).check(matches(withText(dummySeries[0].img)))
    }
}