/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Produit;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import service.ProduitSessionBean;

/**
 *
 * @author 4g
 */
@ManagedBean
@SessionScoped
public class produitController {
    @EJB
    private ProduitSessionBean produitSessionBean;

    
    public produitController() {
    }
    
    public Produit find()
    {
        return this.produitSessionBean.find();
    }
    
    public List<Produit> findAll()
    {
        return produitSessionBean.findAll();
    }
}
