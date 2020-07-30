package com.recorridos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import BTS.*;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1, et2, et3, et4, et5, et6, et7;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editTextNumber);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
        et3 = (EditText) findViewById(R.id.editTextNumber3);
        et4 = (EditText) findViewById(R.id.editTextNumber4);
        et5 = (EditText) findViewById(R.id.editTextNumber5);
        et6 = (EditText) findViewById(R.id.editTextNumber6);
        et7 = (EditText) findViewById(R.id.editTextNumber7);
        tv1 = (TextView) findViewById(R.id.viewOrden);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {"INORDER", "PREORDER", "POSTORDER"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    /***
     * btn_click method: do the action
     * @param view
     */
    public void btn_click(View view) {
        if (verificacion()== true){
            T4BinaryTree<Integer> arbol = new T4BinaryTree<Integer>();
            if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&!et5.getText().toString().equals("")&&!et6.getText().toString().equals("")&&!et7.getText().toString().equals("")) {
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));
                arbol.insert(Integer.parseInt(et5.getText().toString()));
                arbol.insert(Integer.parseInt(et6.getText().toString()));
                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else if(et4.getText().toString().equals("")&&(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et5.getText().toString().equals("")&&!et6.getText().toString().equals("")&&!et7.getText().toString().equals(""))){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et5.getText().toString()));
                arbol.insert(Integer.parseInt(et6.getText().toString()));
                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else if(et5.getText().toString().equals("")&&(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&!et6.getText().toString().equals("")&&!et7.getText().toString().equals(""))){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));
                arbol.insert(Integer.parseInt(et6.getText().toString()));
                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(et6.getText().toString().equals("")&&(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&!et5.getText().toString().equals("")&&!et7.getText().toString().equals(""))){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));
                arbol.insert(Integer.parseInt(et5.getText().toString()));
                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(et7.getText().toString().equals("")&&(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&!et5.getText().toString().equals("")&&!et6.getText().toString().equals(""))){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));
                arbol.insert(Integer.parseInt(et5.getText().toString()));
                arbol.insert(Integer.parseInt(et6.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    et4.getText().toString().equals("")&&et5.getText().toString().equals("")&&et6.getText().toString().equals("")&&et7.getText().toString().equals("")){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));

                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else if(!et1.getText().toString().equals("") && et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    et4.getText().toString().equals("")&&et5.getText().toString().equals("")&&!et6.getText().toString().equals("")&&!et7.getText().toString().equals("")){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et6.getText().toString()));
                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&!et5.getText().toString().equals("")&& et6.getText().toString().equals("")&& et7.getText().toString().equals("")){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));
                arbol.insert(Integer.parseInt(et5.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    et4.getText().toString().equals("")&&!et5.getText().toString().equals("")&&et6.getText().toString().equals("")&&!et7.getText().toString().equals("")){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));

                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et5.getText().toString()));

                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    et4.getText().toString().equals("")&&!et5.getText().toString().equals("")&&!et6.getText().toString().equals("")&&et7.getText().toString().equals("")){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));

                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et5.getText().toString()));

                arbol.insert(Integer.parseInt(et6.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&et5.getText().toString().equals("")&&et6.getText().toString().equals("")&&!et7.getText().toString().equals("")){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));

                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));

                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&et5.getText().toString().equals("")&&!et6.getText().toString().equals("")&&et7.getText().toString().equals("")){
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));

                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));

                arbol.insert(Integer.parseInt(et6.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }

            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    !et4.getText().toString().equals("")&&et5.getText().toString().equals("")&&et6.getText().toString().equals("")&&et7.getText().toString().equals("")) {
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
                arbol.insert(Integer.parseInt(et4.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    et4.getText().toString().equals("")&&!et5.getText().toString().equals("")&&et6.getText().toString().equals("")&&et7.getText().toString().equals("")) {
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));

                arbol.insert(Integer.parseInt(et5.getText().toString()));



                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    et4.getText().toString().equals("")&&et5.getText().toString().equals("")&&!et6.getText().toString().equals("")&&et7.getText().toString().equals("")) {
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));


                arbol.insert(Integer.parseInt(et6.getText().toString()));



                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("") &&
                    et4.getText().toString().equals("")&&et5.getText().toString().equals("")&&et6.getText().toString().equals("")&&!et7.getText().toString().equals("")) {
                arbol.insert(Integer.parseInt(et1.getText().toString()));
                arbol.insert(Integer.parseInt(et2.getText().toString()));
                arbol.insert(Integer.parseInt(et3.getText().toString()));
 
                arbol.insert(Integer.parseInt(et7.getText().toString()));


                if (spinner1.getSelectedItem().toString() == "INORDER") {
                    tv1.setText(arbol.inorder());
                } else if (spinner1.getSelectedItem().toString() == "PREORDER") {
                    tv1.setText(arbol.preorder());
                } else if (spinner1.getSelectedItem().toString() == "POSTORDER") {
                    tv1.setText(arbol.postorder());
                }
            }else{

            }


    }}

    /***
     * verificacion method: verify if any root is empty
     * @return boolean
     */
    public boolean verificacion(){
        if (et1.getText().toString().equals("")){
            Toast.makeText(this,"La raíz no puede estar vacía",Toast.LENGTH_SHORT).show();
            return false;
        }else if (et2.getText().toString().equals("") &&(!et4.getText().toString().equals("") || !et5.getText().toString().equals("") )){
            Toast.makeText(this,"La raíz no puede estar vacía",Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(et3.getText().toString().equals("") &&(!et6.getText().toString().equals("") || !et7.getText().toString().equals("") )){
            Toast.makeText(this,"La raíz no puede estar vacía",Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            return true;
        }


    }

}