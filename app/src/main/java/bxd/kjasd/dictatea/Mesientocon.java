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

public class Mesientocon extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesientocon);
        FloatingActionButton fab;

        fab = findViewById(R.id.fbhome);
        imageView = findViewById(R.id.mesientoconimg);
        textView = findViewById(R.id.mesientocontxt);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Mesientocon.this, "Inicio", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Mesientocon.this, MainActivity.class);
                startActivity(intent);


            }


        });
    }

    public void MensajeGripe(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_gripeview);
        textView.setText("Yo me siento con gripe");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_gripe);
        mp.start();
        Toast.makeText(this,"Yo me siento con gripe", Toast.LENGTH_SHORT).show();

    }
    public void MensajeGarganta(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_gargantaview);
        textView.setText("Yo me siento con dolor de garganta");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_dolor_de_garganta);
        mp.start();
        Toast.makeText(this,"Yo me siento con dolor de garganta", Toast.LENGTH_SHORT).show();
    }
    public void MensajeEspalda(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_espaldaview);
        textView.setText("Yo me siento con dolor de espalda");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_dolor_de_espalda);
        mp.start();
        Toast.makeText(this,"Yo me siento con dolor de espalda", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCorazon(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_corazonview);
        textView.setText("Yo me siento con dolor en el corazón");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_dolor_en_el_corazon);
        mp.start();
        Toast.makeText(this,"Yo me siento con dolor en el corazón", Toast.LENGTH_SHORT).show();
    }
    public void MensajeEstomago(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_estomagoview);
        textView.setText("Yo me siento con dolor de estomago");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_dolor_de_estomago);
        mp.start();
        Toast.makeText(this,"Yo me siento con dolor de estomago", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCabeza(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_cabezaview);
        textView.setText("Yo me siento con dolor de cabeza");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_dolor_de_cabeza);
        mp.start();
        Toast.makeText(this,"Yo me siento con dolor de cabeza", Toast.LENGTH_SHORT).show();
    }
    public void MensajeMuela(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_muelaview);
        textView.setText("Yo me siento con dolor de muela");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_dolor_de_muela);
        mp.start();
        Toast.makeText(this,"Yo me siento con dolor de muela", Toast.LENGTH_SHORT).show();
    }
    public void MensajeOido(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_con_dolor_de_oidoview);
        textView.setText("Yo me siento con dolor de oído");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_con_dolor_de_oido);
        mp.start();
        Toast.makeText(this,"Yo me siento con dolor de oído", Toast.LENGTH_SHORT).show();
    }


}