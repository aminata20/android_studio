package com.example.yliasitopo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Example_Dialog extends AppCompatDialogFragment {
    private int x = 0;
    private int b = 12;
    private int a = 3;
    private int c = 12;
    private int discriminant = ((b*b) - (4*a*c));
    private int resultat_zero = (-b /(2 * a));
    private int x1 = (int) ((-b-(Math.sqrt(discriminant)))/(2*a));

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (discriminant < 0){
        builder.setTitle("Resultat du discriminant")
                .setMessage("Discriminant est = a  " + " " + discriminant)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }

                });
        }
        return builder.create();
    }

}
