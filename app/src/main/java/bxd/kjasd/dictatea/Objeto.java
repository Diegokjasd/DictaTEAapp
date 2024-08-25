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

public class Objeto extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto);
        FloatingActionButton fab;
        imageView = findViewById(R.id.quieroviewobj);
        textView=findViewById(R.id.yoquieroquieroobj);



    }
    public void callAtras(View view) {
        Toast.makeText(Objeto.this, "Atras", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Objeto.this, Yo_Quiero.class);
        startActivity(intent);
    }
    public void callHome(View view) {
        Toast.makeText(Objeto.this, "Inicio", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Objeto.this, MainActivity.class);
        startActivity(intent);
    }

    public void MensajeLapiz(View view){
        imageView.setImageResource(R.drawable.yo_quiero_el_lapizview);
        textView.setText("Yo el lápiz");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_el_lapiz);
        mp.start();
        Toast.makeText(this,"Yo quiero el lápiz", Toast.LENGTH_SHORT).show();

    }
    public void MensajePelota(View view){
        imageView.setImageResource(R.drawable.yo_quiero_la_pelotaview);
        textView.setText("Yo quiero la pelota");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_la_pelota);
        mp.start();
        Toast.makeText(this,"Yo quiero la pelota ", Toast.LENGTH_SHORT).show();
    }
    public void MensajeJuguete(View view){
        imageView.setImageResource(R.drawable.yo_quiero_el_jugueteview);
        textView.setText("Yo quiero el juguete");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_el_juguete);
        mp.start();
        Toast.makeText(this,"Yo quiero el juguete", Toast.LENGTH_SHORT).show();
    }
    public void MensajeLibro(View view){
        imageView.setImageResource(R.drawable.yo_quiero_el_libroview);
        textView.setText("Yo quiero el libro");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_el_libro);
        mp.start();
        Toast.makeText(this,"Yo quiero el libro", Toast.LENGTH_SHORT).show();
    }
    public void MensajePeluche(View view){
        imageView.setImageResource(R.drawable.yo_quiero_el_pelucheview);
        textView.setText("Yo quiero el peluche");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_el_peluche);
        mp.start();
        Toast.makeText(this,"Yo quiero el peluche", Toast.LENGTH_SHORT).show();
    }
    public void MensajeControl(View view){
        imageView.setImageResource(R.drawable.yo_quiero_el_controlview);
        textView.setText("Yo quiero el control");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_el_control);
        mp.start();
        Toast.makeText(this,"Yo quiero el control", Toast.LENGTH_SHORT).show();
    }
    public void MensajeBotella(View view){
        imageView.setImageResource(R.drawable.yo_quiero_la_botellaview);
        textView.setText("Yo quiero la botella");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_la_botella);
        mp.start();
        Toast.makeText(this,"Yo quiero la botella", Toast.LENGTH_SHORT).show();
    }
    public void MensajeReloj(View view){
        imageView.setImageResource(R.drawable.yo_quiero_el_relojview);
        textView.setText("Yo quiero el reloj");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_el_reloj);
        mp.start();
        Toast.makeText(this,"Yo quiero el reloj", Toast.LENGTH_SHORT).show();
    }



}