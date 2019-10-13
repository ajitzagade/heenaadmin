package heanaadmin.heenacreations.com.heenaadmin.ui.register;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import heanaadmin.heenacreations.com.heenaadmin.R;
import heanaadmin.heenacreations.com.heenaadmin.ui.BaseActivity;
import heanaadmin.heenacreations.com.heenaadmin.ui.login.LoginActivity;

public class RegisterActivity extends BaseActivity {

    private TextView alreadyRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        alreadyRegister = findViewById(R.id.alreadyRegister);
        alreadyRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
//                startActivity(intent);
//               finish();

//                Intent intent = new Intent ("com.android.systemui.recent.action.TOGGLE_RECENTS");
//                intent.setComponent (new ComponentName ("com.android.systemui", "com.android.systemui.recent.RecentsActivity"));
//                startActivity (intent);

            }
        });
    }
}
