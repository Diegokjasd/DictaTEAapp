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

public class Yo_necesito extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_necesito);
        FloatingActionButton fab;

        fab = findViewById(R.id.fbhome);
        imageView = findViewById(R.id.yonecesitoview);
        textView = findViewById(R.id.yonecesitonecesito);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Yo_necesito.this, "Inicio", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Yo_necesito.this, MainActivity.class);
                startActivity(intent);


            }
        });
    }

    public void MensajeLeer(View view){
        imageView.setImageResource(R.drawable.yo_necesito_leerview);
        textView.setText("Yo necesito leer");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_leer);
        mp.start();
        Toast.makeText(this,"Yo necesito leer", Toast.LENGTH_SHORT).show();

    }
    public void MensajeTarea(View view){
        imageView.setImageResource(R.drawable.yo_necesito_hacer_tareaview);
        textView.setText("Yo necesito hacer tarea");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_hacer_tarea);
        mp.start();
        Toast.makeText(this,"Yo necesito hacer tarea", Toast.LENGTH_SHORT).show();
    }
    public void MensajeEstudiar(View view){
        imageView.setImageResource(R.drawable.yo_necesito_estudiar_para_mi_examenview);
        textView.setText("Yo necesito estudiar para mi examen");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_estudiar_para_mi_examen);
        mp.start();
        Toast.makeText(this,"Yo necesito estudiar para mi examen", Toast.LENGTH_SHORT).show();
    }
    public void MensajeEscribir(View view){
        imageView.setImageResource(R.drawable.yo_necesito_escribirview);
        textView.setText("Yo necesito escribir");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_escribir);
        mp.start();
        Toast.makeText(this,"Yo necesito escribir", Toast.LENGTH_SHORT).show();
    }
    public void MensajeAyudat(View view){
        imageView.setImageResource(R.drawable.yo_necesito_ayuda_con_mi_tareaview);
        textView.setText("Yo necesito ayuda con mi tarea");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_ayuda_con_mi_tarea);
        mp.start();
        Toast.makeText(this,"Yo necesito ayuda con mi tarea", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCortar(View view){
        imageView.setImageResource(R.drawable.yo_necesito_cortar_imagenesview);
        textView.setText("Yo necesito cortar imagenes");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_cortar_imagenes);
        mp.start();
        Toast.makeText(this,"Yo necesito cortar imagenes", Toast.LENGTH_SHORT).show();
    }
    public void MensajeMatematica(View view){
        imageView.setImageResource(R.drawable.yo_necesito_practicar_matematicaview);
        textView.setText("Yo necesito practicar matematicas");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_practicar_matematicas);
        mp.start();
        Toast.makeText(this,"Yo necesito practicar matematicas", Toast.LENGTH_SHORT).show();
    }
    public void MensajeMemorizar(View view){
        imageView.setImageResource(R.drawable.yo_necesito_memorizarview);
        textView.setText("Yo necesito memorizar");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_necesito_memorizar);
        mp.start();
        Toast.makeText(this,"Yo necesito memorizar", Toast.LENGTH_SHORT).show();
    }

}