package com.dp.multiplescreentesting;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView mTextView = (TextView) findViewById(R.id.device_textView);
		TextView values_textView = (TextView) findViewById(R.id.values_textView);
		
		Display display = getWindowManager().getDefaultDisplay();
		DisplayMetrics outMetrics = new DisplayMetrics();
		display.getMetrics(outMetrics);

		float density = getResources().getDisplayMetrics().density;
		float dpHeight = outMetrics.heightPixels / density;
		float dpWidth = outMetrics.widthPixels / density;

		mTextView.setText("Width:" + dpWidth + ":Height:" + dpHeight);
		values_textView.setText(getResources().getString(R.string.test_str));
		values_textView.setTextColor(getResources().getColor(R.color.test));

		switch (getResources().getDisplayMetrics().densityDpi) {
		case DisplayMetrics.DENSITY_LOW:
			System.out.println("-------DENSITY_LOW------");
			Toast.makeText(getApplicationContext(), "DENSITY_LOW", Toast.LENGTH_LONG).show();
			break;
		case DisplayMetrics.DENSITY_MEDIUM:
			System.out.println("------DENSITY_MEDIUM-------");
			Toast.makeText(getApplicationContext(), "DENSITY_MEDIUM", Toast.LENGTH_LONG).show();
			break;
		case DisplayMetrics.DENSITY_HIGH:
			System.out.println("------DENSITY_HIGH----HTC---");
			Toast.makeText(getApplicationContext(), "DENSITY_HIGH", Toast.LENGTH_LONG).show();
			break;
		case DisplayMetrics.DENSITY_XHIGH:
			System.out.println("------DENSITY_XHIGH-------");
			Toast.makeText(getApplicationContext(), "DENSITY_XHIGH", Toast.LENGTH_LONG).show();
			break;
			
		case DisplayMetrics.DENSITY_400:
			System.out.println("-------DENSITY_400------");
			Toast.makeText(getApplicationContext(), "DENSITY_400", Toast.LENGTH_LONG).show();
			break;
			
		case DisplayMetrics.DENSITY_TV:
			System.out.println("-----DENSITY_TV----Nexus 7----");
			Toast.makeText(getApplicationContext(), "DENSITY_TV", Toast.LENGTH_LONG).show();
			break;	
			
		case DisplayMetrics.DENSITY_XXHIGH:
			System.out.println("------DENSITY_XXHIGH---Nexus5----");
			Toast.makeText(getApplicationContext(), "DENSITY_XXHIGH", Toast.LENGTH_LONG).show();
			break;
			
		case DisplayMetrics.DENSITY_XXXHIGH:
			System.out.println("------DENSITY_XXXHIGH-------");
			Toast.makeText(getApplicationContext(), "DENSITY_XXXHIGH", Toast.LENGTH_LONG).show();
			break;
		}

	}
}
