package com.akash.womensafetyapp;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

import com.prabhu.womensafetyapp.R;

public class Instructions extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_instructions);
		}
	
	public void back(View v) {
		Intent i_back=new Intent(Instructions.this,MainActivity.class);
		startActivity(i_back);
			
		}
	
	


}
