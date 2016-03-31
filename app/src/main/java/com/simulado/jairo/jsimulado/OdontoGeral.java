package com.simulado.jairo.jsimulado;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class OdontoGeral extends Activity {
    //ArrayList<String> selection = new ArrayList<String>();
    RadioButton RespostaA, RespostaB, RespostaC, RespostaD;
    RadioGroup radioGroup;
    TextView txtResposta;
    Button btnConfirmar;

    /*Button btnConfirmar,btnConfirmar1;
    CheckBox RespostaA, RespostaB, RespostaC, RespostaD;
    CheckBox RespostaA1, RespostaB1, RespostaC1, RespostaD1;
    EditText edtResposta, edtResposta1;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odonto_geral);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RespostaA = (RadioButton) findViewById(R.id.RespostaA);
        RespostaB = (RadioButton) findViewById(R.id.RespostaB);
        RespostaC = (RadioButton) findViewById(R.id.RespostaC);
        RespostaD = (RadioButton) findViewById(R.id.RespostaD);
        txtResposta = (TextView) findViewById(R.id.txtResposta);
        txtResposta.setEnabled(false);
    }

    /*radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

    {
        public void onCheckedChanged (RadioGroup group,int checkedId){
        if (checkedId == RespostaB.getId()) {
            DisplayToast("A resposta certa: " + RespostaB.getText() + ", Parabéns");
        } else {
            DisplayToast("A resposta errada.!");
        }
    }
    }

    );
}
    public void DisplayToast(String string) {
        Toast mToast = Toast.makeText(this, string, Toast.LENGTH_LONG);
        mToast.setGravity(Gravity.TOP, 0, 400);
        mToast.show();
        }
}
//Mo

    /*public void selectItem(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.RespostaA:
                if (checked) {
                    selection.add("Você Errou!");
                    //nomeDoButtonGroup.clearSelection();
                } /*else {
                    selection.remove("Você Errou!");
                }
                break;
            case R.id.RespostaB:
                if (checked) {
                    selection.add("Parabéns. A resposta está correta!");
                } /*else {
                    selection.remove("Parabéns. A resposta está correta!");
                }
                break;
            case R.id.RespostaC:
                if (checked) {
                    selection.add("Você Errou!");
                } /*else {
                    selection.remove("Você Errou!");
                }
                break;
            case R.id.RespostaD:
                if (checked) {
                    selection.add("Você Errou!");
                } /*else {
                    selection.remove("Você Errou!");
                }
                break;
        }

    }
    public void clickConfirmar(View view) {
        String final_selection = "";
        for (String Selections : selection) {
            final_selection = Selections;// + "\n";
        }
        txtResposta.setText(final_selection);
        txtResposta.setEnabled(true);
    }*/
}

/*
        //Conteudo questÃ£o 01
        edtResposta = (EditText) findViewById(R.id.edtResposta);
        RespostaA = (CheckBox) findViewById(R.id.RespostaA);
        RespostaB = (CheckBox) findViewById(R.id.RespostaB);
        RespostaC = (CheckBox) findViewById(R.id.RespostaC);
        RespostaD = (CheckBox) findViewById(R.id.RespostaD);
        btnConfirmar = (Button) findViewById(R.id.btnConfirmar);

        //Conteudo questÃ£o 02
        edtResposta1 = (EditText) findViewById(R.id.edtResposta1);
        RespostaA1 = (CheckBox) findViewById(R.id.RespostaA1);
        RespostaB1 = (CheckBox) findViewById(R.id.RespostaB1);
        RespostaC1 = (CheckBox) findViewById(R.id.RespostaC1);
        RespostaD1 = (CheckBox) findViewById(R.id.RespostaD1);
        btnConfirmar1 = (Button) findViewById(R.id.btnConfirmar1);


        //QuestÃ£o 01
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaA.isChecked())
                    RespostaA.setChecked(false);
                edtResposta.setText("VocÃª errou");
            }
        });

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaB.isChecked())
                    RespostaB.setChecked(true);
                edtResposta.setText("ParabÃ©ns! A resposta estÃ¡ correta");
            }
        });
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaC.isChecked())
                    RespostaC.setChecked(false);
                edtResposta.setText("VocÃª errou");
            }
        });
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaD.isChecked())
                    RespostaD.setChecked(false);
                edtResposta.setText("VocÃª errou");
            }
        });

        //QuestÃ£o 02
        btnConfirmar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaA1.isChecked())
                    RespostaA1.setChecked(false);
                edtResposta1.setText("VocÃª errou");
            }
        });

        btnConfirmar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaB1.isChecked())
                    RespostaB1.setChecked(false);
                edtResposta1.setText("Voce errou");
            }
        });
        btnConfirmar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaC1.isChecked())
                    RespostaC1.setChecked(false);
                edtResposta1.setText("ParabÃ©ns! A resposta estÃ¡ correta");
            }
        });
        btnConfirmar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RespostaD1.isChecked())
                    RespostaD1.setChecked(false);
                edtResposta1.setText("VocÃª errou");
            }
        });

    }

    public void clickConfirmar(View view) {
        if (RespostaA.isChecked())
            edtResposta.setText("VocÃª errou.");
        if (RespostaB.isChecked())
            edtResposta.setText("ParabÃ©ns! A resposta estÃ¡ correta");
        if (RespostaC.isChecked())
            edtResposta.setText("VocÃª errou.");
        if (RespostaD.isChecked())
            edtResposta.setText("VocÃª errou.");
    }*/

