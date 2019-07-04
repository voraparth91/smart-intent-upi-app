package xyz.parthvora.smartintentupi;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);


        if (getIntent() != null && getIntent().getData() != null) {
            Uri data = getIntent().getData();

            String intentString = data.toString();
            TextView tv = (TextView) findViewById(R.id.textView);
            if(tv!=null){
                tv.setText(intentString);
            }

        }
    }
}
