package xyz.parthvora.smartintentupi;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ComponentName component = new ComponentName(this, IntentActivity.class);
        final PackageManager pm = this.getPackageManager();

        final SharedPreferences sharedPrefs = getSharedPreferences("xyz.parthvora.smartintentupi", MODE_PRIVATE);
        final SharedPreferences.Editor editor = getSharedPreferences("xyz.parthvora.smartintentupi", MODE_PRIVATE).edit();

        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setChecked(sharedPrefs.getBoolean("isUserRegistered", false));
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    pm.setComponentEnabledSetting(component, PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                            PackageManager.DONT_KILL_APP);

                    editor.putBoolean("isUserRegistered", true);
                    editor.commit();

                } else {
                    // The toggle is disabled
                    pm.setComponentEnabledSetting(component, PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                            PackageManager.DONT_KILL_APP);

                    editor.putBoolean("isUserRegistered", false);
                    editor.commit();
                }
            }
        });




    }
}
