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

public class Yo_voy extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_voy);
        FloatingActionButton fab;

        fab = findViewById(R.id.fbhome);
        imageView = findViewById(R.id.yovoyview);
        textView = findViewById(R.id.yovoyvoy);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Yo_voy.this, "Inicio", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Yo_voy.this, MainActivity.class);
                startActivity(intent);


            }
        });
    }
    public void MensajeEscuela(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_la_escuelaview);
        textView.setText("Yo voy a la escuela");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_a_la_escuela);
        mp.start();
        Toast.makeText(this,"Yo voy a la escuela", Toast.LENGTH_SHORT).show();

    }
    public void MensajeParque(View view){
        imageView.setImageResource(R.drawable.yo_voy_al_parqueview);
        textView.setText("Yo voy al parque");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_al_parque);
        mp.start();
        Toast.makeText(this,"Yo voy al parque", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCine(View view){
        imageView.setImageResource(R.drawable.yo_voy_al_cineview);
        textView.setText("Yo voy al cine");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_al_cine);
        mp.start();
        Toast.makeText(this,"Yo voy al cine", Toast.LENGTH_SHORT).show();
    }
    public void MensajeAbuelos(View view){
        imageView.setImageResource(R.drawable.yo_voy_al_la_casa_de_mis_abuelosview);
        textView.setText("Yo voy a la casa de mis abuelos");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_a_la_casa_de_mis_abuelos);
        mp.start();
        Toast.makeText(this,"Yo voy a la casa de mis abuelos", Toast.LENGTH_SHORT).show();
    }
    public void MensajeAmigos(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_la_casa_de_mis_amigosview);
        textView.setText("Yo voy a la casa de mis amigos");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_a_la_casa_de_mis_amigos);
        mp.start();
        Toast.makeText(this,"Yo voy a la casa de mis amigos", Toast.LENGTH_SHORT).show();
    }
    public void MensajeJuegos(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_los_juegossview);
        textView.setText("Yo voy a los juegos");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_a_los_juegos);
        mp.start();
        Toast.makeText(this,"Yo voy a los juegos", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCasa(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_mi_casaview);
        textView.setText("Yo voy a mi casa");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_a_mi_casa);
        mp.start();
        Toast.makeText(this,"Yo voy a mi casa", Toast.LENGTH_SHORT).show();
    }
    public void MensajeAjugar(View view){
        imageView.setImageResource(R.drawable.yo_voy_a_jugarview);
        textView.setText("Yo voy a jugar");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_voy_a_jugar);
        mp.start();
        Toast.makeText(this,"Yo voy a jugar", Toast.LENGTH_SHORT).show();
    }

}