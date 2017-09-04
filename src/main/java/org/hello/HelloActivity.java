package org.hello;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity  {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_layout);
	}

	@Override
	public void onStart() {
		super.onStart();
		TextView textView = (TextView) findViewById(R.id.text_view);
		textView.setText(R.string.greeting_message);
	}

}