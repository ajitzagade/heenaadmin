package heanaadmin.heenacreations.com.heenaadmin.ui.Home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import heanaadmin.heenacreations.com.heenaadmin.R;
import heanaadmin.heenacreations.com.heenaadmin.ui.BaseActivity;
import heanaadmin.heenacreations.com.heenaadmin.ui.fragments.EmployeesFragment;
import heanaadmin.heenacreations.com.heenaadmin.ui.fragments.OrderFragment;

public class HomeActivity extends BaseActivity {

    private ActionBar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    /**
     * UI Initialization
     */
    private void init() {
        mToolBar = getSupportActionBar();
        mToolBar.setTitle("Employees");
        loadFragment(new EmployeesFragment());
        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(mNavigationSelectListener);
    }

    /**
     * Bottom navigation fragment switching
     */
    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationSelectListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mToolBar.setTitle("Employees");
                    loadFragment(new EmployeesFragment());
                    return true;
                case R.id.navigation_orders:
                    mToolBar.setTitle("Orders");
                    loadFragment(new OrderFragment());
                    return true;
                case R.id.navigation_users:
                    mToolBar.setTitle("Users");
                    return true;
                case R.id.navigation_payments:
                    mToolBar.setTitle("Payments");
                    return true;
                case R.id.navigation_appointments:
                    mToolBar.setTitle("Appointments");
                    return true;
            }
            return false;
        }
    };

    /**
     * To load fragments at selection
     * @param fragment
     */
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
