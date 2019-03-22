package com.agarcia.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.agarcia.newactivity.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private Button mButton, mButtonShare;

    @Override
    //Bundle
    //Serializable
    //Parcelable
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=findViewById(R.id.btn_send);
        mButtonShare=findViewById(R.id.bt_share);
        mButton.setOnClickListener(v->{
            Intent mIntent= new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, "Hiya 4c6f7665!");
            startActivity(mIntent);
        });
        mButtonShare.setOnClickListener(v->{
            Intent mIntent=new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, "Let's have Shrex ;)");
            startActivity(mIntent);
        });
    }
}
