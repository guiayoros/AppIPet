package com.pacote.appipet.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.pacote.appipet.Model.Usuario;
import com.pacote.appipet.R;

public class TelaCadastro2 extends AppCompatActivity {

    private EditText email, senha,senhaConfirma;
    private Usuario usuario;
    private Button casdastrar;
    private FirebaseAuth autenticacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro2);

        //Sumir a ActionBar
        getSupportActionBar().hide();

        //Configurar toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbar.setTitle("");
        mTitle.setText("Cadastrar-se");
        if (null != toolbar) {
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirTelaCadastro();
                }
            });

        }

        email = findViewById(R.id.editEmailCadastro);
        senha = findViewById(R.id.editSenhaCadastro);
        senhaConfirma = findViewById(R.id.editSenhaConfirma);
        casdastrar = findViewById(R.id.btnFinalizarCadastro);


        casdastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textEmail = email.getText().toString();
                String textSenha = senha.getText().toString();
                String textConfirmarSenha = senhaConfirma.getText().toString();
                //Validar si os campos foram preenchidos
                if (!textEmail.isEmpty()) {
                    if (!textSenha.isEmpty()) {
                        if (!textConfirmarSenha.isEmpty() || textConfirmarSenha.equals(textSenha)) {
                            usuario.setEmail(textEmail);
                            clientePrincipal();

                        } else {
                            Toast.makeText(TelaCadastro2.this, "A senha não é a mesma escolhida",
                                    Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(TelaCadastro2.this, "Escolha uma senha",
                                Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(TelaCadastro2.this, "Informe seu email",
                            Toast.LENGTH_SHORT).show();
                }

            }

        });
    }

    public void clientePrincipal() {
        startActivity(new Intent(this, ClientePrincipal.class));
    }

    private void abrirTelaCadastro(){
        startActivity(new Intent(TelaCadastro2.this, TelaCadastro.class));
    }

}
