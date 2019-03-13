/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Produit;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author 4g
 */
@Stateless
@LocalBean
public class ProduitSessionBean {

    public Produit find(){
        return new Produit(1,"nom1",100);
    }
    
    public List<Produit> findAll(){
        List<Produit> listProduit = new ArrayList<Produit>();
        listProduit.add(new Produit(1,"nom1",100));
        listProduit.add(new Produit(2,"nom2",200));
        listProduit.add(new Produit(3,"nom3",300));
        return listProduit;
    }
}
