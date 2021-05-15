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

    public void btn_Resta(View v){
        signo = "-";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    public void btn_Dividir(View v){
        signo = "/";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    public void btn_Multi(View v){
        signo = "*";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    public void btn_Porcentaje(View v){
        signo = "%";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    public void btn_Raiz(View v){
        signo = "raiz";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    public void btn_Cuadrado(View v){
        signo = "cuadrado";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    public void btn_UnoX(View v){
        signo = "UnoX";
        valor1 = pantallaCalc.getText().toString();
        pantallaCalc.setText(null);
        has_punto = false;
    }

    public void btn_igual(View v){
        if(signo == null){
            pantallaCalc.setText("ERROR!");
        }else if(pantallaCalc.getText().equals("")){
            pantallaCalc.setText("ERROR!");
        }else if((signo.equals("+") || signo.equals("-") || signo.equals("*") || signo.equals("/")) && valor1.equals("")){
            pantallaCalc.setText("ERROR!");
        }else{
            switch (signo){
                default:
                    break;
                case "cuadrado":
                    valor1 = pantallaCalc.getText().toString();
                    num1 = Double.parseDouble((valor1));
                    pantallaCalc.setText(Math.pow(num1, 2) + "");
                    signo = null;
                    break;
                case "raiz":
                    valor1 = pantallaCalc.getText().toString();
                    num1 = Double.parseDouble((valor1));
                    pantallaCalc.setText(Math.sqrt(num1) + "");
                    signo = null;
                    break;
                case "%":
                    num1 = Double.parseDouble((valor1));
                    valor2 = pantallaCalc.getText().toString();
                    num2 = Double.parseDouble(valor2);
                    resultado = (num1 * .100);
                    pantallaCalc.setText(resultado + "");
                    signo = null;
                    break;
                case "UnoX":
                    if(valor1.equals("0")){
                        pantallaCalc.setText("ERROR!");
                        break;
                    }else{
                        valor1 = pantallaCalc.getText().toString();
                        num1 = Double.parseDouble((valor1));
                        resultado = 1 / num1;
                        pantallaCalc.setText(resultado + "");
                        signo = null;
                        break;
                    }
                case "+":
                    valor2 = pantallaCalc.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    resultado = num1 + num2;
                    pantallaCalc.setText(resultado + "");
                    signo = null;
                    break;
                case "-":
                    valor2 = pantallaCalc.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    resultado = num1 - num2;
                    pantallaCalc.setText(resultado + "");
                    signo = null;
                    break;
                case "*":
                    valor2 = pantallaCalc.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    resultado = num1 * num2;
                    pantallaCalc.setText(resultado + "");
                    signo = null;
                    break;
                case "/":
                    valor2 = pantallaCalc.getText().toString();
                    num1 = Double.parseDouble(valor1);
                    num2 = Double.parseDouble(valor2);
                    if(valor2.equals("0")){
                        pantallaCalc.setText("ERROR!");
                        break;
                    }else {
                        resultado = num1 / num2;
                        pantallaCalc.setText(resultado + "");
                        signo = null;
                        break;
                    }
            }
        }
    }

    public void btn_CE(View v){
        pantallaCalc.setText("");
    }
    public void btn_C(View v){
        pantallaCalc.setText("");
    }
    public void btn_borrar(View v){
        if (pantallaCalc.getText().toString().length()>0) {
            pantallaCalc.setText(pantallaCalc.getText().toString().substring(0,pantallaCalc.getText().toString().length()-1));
        }
    }

    }