package com.example.aluno.meemprestaai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aluno.meemprestaai.Telas.TelaCadastrarProduto;
import com.example.aluno.meemprestaai.Telas.TelaCadastroUsuario;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin          = findViewById(R.id.btn_Logar);
        Button btnCadastro       = findViewById(R.id.btn_CadastrarUsuario);
        //Button btnVoltarCadastro = findViewById(R.id.btnVoltarCadastro);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText campoUsuario = findViewById(R.id.editText_NomeUsuario);
                EditText campoSenha   = findViewById(R.id.editText_CampoSenha);

                String Login = campoUsuario.getText().toString();
                String Senha = campoSenha.getText().toString();

                if(Login.equals("Marcos") && Senha.equals("Uespi")){
                    alertLogin("Login Realizado Com Sucesso!");
                    Intent intentMainAcessaCadastroProdutos = new Intent(MainActivity.this, TelaCadastrarProduto.class);
                    startActivity(intentMainAcessaCadastroProdutos);
                }else{
                    alertLogin("Login ou Senha Incorretos!");
                }
            }
        });

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMainCadastroUsuario = new Intent(MainActivity.this, TelaCadastroUsuario.class);
                startActivity(intentMainCadastroUsuario);
            }
        });
    }
    private void alertLogin(String s){
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
    }
}
