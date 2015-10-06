package com.izv.dam.dialogo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* si veo un string en vuestro proyecto ...*/
    public void dialogo(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("…");
        LayoutInflater inflater = LayoutInflater.from(this);
        int res = R.layout.dialogo_principal;
        final View vista = inflater.inflate(res, null);
        alert.setView(vista);
        alert.setPositiveButton("insertar",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                });
        alert.setNegativeButton("cancelar",null);
        alert.show();
    }
}