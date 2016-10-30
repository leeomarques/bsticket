package com.rticket.dao.dados;

import com.rticket.model.TipoChamado;
import com.rticket.dao.DAOGenerico;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TipoChamadoDAO extends DAOGenerico<TipoChamado>{

    Collection<TipoChamado> tipoChamados = new ArrayList();

    public TipoChamadoDAO(EntityManager em) {
	super(em);
    }

    public Boolean buscarNome(String nome){
        String sql;
        Boolean verificaNome = true;
        sql = ("SELECT m FROM TipoChamado m WHERE m.nome = :nome");
        Query q = getEntityManager().createQuery(sql, TipoChamado.class);
        q.setParameter("nome", nome);
        tipoChamados = q.getResultList();
        if (tipoChamados.isEmpty()){
            verificaNome = false;
        }
        return verificaNome;
    }
}
