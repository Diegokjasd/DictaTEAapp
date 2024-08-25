package bxd.kjasd.dictatea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CentroAyuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_ayuda);
        FloatingActionButton fab;
    }
    public void callAtras(View view) {
        Toast.makeText(CentroAyuda.this, "Atras", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(CentroAyuda.this, Ayuda.class);
        startActivity(intent);
    }
}