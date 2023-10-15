/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import ma.projet.entities.Produit;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lachgar
 */
public class Test {
    
     // Fonction pour convertir une chaîne de caractères en objet Date
    public static Date parseDate(String dateStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Fonction pour formater une date en chaîne de caractères
//    public static String formatDate(Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        return sdf.format(date);
//    }
    
    public static void main(String[] args) {

        
          Produit p1 = new Produit("ZARA","ref1",new Date(),100,"p1");
//        Produit p2 = new Produit("PULL & BEAR","ref2",new Date(),100,"p2");
//        Produit p3 = new Produit("TN","ref3",new Date(),100,"p3");
//        Produit p4 = new Produit("NIKE","ref4",new Date(),100,"p4");
//        Produit p5 = new Produit("ADIDAS","ref5",new Date(),100,"p5");
        
        ProduitService ps = new ProduitService();
        
//        ArrayList <Produit> listproduit= new ArrayList<Produit>();
//        listproduit.add(p1);
//        listproduit.add(p2);
//        listproduit.add(p3);
//        listproduit.add(p4);
//        listproduit.add(p5);
        
//        ps.create(p1);
//        ps.create(p2);
//        ps.create(p3);
//        ps.create(p4);
//        ps.create(p5);
        
                // liste des produits   M1
//        for (Produit p : ps.findAll(p1)){
//                System.out.println("designation : "+p.getDesignation());
//        }
        
              // les infos de produits id = 2 
        //System.out.println(ps.findById(2));
        
             // supprimer le produit id = 3
        // ps.delete(ps.findById(3));
        
        
                // modification du id=1
        
//        Produit pp = ps.findById(1);
//        pp.setPrix(1000);
//        ps.update(pp);
        
        
          
   
         
         // ps.update(ps.findById(5));
         // pour tester = return true
         //System.out.println( ps.update(ps.findById(5)));
        
        
        
                         // liste des produits   prix sup à 100 
//        for (Produit p : ps.findAll(p1)){
//            if(p.getPrix()>100){
//                System.out.println(p);
//            }
//        }
        
        
   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrer la date debutante (YYYY-MM-DD) : ");
        Date dateDebut = parseDate(sc.next());
        System.out.println("Entrer la date fermante (YYYY-MM-DD) : ");
        Date dateFin = parseDate(sc.next());
        
  
        
        // 2023-10-01
        
        for (Produit p : ps.findAll(p1)){
            if(p.getDate_Achat().compareTo(dateDebut)>=0    &&     p.getDate_Achat().compareTo(dateFin)  <=0 )
            {
                System.out.println(p);
                }
        }
        
        
        
        
        
            
        
     
          
        
    }
    
}
