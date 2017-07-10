package a1.a2017.iff.seriesanimes.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import a1.a2017.iff.seriesanimes.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_series;
    private Button btn_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_series = (Button) findViewById(R.id.btn_series);
        btn_user = (Button) findViewById(R.id.btn_user);
    }

    @Override
    public void onClick(View v) {

        if (v == btn_series)
        {
            Intent it = new Intent (this, SeriesActivity.class);
        }

        if(v == btn_user)
        {
            Intent it = new Intent (this, UserActivity.class);
        }
    }
}
