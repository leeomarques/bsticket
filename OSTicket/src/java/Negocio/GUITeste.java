package Negocio;

import ClassesBasicas.*;
import Excecoes.*;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class GUITeste {
    public static void main(String[] args){
        IFachada fach = new Fachada();
        try{
            Usuario user = new Usuario();
            user.setNome("Yanne");
            user.setLogin("YYY");
            user.setSenha("1234");
            fach.inserirUsuario(user);           
        }catch(CampoVazioException e){
            JOptionPane.showMessageDialog(null, "Preencher todos os campos");
        }catch(LoginExistenteException e){
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
