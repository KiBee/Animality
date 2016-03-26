package com.example.animality;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

    }
    public void pagecat(View view) {
        Intent pagecat = new Intent(this, pagecat.class);
        startActivity(pagecat);
        finish();
    }

    public void pagedog(View view) {
        Intent pagedog = new Intent(this, pagedog.class);
        startActivity(pagedog);
        finish();
    }
    public void pagefish(View view) {
        Intent pagefish = new Intent(this, pagefish.class);
        startActivity(pagefish);
        finish();
    }
    public void pageparrot(View view) {
        Intent pageparrot = new Intent(this, pageparrot.class);
        startActivity(pageparrot);
        finish();
    }
    public void pageguinea(View view) {
        Intent pageguinea = new Intent(this, pageguinea.class);
        startActivity(pageguinea);
        finish();
    }
    public void pagehumster(View view) {
        Intent pagehumster = new Intent(this, pagehumster.class);
        startActivity(pagehumster);
        finish();
    }
    public void pageraccoon(View view) {
        Intent pageraccoon = new Intent(this, pageraccoon.class);
        startActivity(pageraccoon);
        finish();
    }
}
