package com.e.imageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rdobrad, rdojon, rdospider;
    private ImageView actors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdobrad=findViewById(R.id.rdobrad);
        rdojon=findViewById(R.id.rdojon);
        rdospider=findViewById(R.id.rdospider);
        actors=findViewById(R.id.actors);

        rdobrad.setOnClickListener(this);
        rdojon.setOnClickListener(this);
        rdospider.setOnClickListener(this);
        actors.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.rdobrad:
                Toast toast = Toast.makeText(this, "Brad Pitt", Toast.LENGTH_SHORT);
                toast.show();
                actors.setImageResource(R.drawable.jon_snow);
                break;

            case R.id.rdojon:
                Toast toast1 = Toast.makeText(this, "Jon Snow", Toast.LENGTH_LONG);
                toast1.show();
                actors.setImageResource(R.drawable.jon_snow);
                break;

            case R.id.rdospider:
                Toast toast2 = Toast.makeText(this, "Spiderman", Toast.LENGTH_SHORT);
                toast2.show();
                actors.setImageResource(R.drawable.spiderman);
                break;
        }
    }
}
