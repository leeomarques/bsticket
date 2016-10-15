package com.java.rticket.negocio;

import com.java.rticket.model.Servicos;
import com.java.rticket.dao.DAOFactory;
import com.java.rticket.dao.dados.ServicosDAO;
import java.util.Collection;

public class ControladorServicos {
    
    private ServicosDAO servicosDAO;
    
    public ControladorServicos() {
        servicosDAO = DAOFactory.getServicosDAO();
    }
    
    //Metodo para Inserir Servicos
    public void inserirServicos(Servicos servicos){
        servicosDAO.inserir(servicos);   
    }
    
    //Metodo para Buscar o Servicos pelo ID
    public Servicos buscarServicos(int id){
        return servicosDAO.buscarPorChave(id);
    }
    
    //Metodo para Alterar Servicos
    public void alterarServicos(Servicos servicos){
        servicosDAO.alterar(servicos);
    }
    
    //Listar todos os Servicos
    public Collection<Servicos> listarServicos(){
        return servicosDAO.listarColecao();
    }
}
