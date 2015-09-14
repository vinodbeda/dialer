package com.example.dialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	ImageButton ch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = (ImageButton)findViewById(R.id.imageButton1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void MainFunction(View a)
   	{
    	 Intent callIntent = new Intent(Intent.ACTION_CALL);
    	    callIntent.setData(Uri.parse("tel:7742308112"));
    	    startActivity(callIntent);
   	}
       
}
