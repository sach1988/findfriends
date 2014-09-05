/**
 * 
 */
package com.example.zonamigosfusa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.zonamigosfusa.otro.SecondActivity;

/**
 * @author Nestor Diazgranados
 * La clase para ser Actividad necesita heredar ese comportamiento.
 */
public class MainActivity extends ActionBarActivity {

	//Nestor Diazgranados
	//-- Este bot�n existe en el layout activity_main.
	private Button segundaActividad; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//-- Se pueden utilizar las vistas del layout activity_main de la siguiente manera:
		segundaActividad=(Button)findViewById(R.id.button1);
		//-- Ejemplo de un evento para un bot�n.
		segundaActividad.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Es posible tambi�n llamar la siguiente actividad de dos formas:
				
				Intent i= new Intent(v.getContext(),SecondActivity.class);
				//Intent i= new Intent("com.example.zonamigosfusa.otro.SecondActivity");
				startActivity(i);
			}
		});
		
		
	}
}
