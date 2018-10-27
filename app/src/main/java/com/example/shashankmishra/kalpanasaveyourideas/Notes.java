package com.example.shashankmishra.kalpanasaveyourideas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
    }

    public void noteBack(View view)
    {

        Intent intent=new Intent(Notes.this,TheWall.class);
        startActivity(intent);
    }

    //Alert Box

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit ?")
                .setMessage("Are you Sure Then Press YES")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Notes.super.onBackPressed();
                    }
                })
                .setCancelable(true)
                .show();


    }
}
