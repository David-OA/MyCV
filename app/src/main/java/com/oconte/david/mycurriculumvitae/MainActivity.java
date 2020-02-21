package com.oconte.david.mycurriculumvitae;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.oconte.david.mycurriculumvitae.Fragments.HomeFragment;
import com.oconte.david.mycurriculumvitae.Fragments.InterestsFragment;
import com.oconte.david.mycurriculumvitae.Fragments.NewsFragment;
import com.oconte.david.mycurriculumvitae.Fragments.LanguesFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.activity_main_drawerLayout) DrawerLayout drawerLayout;
    @BindView(R.id.activity_main_nav_view) NavigationView navigationView;

    //FOR FRAGMENTS
    // 1 - Declare fragment handled by Navigation Drawer
    private Fragment fragmentHome;
    private Fragment fragmentNews;
    private Fragment fragmentProfile;
    private Fragment fragmentParams;

    //FOR DATAS
    // 2 - Identify each fragment with a number
    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_NEWS = 1;
    private static final int FRAGMENT_PROFILE = 2;
    private static final int FRAGMENT_PARAMS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        this.configureToolbar();

        this.configureDrawerLayout();

        this.configureNavigationView();

        this.showFirstFragment();
    }

    @Override
    public void onBackPressed() {
        // 5 - Handle back click to close menu
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // 4 - Handle Navigation Item Click
        int id = item.getItemId();

        switch (id){
            case R.id.activity_main_drawer_coordonnees:
                this.showFragment(FRAGMENT_NEWS);
                break;
            case R.id.activity_main_drawer_langues:
                this.showFragment(FRAGMENT_PROFILE);
                break;
            case R.id.activity_main_drawer_interests:
                this.showFragment(FRAGMENT_PARAMS);
                break;
            default:
                break;
        }

        this.drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    // ---------------------
    // CONFIGURATION
    // ---------------------

    /**
     *  - Configure the Toolbar
     */
    protected void configureToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My CV");

    }

    /**
     *  - Configure Drawer Layout
     */
    private void configureDrawerLayout(){
        //this.drawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    /**
     *  - Configure NavigationView
     */
    private void configureNavigationView(){
        //this.navigationView = (NavigationView) findViewById(R.id.activity_main_nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    // ---------------------
    // FRAGMENTS
    // ---------------------

    // 1 - Show first fragment when activity is created
    private void showFirstFragment(){

        fragmentHome = (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.activity_main_frame_layout);

        if (fragmentHome == null) {
            fragmentHome = new HomeFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_main_frame_layout, fragmentHome)
                    .commit();
        }

    }

    // 5 - Show fragment according an Identifier

    private void showFragment(int fragmentIdentifier){
        switch (fragmentIdentifier){
            //case FRAGMENT_HOME :
               //this.showHomeFragment();
              // break;
            case FRAGMENT_NEWS :
                this.showNewsFragment();
                break;
            case FRAGMENT_PROFILE:
                this.showProfileFragment();
                break;
            case FRAGMENT_PARAMS:
                this.showParamsFragment();
                break;
            default:
                break;
        }
    }

    // 4 - Create each fragment page and show it

    private void showHomeFragment() {
        if (this.fragmentHome == null) this.fragmentHome = NewsFragment.newInstance();
        this.startTransactionFragment(this.fragmentHome);
    }

    private void showNewsFragment(){
        if (this.fragmentNews == null) this.fragmentNews = NewsFragment.newInstance();
        this.startTransactionFragment(this.fragmentNews);
    }

    private void showParamsFragment(){
        if (this.fragmentParams == null) this.fragmentParams = InterestsFragment.newInstance();
        this.startTransactionFragment(this.fragmentParams);
    }

    private void showProfileFragment(){
        if (this.fragmentProfile == null) this.fragmentProfile = LanguesFragment.newInstance();
        this.startTransactionFragment(this.fragmentProfile);
    }

    // ---

    // 3 - Generic method that will replace and show a fragment inside the MainActivity Frame Layout
    private void startTransactionFragment(Fragment fragment) {
        if (!fragment.isVisible()) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity_main_frame_layout, fragment).commit();
        }
    }
}
