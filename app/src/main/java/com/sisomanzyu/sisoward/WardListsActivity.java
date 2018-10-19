package com.sisomanzyu.sisoward;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class WardListsActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle onSavedInstantState){
        super.onCreate(onSavedInstantState);

        setContentView(R.layout.activity_ward_lists);

        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);
        if(onSavedInstantState!=null){
            selectWards();
        }
    }

    public void selectWards(){

    }
}
