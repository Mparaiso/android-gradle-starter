package org.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import org.joda.time.LocalTime;

public class HelloActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_layout);
	}

	@Override
	public void onStart() {
		super.onStart();
		TextView textView = (TextView) findViewById(R.id.text_view);
		LocalTime currentTime = new LocalTime();
		textView.setText("Hello world! the current time is : " + currentTime);
	}
}