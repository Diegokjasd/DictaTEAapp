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

public class Yo_Mesiento extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_mesiento);
        FloatingActionButton fab;

        fab = findViewById(R.id.fbhome);
        imageView = findViewById(R.id.mesientoview);
        textView=findViewById(R.id.yomesientisiento);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Yo_Mesiento.this, "Inicio",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Yo_Mesiento.this,MainActivity.class);
                startActivity(intent);



            }





        });
    }

    public void MensajeFeliz(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_felizview);
        textView.setText("Yo me siento feliz");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_feliz);
        mp.start();
        Toast.makeText(this,"Yo me siento feliz", Toast.LENGTH_SHORT).show();

    }
    public void MensajeTriste(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_tristeview);
        textView.setText("Yo me siento triste");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_triste);
        mp.start();
        Toast.makeText(this,"Yo me siento triste ", Toast.LENGTH_SHORT).show();
    }
    public void MensajeEnojado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_enojadoview);
        textView.setText("Yo me siento enojado");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_enojado);
        mp.start();
        Toast.makeText(this,"Yo me siento enojado", Toast.LENGTH_SHORT).show();
    }
    public void MensajeSorprendido(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_sorprendidoview);
        textView.setText("Yo me siento sorprendido");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_sorprendido);
        mp.start();
        Toast.makeText(this,"Yo me siento sorprendido", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCansado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_cansadoview);
        textView.setText("Yo me siento cansado");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_cansado);
        mp.start();
        Toast.makeText(this,"Yo me siento cansado", Toast.LENGTH_SHORT).show();
    }
    public void MensajeTranquilo(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_tranquiloview);
        textView.setText("Yo me siento tranquilo");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_tranquilo);
        mp.start();
        Toast.makeText(this,"Yo me siento tranquilo", Toast.LENGTH_SHORT).show();
    }
    public void MensajeAsustado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_asustadoview);
        textView.setText("Yo me siento asustado");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_asustado);
        mp.start();
        Toast.makeText(this,"Yo me siento asustado", Toast.LENGTH_SHORT).show();
    }
    public void MensajeAburrido(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_aburridoview);
        textView.setText("Yo me siento aburrido");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_aburrido);
        mp.start();
        Toast.makeText(this,"Yo me siento aburrido", Toast.LENGTH_SHORT).show();
    }

    public void MensajeHambriento(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_hambrientoview);
        textView.setText("Yo me siento hambriento");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_hambriento);
        mp.start();
        Toast.makeText(this,"Yo me siento hambriento", Toast.LENGTH_SHORT).show();
    }
    public void MensajeAvergonzado(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_avergonzadoview);
        textView.setText("Yo me siento avergonzado");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_avergonzado);
        mp.start();
        Toast.makeText(this,"Yo me siento avergonzado", Toast.LENGTH_SHORT).show();
    }
    public void MensajeEnfermo(View view){
        imageView.setImageResource(R.drawable.yo_me_siento_tristeview);
        textView.setText("Yo me siento enfermo");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_me_siento_triste);
        mp.start();
        Toast.makeText(this,"Yo me siento enfermo", Toast.LENGTH_SHORT).show();
    }








}