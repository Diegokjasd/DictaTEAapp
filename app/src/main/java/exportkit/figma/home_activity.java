
	 
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
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class home_activity extends Activity {

	
	private View _bg__home_ek2;
	private TextView yo_quiero;
	private TextView yo_me_siento;
	private TextView yo_me_siento_con;
	private TextView yo_voy_a;
	private ImageView vectorgggg;
	private TextView yo_necesito;
	private TextView mis_necesidades;
	private ImageView _quiero;
	private ImageView _siento;
	private ImageView _sientocon;
	private ImageView _yovoy_ek3;
	private ImageView _necesito;
	private ImageView _necesidades_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

/*
		_bg__home_ek2 = (View) findViewById(R.id._bg__home_ek2);
		yo_quiero = (TextView) findViewById(R.id.yo_quiero);
		yo_me_siento = (TextView) findViewById(R.id.yo_me_siento);
		yo_me_siento_con = (TextView) findViewById(R.id.yo_me_siento_con);
		yo_voy_a = (TextView) findViewById(R.id.yo_voy_a);
		vectorgggg = (ImageView) findViewById(R.id.vectorgggg);
		yo_necesito = (TextView) findViewById(R.id.yo_necesito);
		mis_necesidades = (TextView) findViewById(R.id.mis_necesidades);
		_quiero = (ImageView) findViewById(R.id._quiero);
		_siento = (ImageView) findViewById(R.id._siento);
		_sientocon = (ImageView) findViewById(R.id._sientocon);
		_yovoy_ek3 = (ImageView) findViewById(R.id._yovoy_ek3);
		_necesito = (ImageView) findViewById(R.id._necesito);
		_necesidades_ek3 = (ImageView) findViewById(R.id._necesidades_ek3);
	*/
		
		_quiero.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), yoquiero_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_siento.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), yomesiento_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_sientocon.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), yomesientocon_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_yovoy_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), yovoy_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_necesito.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), yonecesito_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_necesidades_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), necesidades_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	