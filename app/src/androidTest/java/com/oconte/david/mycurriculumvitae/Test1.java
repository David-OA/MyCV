package com.oconte.david.mycurriculumvitae;

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

@RunWith(AndroidJUnit4.class)
public class Test1 {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class, false, false);


    @Test
    public void testCoordonnées() throws IOException, InterruptedException {

        //Start the MainActivity
        mActivityRule.launchActivity(null);

        // Open Drawer to click on navigation.
        //onView(withId(R.id.activity_main_drawerLayout))
        //.check(matches(isClosed(Gravity.LEFT))) // Left Drawer should be closed.
        //.perform(DrawerActions.open()); // Open Drawer

        onView(withId(R.id.toolbar)).check(matches(isDisplayed()));
        /* Start the screen of your activity.
        onView(withId(R.id.nav_view))
                .perform(NavigationViewActions.navigateTo(R.id.your_navigation_menu_item));

        / Check that you Activity was opened.
        String expectedNoStatisticsText = InstrumentationRegistry.getTargetContext()
                .getString(R.string.no_item_available);
        onView(withId(R.id.no_statistics)).check(matches(withText(expectedNoStatisticsText)));*/

    }
}
