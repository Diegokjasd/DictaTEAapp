
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		configuracion
	 *	@date 		Monday 11th of July 2022 11:09:51 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class splashscreen_activity extends Activity {

	
	private View __bg__splashscreen_ek2;
	private ImageView dictatea_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);

		
		__bg__splashscreen_ek2 = (View) findViewById(R.id.__bg__splashscreen_ek2);
		dictatea_ek1 = (ImageView) findViewById(R.id.dictatea_ek1);
	
		
		__bg__splashscreen_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	