package ua.mk.berkut.lecture6_jsf.beans;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import ua.mk.berkut.lecture6_jsf.dao.KafedraDao;
import ua.mk.berkut.lecture6_jsf.data.Kafedra;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class KafedraBean implements Serializable {

    @EJB
    private KafedraDao kafedraDao;

    public List<Kafedra> getKafedras() {
        return kafedraDao.findAll();
    }
}
