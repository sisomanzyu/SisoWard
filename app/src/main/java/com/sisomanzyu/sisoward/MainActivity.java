package com.sisomanzyu.sisoward;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callIntent(1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callIntent(2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callIntent(3);
            }
        });
    }


    protected void callIntent(int buttonNumber){
        Intent intent = intent = new Intent(this,WardListsActivity.class);
        switch (buttonNumber){
            case 1:intent.putExtra("SHOW_TYPE",ShowType.BOTH);
                break;
        }
        startActivity(intent);
    }
}
