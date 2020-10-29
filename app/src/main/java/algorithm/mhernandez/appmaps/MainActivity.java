package algorithm.mhernandez.appmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapas(View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
    public void irMapas2(View v){
        Intent i = new Intent(this, MapsActivity2.class);
        startActivity(i);
    }
    public void irMapas3(View v){
        Intent i = new Intent(this, MapsActivity3.class);
        startActivity(i);
    }
    public void irMapas4(View v){
        Intent i = new Intent(this, MapsActivity4.class);
        startActivity(i);
    }
}