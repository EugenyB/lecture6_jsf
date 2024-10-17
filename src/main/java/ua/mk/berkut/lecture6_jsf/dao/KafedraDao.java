package ua.mk.berkut.lecture6_jsf.dao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ua.mk.berkut.lecture6_jsf.data.Kafedra;

import java.util.List;

@Stateless
public class KafedraDao {
    @PersistenceContext
    private EntityManager em;

    public List<Kafedra> findAll() {
        return em.createNamedQuery("Kafedra.findAll", Kafedra.class).getResultList();
    }
}
