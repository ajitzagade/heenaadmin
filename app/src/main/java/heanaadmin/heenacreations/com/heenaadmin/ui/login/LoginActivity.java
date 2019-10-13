package heanaadmin.heenacreations.com.heenaadmin.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import heanaadmin.heenacreations.com.heenaadmin.R;
import heanaadmin.heenacreations.com.heenaadmin.ui.BaseActivity;
import heanaadmin.heenacreations.com.heenaadmin.ui.Home.HomeActivity;
import heanaadmin.heenacreations.com.heenaadmin.ui.register.RegisterActivity;

/**
 * To user login
 */

public class LoginActivity extends BaseActivity {


    private Unbinder unbinder;
    private LinearLayout mLinkSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // actions();
        // sign up link action
        mLinkSignUp = findViewById(R.id.registerTxt);
        mLinkSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegistrationScreen();
            }
        });
    }

    /**
     * Click actions
     */




    /**
     * To open registration screen
     */
    private void openRegistrationScreen() {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    /**
     * To open home screen
     */
    private void openHomeScreen() {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // unbind ui form butter knife 
      //  unbinder.unbind();
    }
}
