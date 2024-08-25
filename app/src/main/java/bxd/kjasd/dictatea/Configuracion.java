package bxd.kjasd.dictatea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        BottomNavigationView bottomNavigationView;

        bottomNavigationView=findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.Configuration);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.inicio:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.ayuda:
                        startActivity(new Intent(getApplicationContext(), Ayuda.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Configuration:
                        return true;




                }
                return false;
            }
        });
    }
    public void Switchmessage(View view) {
        Toast.makeText(Configuracion.this, "Proximamente!", Toast.LENGTH_SHORT).show();
    }
}