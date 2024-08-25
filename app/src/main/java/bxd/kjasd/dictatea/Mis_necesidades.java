package bxd.kjasd.dictatea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Mis_necesidades extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_necesidades);

        fab = findViewById(R.id.fbhome);
        imageView = findViewById(R.id.necesidadesview);
        textView = findViewById(R.id.Misnecesidadesnecesidades);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Mis_necesidades.this, "Inicio", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Mis_necesidades.this, MainActivity.class);
                startActivity(intent);


            }
        });

    }
    public void MensajeBanio2(View view){
        imageView.setImageResource(R.drawable.necesito_ir_al_banioview);
        textView.setText("Necesito ir al baño");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_ir_al_banio);
        mp.start();
        Toast.makeText(this,"Necesito ir al baño", Toast.LENGTH_SHORT).show();

    }
    public void MensajePeinarme(View view){
        imageView.setImageResource(R.drawable.necesito_peinarmeview);
        textView.setText("Necesito peinarme");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_peinarme);
        mp.start();
        Toast.makeText(this,"Necesito peinarme", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCepillarme(View view){
        imageView.setImageResource(R.drawable.necesito_cepillarme_los_dientesview);
        textView.setText("Necesito cepillarme los dientes");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_cepillarme_los_dientes);
        mp.start();
        Toast.makeText(this,"Necesito cepillarme los dientes", Toast.LENGTH_SHORT).show();
    }
    public void MensajeBaniarme2(View view){
        imageView.setImageResource(R.drawable.necesito_baniarmeview);
        textView.setText("Necesito bañarme");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_baniarme);
        mp.start();
        Toast.makeText(this,"Necesito bañarme", Toast.LENGTH_SHORT).show();
    }
    public void MensajeJabon(View view){
        imageView.setImageResource(R.drawable.necesito_usar_jabonview);
        textView.setText("Necesito usar jabon");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_usar_jabon);
        mp.start();
        Toast.makeText(this,"Necesito usar jabon", Toast.LENGTH_SHORT).show();
    }
    public void MensajeShampoo(View view){
        imageView.setImageResource(R.drawable.necesito_usar_shampooview);
        textView.setText("Necesito usar shampoo");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_usar_shampoo);
        mp.start();
        Toast.makeText(this,"Necesito usar shampoo", Toast.LENGTH_SHORT).show();
    }
    public void MensajeLavarme(View view){
        imageView.setImageResource(R.drawable.necesito_lavarme_la_caraview);
        textView.setText("Yo necesito lavarme la cara");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_lavarme_la_cara);
        mp.start();
        Toast.makeText(this,"Necesito lavarme la cara", Toast.LENGTH_SHORT).show();
    }
    public void MensajeSos(View view){
        imageView.setImageResource(R.drawable.necesito_ayuda);
        textView.setText("Necesito ayuda");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.necesito_ayuda);
        mp.start();
        Toast.makeText(this,"Necesito ayuda", Toast.LENGTH_SHORT).show();
    }
}