package com.dhouibimohamed.weldi.ParentsCatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dhouibimohamed.weldi.Frags1.frag1;
import com.dhouibimohamed.weldi.R;

public class Cat1Activity extends AppCompatActivity {

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat1);
        start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.DisplayFrag, new frag1()).commit();
                start.setVisibility(View.INVISIBLE);
            }
        });
    }
}
