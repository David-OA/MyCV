package com.oconte.david.mycurriculumvitae;

import android.view.Gravity;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class TestMenuDrawer {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class, false, false);

    @Test
    public void testCoordonnées() throws IOException, InterruptedException {

        //Start the MainActivity
        mActivityRule.launchActivity(null);

        onView(withId(R.id.toolbar)).check(matches(isDisplayed()));

        onView(withId(R.id.activity_main_nav_view)).check(matches(isDisplayed()));

        // Open Drawer to click on navigation.
        //onView(withId(R.id.activity_main_drawer_coordonnees)).check(matches(isDisplayed()));

    }
}
