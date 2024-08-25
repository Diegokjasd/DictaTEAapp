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

public class Yo_Quiero extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yo_quiero);
        FloatingActionButton fab;

        fab = findViewById(R.id.fbhome);
        imageView = findViewById(R.id.quieroview);
        textView=findViewById(R.id.yoquieroquiero);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Yo_Quiero.this, "Inicio",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Yo_Quiero.this,MainActivity.class);
                startActivity(intent);



    }





});


    }
    public void CallObjeto(View view) {
        Toast.makeText(Yo_Quiero.this, "Objetos", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Yo_Quiero.this, Objeto.class);
        startActivity(intent);
    }
    public void MensajeComer(View view){
        imageView.setImageResource(R.drawable.yo_quiero_comerview);
        textView.setText("Yo quiero comer");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_comer);
        mp.start();
        Toast.makeText(this,"Yo quiero comer", Toast.LENGTH_SHORT).show();

    }
    public void Mensajebeber(View view){
        imageView.setImageResource(R.drawable.yo_quiero_beberview);
        textView.setText("Yo quiero beber");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_beber);
        mp.start();
        Toast.makeText(this,"Yo quiero beber ", Toast.LENGTH_SHORT).show();
    }
    public void Mensajebanio(View view){
        imageView.setImageResource(R.drawable.yo_quiero_ir_al_banioview);
        textView.setText("Yo quiero ir al baño");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_ir_al_banio);
        mp.start();
        Toast.makeText(this,"Yo quiero ir al baño", Toast.LENGTH_SHORT).show();
    }
    public void Mensajejugar(View view){
        imageView.setImageResource(R.drawable.yo_quiero_jugarview);
        textView.setText("Yo quiero jugar");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_jugar);
        mp.start();
        Toast.makeText(this,"Yo quiero jugar", Toast.LENGTH_SHORT).show();
    }
    public void Mensajedormir(View view){
        imageView.setImageResource(R.drawable.yo_quiero_dormirview);
        textView.setText("Yo quiero dormir");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_dormir);
        mp.start();
        Toast.makeText(this,"Yo quiero dormir", Toast.LENGTH_SHORT).show();
    }
    public void Mensajebaniarme(View view){
        imageView.setImageResource(R.drawable.yo_quiero_baniarmeview);
        textView.setText("Yo quiero bañarme");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_baniarme);
        mp.start();
        Toast.makeText(this,"Yo quiero bañarme", Toast.LENGTH_SHORT).show();
    }
    public void Mensajehablar(View view){
        imageView.setImageResource(R.drawable.yo_quiero_hablarview);
        textView.setText("Yo quiero hablar");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_hablar);
        mp.start();
        Toast.makeText(this,"Yo quiero hablar", Toast.LENGTH_SHORT).show();
    }
    public void MensajeCaminar(View view){
        imageView.setImageResource(R.drawable.yo_quiero_caminarview);
        textView.setText("Yo quiero caminar");
        MediaPlayer mp=MediaPlayer.create(this,R.raw.yo_quiero_caminar);
        mp.start();
        Toast.makeText(this,"Yo quiero caminar", Toast.LENGTH_SHORT).show();
    }

}
