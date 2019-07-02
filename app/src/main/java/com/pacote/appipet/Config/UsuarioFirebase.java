package com.pacote.appipet.Config;

import com.google.firebase.auth.FirebaseAuth;

public class UsuarioFirebase {

    public static String getIdUsuario(){

        FirebaseAuth autenticacao = FirebaseConfig.getFirebaseAutenticacao();
        return autenticacao.getCurrentUser().getUid();
    }

    public static String getEmail(){

        FirebaseAuth autenticacao = FirebaseConfig.getFirebaseAutenticacao();
        return autenticacao.getCurrentUser().getEmail();
    }
}
