package com.application.apex.toastandalert;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Chama o toast
    public void showToast (View view){
        Toast toast = Toast.makeText(this, "Novo Toast", Toast.LENGTH_LONG);
        toast.show();

        // Comeca a tocar o player
        MediaPlayer media = MediaPlayer.create(this,R.raw.item_osso);
        media.start();
    }
}

