package com.niks.app2test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}

	public void myButton1(View v) {
		myToast("button1");
	}

	public void myButton2(View v) {
		myToast("button2");
		Intent i=new Intent(MainActivity.this,SecondActivity.class);
		startActivity(i);
	}

	private void myToast(String string) {
		Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();

	}
}
