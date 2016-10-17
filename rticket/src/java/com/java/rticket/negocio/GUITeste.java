package com.java.rticket.negocio;

import com.java.rticket.excecao.CampoVazioException;
import com.java.rticket.excecao.CampoExistenteException;
import com.java.rticket.excecao.FormatoInvalidoException;
import com.java.rticket.model.Modulo;
import com.java.rticket.model.Usuario;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class GUITeste {
    public static void main(String[] args) 
            throws NoSuchAlgorithmException, FormatoInvalidoException{
        IFachada fach = new Fachada();
        try{
            Usuario user = new Usuario();
            user.setNome("Yanne");
            user.setLogin("PPYQASW");
            user.setSenha("Senha1");
            fach.inserirUsuario(user);           
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        }catch(CampoVazioException e){
            JOptionPane.showMessageDialog(null, "Preencher todos os campos");
        }catch(CampoExistenteException e){
            JOptionPane.showMessageDialog(null, "Login Existente");
        }
        Iterator<Modulo> iterator;
        
        iterator = fach.listarModulo().iterator();
        
        //Laço para exibir a lista de Modulos.
        while(iterator.hasNext()) {
            Modulo item = (Modulo)iterator.next();
            System.out.println(item.getId()+" "+item.getNome());
        }
    }
}
