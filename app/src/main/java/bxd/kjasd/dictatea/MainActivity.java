package bxd.kjasd.dictatea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.inicio);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.inicio:
                        return true;
                    case R.id.ayuda:
                        startActivity(new Intent(getApplicationContext(), Ayuda.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Configuration:
                        startActivity(new Intent(getApplicationContext(), Configuracion.class));
                        overridePendingTransition(0,0);
                        return true;



                }
                return false;
            }
        });
    }



    public void callYoQuiero (View view){
        Intent i= new Intent(this, Yo_Quiero.class);
        startActivity(i);

    }

    public void callMeSiento (View view){
        Intent i= new Intent(this, Yo_Mesiento.class);
        startActivity(i);

    }
    public void callMesientocon (View view){
        Intent i= new Intent(this, Mesientocon.class);
        startActivity(i);

    }

    public void callYovoy (View view){
        Intent i= new Intent(this, Yo_voy.class);
        startActivity(i);

    }
    public void callYonecesito(View view){
        Intent i= new Intent(this, Yo_necesito.class);
        startActivity(i);

    }
    public void callMisNecesidades (View view){
        Intent i= new Intent(this, Mis_necesidades.class);
        startActivity(i);

    }

}
