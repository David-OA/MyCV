package com.oconte.david.mycurriculumvitae;

import com.google.android.material.navigation.NavigationView;
import androidx.fragment.app.Fragment;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.oconte.david.mycurriculumvitae.Fragments.EtudesFragment;
import com.oconte.david.mycurriculumvitae.Fragments.ExperiencesFragment;
import com.oconte.david.mycurriculumvitae.Fragments.HomeFragment;
import com.oconte.david.mycurriculumvitae.Fragments.InterestsFragment;
import com.oconte.david.mycurriculumvitae.Fragments.CoordonneesFragment;
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
    private Fragment fragmentCoordonnees;
    private Fragment fragmentExperiences;
    private Fragment fragmentEtudes;
    private Fragment fragmentLangues;
    private Fragment fragmentInterests;

    //FOR DATA
    // 2 - Identify each fragment with a number
    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_COORDONNEES = 1;
    private static final int FRAGMENT_EXPERIENCES = 2;
    private static final int FRAGMENT_ETUDES = 3;
    private static final int FRAGMENT_LANGUES = 4;
    private static final int FRAGMENT_INTERESTS = 5;

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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //View view = toolbar.findViewById(id);
        switch (id) {
            case R.id.menu_main_activity_search:
                this.showHomeFragment();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }


    /**
     * This the Drawer Menu
     * @param item
     * @return
     */
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // 4 - Handle Navigation Item Click
        int id = item.getItemId();

        switch (id){
            case R.id.activity_main_drawer_coordonnees:
                this.showFragment(FRAGMENT_COORDONNEES);
                break;
            case R.id.activity_main_drawer_experiences:
                this.showFragment(FRAGMENT_EXPERIENCES);
                break;
            case R.id.activity_main_drawer_etudes:
                this.showFragment(FRAGMENT_ETUDES);
                break;
            case R.id.activity_main_drawer_langues:
                this.showFragment(FRAGMENT_LANGUES);
                break;
            case R.id.activity_main_drawer_interests:
                this.showFragment(FRAGMENT_INTERESTS);
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
            case FRAGMENT_COORDONNEES:
                this.showCoordonneesFragment();
                break;
            case FRAGMENT_EXPERIENCES:
                this.showExperiencesFragment();
                break;
            case FRAGMENT_ETUDES:
                this.showEtudesFragment();
                break;
            case FRAGMENT_LANGUES:
                this.showLanguesFragment();
                break;
            case FRAGMENT_INTERESTS:
                this.showInterestsFragment();
                break;
            default:
                break;
        }
    }

    // 4 - Create each fragment page and show it

    private void showHomeFragment() {
        if (this.fragmentHome == null) this.fragmentHome = CoordonneesFragment.newInstance();
        this.startTransactionFragment(this.fragmentHome);
    }

    private void showCoordonneesFragment(){
        if (this.fragmentCoordonnees == null) this.fragmentCoordonnees = CoordonneesFragment.newInstance();
        this.startTransactionFragment(this.fragmentCoordonnees);
    }

    private void showExperiencesFragment(){
        if (this.fragmentExperiences == null) this.fragmentExperiences = ExperiencesFragment.newInstance();
        this.startTransactionFragment(this.fragmentExperiences);
    }

    private void showEtudesFragment(){
        if (this.fragmentEtudes == null) this.fragmentEtudes = EtudesFragment.newInstance();
        this.startTransactionFragment(this.fragmentEtudes);
    }

    private void showInterestsFragment(){
        if (this.fragmentInterests == null) this.fragmentInterests = InterestsFragment.newInstance();
        this.startTransactionFragment(this.fragmentInterests);
    }

    private void showLanguesFragment(){
        if (this.fragmentLangues == null) this.fragmentLangues = LanguesFragment.newInstance();
        this.startTransactionFragment(this.fragmentLangues);
    }

    // 3 - Generic method that will replace and show a fragment inside the MainActivity Frame Layout
    private void startTransactionFragment(Fragment fragment) {
        if (!fragment.isVisible()) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity_main_frame_layout, fragment).commit();
        }
    }
}
