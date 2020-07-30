package com.recorridos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import BTS.*;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1, et2, et3, et4, et5, et6, et7;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editTextNumber);
        et2 = (EditText)findViewById(R.id.editTextNumber2);
        et3 = (EditText)findViewById(R.id.editTextNumber3);
        et4 = (EditText)findViewById(R.id.editTextNumber4);
        et5 = (EditText)findViewById(R.id.editTextNumber5);
        et6 = (EditText)findViewById(R.id.editTextNumber6);
        et7 = (EditText)findViewById(R.id.editTextNumber7);
        tv1 = (TextView)findViewById(R.id.viewOrden);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        String[] opciones = {"INORDER","PREORDER","POSTORDER"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }


    public void btn_click(View view) {

        T4BinaryTree<Integer> arbol = new T4BinaryTree<Integer>();
        arbol.insert(Integer.parseInt(et1.getText().toString()));
        arbol.insert(Integer.parseInt(et2.getText().toString()));
        arbol.insert(Integer.parseInt(et3.getText().toString()));
        arbol.insert(Integer.parseInt(et4.getText().toString()));
        arbol.insert(Integer.parseInt(et5.getText().toString()));
        arbol.insert(Integer.parseInt(et6.getText().toString()));
        arbol.insert(Integer.parseInt(et7.getText().toString()));


        if (spinner1.getSelectedItem().toString() == "INORDER"){
            System.out.println("I N O R D E R");
            tv1.setText(arbol.inorder());
        } else if (spinner1.getSelectedItem().toString() == "PREORDER"){
            System.out.println("P R E O R D E R");
            tv1.setText(arbol.preorder());
        }else if (spinner1.getSelectedItem().toString() == "POSTORDER"){
            System.out.println("P O S T O R D E R");
            tv1.setText(arbol.postorder());
        }
    }

}