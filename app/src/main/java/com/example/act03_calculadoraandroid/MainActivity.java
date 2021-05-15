package com.example.act03_calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pantallaCalc;
    //Button btnPorcentaje, btnRaiz, btnCuadrado, btnUnoX, btnCE, btnC, btnBorrar, btnDividir, btnNum7, btnNum8, btnNum9, btnMulti, btnNum4,
    //btnNum5, btnNum6, btnResta, btnNum1, btnNum2, btnNum3, btnSuma, btnMasMenos, btnNum0, btnPunto, btnIgual;
    String valor1, valor2, signo;
    Double num1, num2, resultado;
    boolean has_punto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantallaCalc = (TextView) findViewById(R.id.textView_Calc);
        has_punto = false;
    }

    public void btn_Num0(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "0");}
    public void btn_Num1(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "1");}
    public void btn_Num2(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "2");}
    public void btn_Num3(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "3");}
    public void btn_Num4(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "4");}
    public void btn_Num5(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "5");}
    public void btn_Num6(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "6");}
    public void btn_Num7(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "7");}
    public void btn_Num8(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "8");}
    public void btn_Num9(View v){pantallaCalc.setText(pantallaCalc.getText().toString() + "9");}

    public void btn_Punto(View v){
        if(!has_punto){
            if(pantallaCalc.getText().equals("")){
                pantallaCalc.setText("0.");
            }else{
                pantallaCalc.setText(pantallaCalc.getText().toString() + ".");
            }
            has_punto = true;

        }
    }

    public void btn_suma(View v){
        signo = "+";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    





}