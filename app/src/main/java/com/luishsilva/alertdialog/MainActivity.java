package com.luishsilva.alertdialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View alertDialog = findViewById(R.id.alertDialog);
        alertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FireMissilesDialogFragment fireMissilesDialogFragment = new FireMissilesDialogFragment();
                fireMissilesDialogFragment.show(getSupportFragmentManager(),"");
            }
        });

        View alertDialogWithList = findViewById(R.id.alertDialogWithList);
        alertDialogWithList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogWithListItens dialogWithListItens = new DialogWithListItens();
                dialogWithListItens.show(getSupportFragmentManager(),"");
            }
        });

        View alertDialogMultipleChoice = findViewById(R.id.alertDialogMultipleChoice);
        alertDialogMultipleChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogMultChoiceItens dialogMultChoiceItens = new DialogMultChoiceItens();
                dialogMultChoiceItens.show(getSupportFragmentManager(),"");
            }
        });

        View alertDialogPersonalized = findViewById(R.id.alertDialogPersonalized);
        alertDialogPersonalized.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogPersonalized dialogPersonalized = new DialogPersonalized();
                dialogPersonalized.show(getSupportFragmentManager(),"");
            }
        });

        View alertDialogActivity = findViewById(R.id.alertDialogActivity);
        alertDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DialogActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });
    }
}
