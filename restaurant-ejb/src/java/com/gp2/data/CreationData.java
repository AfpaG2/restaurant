package com.gp2.data;

import com.gp2.persistence.carte.CodeTVA;
import com.gp2.persistence.commande.Emplacement;
import com.gp2.persistence.carte.Formule;
import com.gp2.persistence.carte.InfosProduit;
import com.gp2.persistence.carte.Ingredient;
import com.gp2.persistence.carte.NatureProduit;
import com.gp2.persistence.carte.Produit;
import com.gp2.persistence.Statut;
import com.gp2.persistence.company.Employe;
import com.gp2.persistence.company.Poste;
import com.gp2.persistence.company.Restaurant;
import com.gp2.persistence.carte.Carte;
import com.gp2.persistence.carte.TypePlat;
import com.gp2.persistence.commande.Commande;
import com.gp2.persistence.commande.LigneCommande;
import com.gp2.persistence.company.Role;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CreationData implements CreationDataLocal {

    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

    @Override
    public void creerDonnees() {
        
        //==================================================================================|
        //                                      statut                                      |
        //==================================================================================|
       
       //==================================================================================|
        //                                      statut                                      |
        //==================================================================================|
       
        //Carte
        Carte carte = new Carte();
        
        
        
        // commande 10
        Statut statut1001 = new Statut(1001, "commande", "commandé");
        Statut statut1002 = new Statut(1002, "commande", "en cuisine");
        Statut statut1003 = new Statut(1003, "commande", "préparation terminé");
        Statut statut1004 = new Statut(1004, "commande", "servie");
        Statut statut1005 = new Statut(1005, "commande", "annulé");
        Statut statut1006 = new Statut(1006, "commande", "indisponible");
        Statut statut1007 = new Statut(1007, "commande", "terminé"); // quand la commande est réglé
        
        // ligne Commande 20
        Statut statut2001 = new Statut(2001, "ligneCommande", "disponible");
        Statut statut2002 = new Statut(2002, "ligneCommande", "annulé");
        Statut statut2003 = new Statut(2003, "ligneCommande", "indisponible");
        Statut statut2004 = new Statut(2004, "ligneCommande", "En attente de préparation");
        Statut statut2005 = new Statut(2005, "ligneCommande", "En préparation");
        Statut statut2006 = new Statut(2006, "ligneCommande", "prêt");
        
        // produit 30
        Statut statut3001 = new Statut(3001, "produit", "disponible");
        Statut statut3002 = new Statut(3002, "produit", "indisponible");
        
        // ingredient 40
        Statut statut4001 = new Statut(4001, "ingredient", "disponible");
        Statut statut4002 = new Statut(4002, "ingredient", "indisponible");
        
        // formule 50 
        Statut statut5001 = new Statut(5001, "formule", "disponible");
        Statut statut5002 = new Statut(5002, "formule", "indisponible");
        
        //emplacement 60
        Statut statut6001 = new Statut(6001, "emplacement", "disponible");
        Statut statut6002 = new Statut(6002, "emplacement", "occupé");
        Statut statut6003 = new Statut(6003, "emplacement", "réservé");
        Statut statut6004 = new Statut(6004, "emplacement", "indisponible");
       

        Emplacement Empl01 = new Emplacement("seat1A",2);
        Empl01.setStatut(statut6002);
        Emplacement Empl02 = new Emplacement("seat1B",2);
        Empl02.setStatut(statut6001);
        Emplacement Empl03 = new Emplacement("seat1C",2);
        Empl03.setStatut(statut6001);
        Emplacement Empl04 = new Emplacement("seat1D",2);
        Empl04.setStatut(statut6001);
        Emplacement Empl05 = new Emplacement("seat2A",2);
        Empl05.setStatut(statut6001);
        Emplacement Empl06 = new Emplacement("seat2B",2);
        Empl06.setStatut(statut6004);
        Emplacement Empl07 = new Emplacement("seat2C",2);
        Empl07.setStatut(statut6001);
        Emplacement Empl08 = new Emplacement("seat2D",2);
        Empl08.setStatut(statut6001);
        Emplacement Empl09 = new Emplacement("seat3A",2);
        Empl09.setStatut(statut6001);
        Emplacement Empl10 = new Emplacement("seat3B",2);
        Empl10.setStatut(statut6001);
        Emplacement Empl11 = new Emplacement("seat3C",2);
        Empl11.setStatut(statut6002);
        Emplacement Empl12 = new Emplacement("seat3D",2);
        Empl12.setStatut(statut6001);
        Emplacement Empl13 = new Emplacement("seat4A",2);
        Empl13.setStatut(statut6001);
        Emplacement Empl14 = new Emplacement("seat4B",2);
        Empl14.setStatut(statut6003);
        Emplacement Empl15 = new Emplacement("seat4C",2);
        Empl15.setStatut(statut6001);
        Emplacement Empl16 = new Emplacement("seat4D",2);
        Empl16.setStatut(statut6001);
        
        Emplacement Empl17 = new Emplacement("terminal1A1B");
        Empl17.setStatut(statut6001);
        Emplacement Empl18 = new Emplacement("terminal1C1D");
        Empl18.setStatut(statut6001);        
        Emplacement Empl19 = new Emplacement("terminal2A2B");
        Empl19.setStatut(statut6001);
        Emplacement Empl20 = new Emplacement("terminal2C2D");
        Empl20.setStatut(statut6001);
        Emplacement Empl21 = new Emplacement("terminal3A3C");
        Empl21.setStatut(statut6001);
        Emplacement Empl22 = new Emplacement("terminal3B3B");
        Empl22.setStatut(statut6001);
        Emplacement Empl23 = new Emplacement("terminal4A4C");
        Empl23.setStatut(statut6001);
        Emplacement Empl24 = new Emplacement("terminal4B4D");
        Empl24.setStatut(statut6001);
        Emplacement Empl25 = new Emplacement("terminal1Salle");
        Empl25.setStatut(statut6001);
        Emplacement Empl26 = new Emplacement("terminal2Salle");
        Empl26.setStatut(statut6001);
        Emplacement Empl27 = new Emplacement("terminal3Salle");
        Empl27.setStatut(statut6001);
        Emplacement Empl28 = new Emplacement("terminal4Salle");
        Empl28.setStatut(statut6001);
       
        Ingredient ing01 = new Ingredient("Boeuf");
        ing01.setStatut(statut4001);
        ing01.setStock(10);
        Ingredient ing02 = new Ingredient("Nouilles de riz");
        ing02.setStatut(statut4001);
        ing02.setStock(10);
        Ingredient ing03 = new Ingredient("Basilic");
        ing03.setStatut(statut4001);
        ing03.setStock(15);
        Ingredient ing04 = new Ingredient("Coriandre");
        ing04.setStatut(statut4001);
        ing04.setStock(15);
        Ingredient ing05 = new Ingredient("Menthe");
        ing05.setStatut(statut4001);
        ing05.setStock(15);
        Ingredient ing06 = new Ingredient("Ciboule ");
        ing06.setStatut(statut4001);
        ing06.setStock(15);
        Ingredient ing07 = new Ingredient("Citron vert");
        ing07.setStatut(statut4001);
        ing07.setStock(15);
        Ingredient ing08 = new Ingredient("Glaçons");
        ing08.setStatut(statut4001);
        ing08.setStock(15);
        Ingredient ing09 = new Ingredient("Rhum blanc");
        ing09.setStatut(statut4001);
        ing09.setStock(15);
        Ingredient ing10 = new Ingredient("Sirop de sucre de canne");
        ing10.setStatut(statut4001);
        ing10.setStock(15);
        Ingredient ing11 = new Ingredient("Eau gazeuse");
        ing11.setStatut(statut4001);
        ing11.setStock(10);
        Ingredient ing12 = new Ingredient("Liqueur d'oranges"); 
        ing12.setStatut(statut4001);
        ing12.setStock(10);
        Ingredient ing13 = new Ingredient("Jus de canneberge");
        ing13.setStatut(statut4001);
        ing13.setStock(10);
        Ingredient ing14 = new Ingredient("Vodka");
        ing14.setStatut(statut4001);
        ing14.setStock(10);
        Ingredient ing15 = new Ingredient("Martini"); 
        ing15.setStatut(statut4001);
        ing15.setStock(10);
        Ingredient ing16 = new Ingredient("Jus de litchi");
        ing16.setStatut(statut4001);
        ing16.setStock(10);
        Ingredient ing17 = new Ingredient("Litchi");  
        ing17.setStatut(statut4001);
        ing17.setStock(10);
        Ingredient ingd01 = new Ingredient("Cassis");
        ingd01.setStatut(statut4001);
        ingd01.setStock(10);
        Ingredient ingd02 = new Ingredient("pêche");   
        ingd02.setStatut(statut4001);
        ingd02.setStock(10);
        Ingredient ingd03 = new Ingredient("Liqueur de pamplemousse");
        ingd03.setStatut(statut4001);
        ingd03.setStock(10);
        Ingredient ingd04 = new Ingredient("Rosé"); 
        ingd04.setStatut(statut4001);
        ingd04.setStock(10);
        
        Ingredient ing001 = new Ingredient("Echine de porc");
        ing001.setStatut(statut4001);
        ing001.setStock(10);
        Ingredient ing002 = new Ingredient("Ails");
        ing002.setStatut(statut4001);
        ing002.setStock(10);
        Ingredient ing003 = new Ingredient("Sauce d'huître");
        ing003.setStatut(statut4001);
        ing003.setStock(10);
        Ingredient ing004 = new Ingredient("Concombre");
        ing004.setStatut(statut4001);
        ing004.setStock(10);
        Ingredient ing005 = new Ingredient("Carottes");
        ing005.setStatut(statut4001);
        ing005.setStock(10);
        Ingredient ing006 = new Ingredient("Vinaigre d'alcool blanc au citron");
        ing006.setStatut(statut4001);
        ing006.setStock(10);
        Ingredient ing007 = new Ingredient("Vermicelles de soja");
        ing007.setStatut(statut4001);
        ing007.setStock(10);
        Ingredient ing008 = new Ingredient("Steak");
        ing008.setStatut(statut4001);
        ing008.setStock(10);
        Ingredient ing009 = new Ingredient("Carottes râpées");
        ing009.setStatut(statut4001);
        ing009.setStock(10);
        Ingredient ing010 = new Ingredient("Soja frais");
        ing010.setStatut(statut4001);
        ing010.setStock(10);
        Ingredient ing011 = new Ingredient("Salades sucrines");
        ing011.setStatut(statut4001);
        ing011.setStock(10);
        Ingredient ing012 = new Ingredient("Cacahuètes");
        ing012.setStatut(statut4001);
        ing012.setStock(10);
        Ingredient ing013 = new Ingredient("Echalote"); 
        ing013.setStatut(statut4001);
        ing013.setStock(10);
        Ingredient ing014 = new Ingredient("Citrons");   
        ing014.setStatut(statut4001);
        ing014.setStock(10);
        Ingredient ing017 = new Ingredient("Sauce Nuoc Mam");
        ing017.setStatut(statut4001);
        ing017.setStock(10);
        Ingredient ing018 = new Ingredient("Tabasco");
        ing018.setStatut(statut4001);
        ing018.setStock(10);
        Ingredient ing019 = new Ingredient("Blancs de poulet");
        ing019.setStatut(statut4001);
        ing019.setStock(10);
        Ingredient ing020 = new Ingredient("Tomates");
        ing020.setStatut(statut4001);
        ing020.setStock(10);
        Ingredient ing021 = new Ingredient("Oignon rouge"); 
        ing021.setStatut(statut4001);
        ing021.setStock(10);
        Ingredient ing022 = new Ingredient("Curry");
        ing022.setStatut(statut4001);
        ing022.setStock(10);
        Ingredient ing023 = new Ingredient("Gingembre");
        ing023.setStatut(statut4001);
        ing023.setStock(10);
        Ingredient ing025 = new Ingredient("Huile d'olive");
        ing025.setStatut(statut4001);
        ing025.setStock(10);
        Ingredient ing026 = new Ingredient("Poivre");
        ing026.setStatut(statut4001);
        ing026.setStock(10);
        Ingredient ing027 = new Ingredient("Sel");
        ing027.setStatut(statut4001);
        ing027.setStock(10);
        Ingredient ing028 = new Ingredient("Calamars en anneaux");  
        ing028.setStatut(statut4001);
        ing028.setStock(10);
        Ingredient ing029 = new Ingredient("Morceau de gingembre");
        ing029.setStatut(statut4001);
        ing029.setStock(10);
        Ingredient ing030 = new Ingredient("Poivron jaune");
        ing030.setStatut(statut4001);
        ing030.setStock(10);
        Ingredient ing031 = new Ingredient("Poivron vert");
        ing031.setStatut(statut4001);
        ing031.setStock(10);
        Ingredient ing032 = new Ingredient("Oignon");
        ing032.setStatut(statut4001);
        ing032.setStock(10);
        Ingredient ing033 = new Ingredient("Huile d'olive");
        ing033.setStatut(statut4001);
        ing033.setStock(10);
        Ingredient ing034 = new Ingredient("Piment");
        ing034.setStatut(statut4001);
        ing034.setStock(10);
        Ingredient ing036 = new Ingredient("Crevette");
        ing036.setStatut(statut4001);
        ing036.setStock(10);
        Ingredient ing037 = new Ingredient("Cacine de lotus");
        ing037.setStatut(statut4001);
        ing037.setStock(10);
        Ingredient ing039 = new Ingredient("Poivron rouge");  
        ing039.setStatut(statut4001);
        ing039.setStock(10);
        Ingredient ing040 = new Ingredient("vinaigre blanc de riz");
        ing040.setStatut(statut4001);
        ing040.setStock(10);
        Ingredient ing041 = new Ingredient("sucre"); 
        ing041.setStatut(statut4001);
        ing041.setStock(10);
        
        // Ingredients rajoutés par Ibrahim
        Ingredient ing150 = new Ingredient("Pates de riz");    
        ing150.setStatut(statut4001);
        ing150.setStock(10);
        Ingredient ing151 = new Ingredient("Filet de Boeuf");
        ing151.setStatut(statut4001);
        ing151.setStock(10);
        Ingredient ing152 = new Ingredient("Pousse de Haricot Mungo");
        ing152.setStatut(statut4001);
        ing152.setStock(10);
        Ingredient ing153 = new Ingredient("Ciboulettes");
        ing153.setStatut(statut4001);
        ing153.setStock(10);
        Ingredient ing154 = new Ingredient("Sauce de Soja");
        ing154.setStatut(statut4001);
        ing154.setStock(10);
        Ingredient ing155 = new Ingredient("Huile");
        ing155.setStatut(statut4001);
        ing155.setStock(10);
        Ingredient ing156 = new Ingredient("Sésame");
        ing156.setStatut(statut4001);
        ing156.setStock(10);

        Ingredient ing157 = new Ingredient("Oeufs");
        ing157.setStatut(statut4001);
        ing157.setStock(10);
        Ingredient ing158 = new Ingredient("Huile Tournesol");
        ing158.setStatut(statut4001);
        ing158.setStock(10);
        Ingredient ing159 = new Ingredient("Sauce Maggi");
        ing159.setStatut(statut4001);
        ing159.setStock(10);
        Ingredient ing160 = new Ingredient("Jambon en dés");
        ing160.setStatut(statut4001);
        ing160.setStock(10);
        Ingredient ing161 = new Ingredient("Petits Pois");
        ing161.setStatut(statut4001);
        ing161.setStock(10);
        Ingredient ing162 = new Ingredient("Gros Oignon");
        ing162.setStatut(statut4001);
        ing162.setStock(10);
        Ingredient ing163 = new Ingredient("riz");
        ing163.setStatut(statut4001);
        ing163.setStock(10);

        Ingredient ing164 = new Ingredient("Poivre Noir");
        ing164.setStatut(statut4001);
        ing164.setStock(10);
        Ingredient ing165 = new Ingredient("Batavia");
        ing165.setStatut(statut4001);
        ing165.setStock(10);
        Ingredient ing166 = new Ingredient("Tige Menthe");
        ing166.setStatut(statut4001);
        ing166.setStock(10);
        Ingredient ing167 = new Ingredient("Petits Nems");
        ing167.setStatut(statut4001);
        ing167.setStock(10);
        Ingredient ing168 = new Ingredient("Boeuf Tendre");
        ing168.setStatut(statut4001);
        ing168.setStock(10);
        Ingredient ing169 = new Ingredient("Tige de Coriandre");
        ing169.setStatut(statut4001);
        ing169.setStock(10);
        Ingredient ing170 = new Ingredient("Vermicelles de riz");
        ing170.setStatut(statut4001);
        ing170.setStock(10);

        Ingredient ing171 = new Ingredient("Caramel Maison");
        ing171.setStatut(statut4001);
        ing171.setStock(10);

        Ingredient ing172 = new Ingredient("Poitrine de Porc");
        ing172.setStatut(statut4001);
        ing172.setStock(10);
        Ingredient ing173 = new Ingredient("Champignons noirs réhydratés");
        ing173.setStatut(statut4001);
        ing173.setStock(10);
        Ingredient ing174 = new Ingredient("Courgette");
        ing174.setStatut(statut4001);
        ing174.setStock(10);
        Ingredient ing175 = new Ingredient("Vermicelles chinois");
        ing175.setStatut(statut4001);
        ing175.setStock(10);
        Ingredient ing176 = new Ingredient("Feuilles de riz");
        ing176.setStatut(statut4001);
        ing176.setStock(10);
        Ingredient ing177 = new Ingredient("Huile d'arachide");
        ing177.setStatut(statut4001);
        ing177.setStock(10);
        Ingredient ing178 = new Ingredient("Poivron Vert");
        ing178.setStatut(statut4001);
        ing178.setStock(10);
        Ingredient ing179 = new Ingredient("RumSteack ou Noix de Basse Côte");
        ing179.setStatut(statut4001);
        ing179.setStock(10);

        Ingredient ing180 = new Ingredient("Haut de cuisse (paquet de trois)");
        ing180.setStatut(statut4001);
        ing180.setStock(10);
        Ingredient ing181 = new Ingredient("Echalotes coupées finement");
        ing181.setStatut(statut4001);
        ing181.setStock(10);
        Ingredient ing182 = new Ingredient("Boite de pâte Wong ton");
        ing182.setStatut(statut4001);
        ing182.setStock(10);
        Ingredient ing183 = new Ingredient("Porc haché maigre cru");
        ing183.setStatut(statut4001);
        ing183.setStock(10);
        Ingredient ing184 = new Ingredient("Bouillon de poulet fait maison");
        ing184.setStatut(statut4001);
        ing184.setStock(10);

        Ingredient ing185 = new Ingredient("Oignon Blanc");
        ing185.setStatut(statut4001);
        ing185.setStock(10);
        Ingredient ing186 = new Ingredient("Purée de Tamarin");
        ing186.setStatut(statut4001);
        ing186.setStock(10);
        Ingredient ing187 = new Ingredient("Cacahuètes concassées");
        ing187.setStatut(statut4001);
        ing187.setStock(10);
        Ingredient ing188 = new Ingredient("Nouilles de Riz");
        ing188.setStatut(statut4001);
        ing188.setStock(10);
        Ingredient ing189 = new Ingredient("Filet de Poulet");
        ing189.setStatut(statut4001);
        ing189.setStock(10);
        Ingredient ing190 = new Ingredient("Pousse d'épinards fraiches");
        ing190.setStatut(statut4001);
        ing190.setStock(10);
        Ingredient ing191 = new Ingredient("Gingembre en poudre");
        ing191.setStatut(statut4001);
        ing191.setStock(10);
        Ingredient ing192 = new Ingredient("Curcumin");
        ing192.setStatut(statut4001);
        ing192.setStock(10);
        Ingredient ing193 = new Ingredient("Ail écrasé");
        ing193.setStatut(statut4001);
        ing193.setStock(10);
        
        Ingredient ing194 = new Ingredient("Nouilles aux oeufs Suzi Wan");
        ing194.setStatut(statut4001);
        ing194.setStock(10);
        Ingredient ing195 = new Ingredient("blanc de poulet");
        ing195.setStatut(statut4001);
        ing195.setStock(10);
        Ingredient ing196 = new Ingredient("Vinaigre Balsamique");
        ing196.setStatut(statut4001);
        ing196.setStock(10);
        Ingredient ing197 = new Ingredient("Légumes shop suey");
        ing197.setStatut(statut4001);
        ing197.setStock(10);
        Ingredient ing198 = new Ingredient("Germes de soja ");
        ing198.setStatut(statut4001);
        ing198.setStock(10);
        Ingredient ing199 = new Ingredient("Huile végétale");
        ing199.setStatut(statut4001);
        ing199.setStock(10);
        
        // Ingrédients utilisés en déssert (Ibrahim)
        Ingredient ing200 = new Ingredient("Banane");
        ing200.setStatut(statut4001);
        ing200.setStock(10);
        Ingredient ing201 = new Ingredient("Sucre vanillé");
        ing201.setStatut(statut4001);
        ing201.setStock(10);
        Ingredient ing202 = new Ingredient("Lait");
        ing202.setStatut(statut4001);
        ing202.setStock(10);
        Ingredient ing203 = new Ingredient("Lait de Coco"); 
        ing203.setStatut(statut4001);
        ing203.setStock(10);
        Ingredient ing204 = new Ingredient("Perles de Tapioca"); 
        ing204.setStatut(statut4001);
        ing204.setStock(10);
        
        Ingredient ing205 = new Ingredient("Farine");   
        ing205.setStatut(statut4001);
        ing205.setStock(10);
        Ingredient ing206 = new Ingredient("Eau");   
        ing206.setStatut(statut4001);
        ing206.setStock(10);
        Ingredient ing207 = new Ingredient("Beurre");   
        ing207.setStatut(statut4001);
        ing207.setStock(10);
        Ingredient ing208 = new Ingredient("Nutella");
        ing208.setStatut(statut4001);
        ing208.setStock(10);
        Ingredient ing209 = new Ingredient("Jaune d'oeuf");
        ing209.setStatut(statut4001);
        ing209.setStock(10);

        Ingredient ing210 = new Ingredient("Jus de citron");   
        ing210.setStatut(statut4001);
        ing210.setStock(10);
        Ingredient ing211 = new Ingredient("Gousse de vanille");   
        ing211.setStatut(statut4001);
        ing211.setStock(10);
        Ingredient ing212 = new Ingredient("Litchi au sirop");
        ing212.setStatut(statut4001);
        ing212.setStock(10);

        Ingredient ing213 = new Ingredient("Chocolat noir spécial");
        ing213.setStatut(statut4001);
        ing213.setStock(10);
        Ingredient ing214 = new Ingredient("Fécule de maïs");   
        ing214.setStatut(statut4001);
        ing214.setStock(10);
        Ingredient ing215 = new Ingredient("Noix de Coco râpée");
        ing215.setStatut(statut4001);
        ing215.setStock(10);
           
        Ingredient ing216 = new Ingredient("Glace vanille");   
        ing216.setStatut(statut4001);
        ing216.setStock(10);
        Ingredient ing217 = new Ingredient("Glace au chocolat");
        ing217.setStatut(statut4001);
        ing217.setStock(10);
           
        Ingredient ing218 = new Ingredient("Ananas");  
        ing218.setStatut(statut4001);
        ing218.setStock(10);
        Ingredient ing219 = new Ingredient("Orange"); 
        ing219.setStatut(statut4001);
        ing219.setStock(10);
        Ingredient ing220 = new Ingredient("Papaye");   
        ing220.setStatut(statut4001);
        ing220.setStock(10);
        Ingredient ing221 = new Ingredient("Kiwi");   
        ing221.setStatut(statut4001);
        ing221.setStock(10);
        Ingredient ing222 = new Ingredient("Mangue");   
        ing222.setStatut(statut4001);
        ing222.setStock(10);
        Ingredient ing223 = new Ingredient("Baton de Cannelle");   
        ing223.setStatut(statut4001);
        ing223.setStock(10);
        Ingredient ing224 = new Ingredient("Poivre de Sichuan");
        ing224.setStatut(statut4001);
        ing224.setStock(10);
           
        Ingredient ing225 = new Ingredient("Biscuit au chocolat");   
        ing225.setStatut(statut4001);
        ing225.setStock(10);
        Ingredient ing226 = new Ingredient("avocat");   
        ing226.setStatut(statut4001);
        ing226.setStock(10);
        Ingredient ing227 = new Ingredient("Chocolat au lait fondu");   
        ing227.setStatut(statut4001);
        ing227.setStock(10);
        Ingredient ing228 = new Ingredient("Lait concentré sucré");  
        ing228.setStatut(statut4001);
        ing228.setStock(10);
        Ingredient ing229 = new Ingredient("Rhum");   
        ing229.setStatut(statut4001);
        ing229.setStock(10);
        Ingredient ing230 = new Ingredient("Noix du brésil"); 
        ing230.setStatut(statut4001);
        ing230.setStock(10);

        Ingredient ing231 = new Ingredient("Haricots noirs secs"); 
        ing231.setStatut(statut4001);
        ing231.setStock(10);
        Ingredient ing232 = new Ingredient("Lotus au sirop");
        ing232.setStatut(statut4001);
        ing232.setStock(10);

        Ingredient ing233 = new Ingredient("Taro (Khoai Môn Cao)"); 
        ing233.setStatut(statut4001);
        ing233.setStock(10);
        Ingredient ing234 = new Ingredient("Riz gluant"); 
        ing234.setStatut(statut4001);
        ing234.setStock(10);
        Ingredient ing235 = new Ingredient("Feuilles de Pandanus fraiches"); 
        ing235.setStatut(statut4001);
        ing235.setStock(10);
        
        Ingredient ing236 = new Ingredient("Cornilles ou doliques à oeil noir (Haricot)"); 
        ing236.setStatut(statut4001);
        ing236.setStock(10);
        Ingredient ing237 = new Ingredient("Bicarbonate de Sodium"); 
        ing237.setStatut(statut4001);
        ing237.setStock(10);
        Ingredient ing238 = new Ingredient("Extrait de vanille");  
        ing238.setStatut(statut4001);
        ing238.setStock(10);
        Ingredient ing239 = new Ingredient("Amidon de Maïs");
        ing239.setStatut(statut4001);
        ing239.setStock(10);
                  
        
        InfosProduit infosPr01 = new InfosProduit("volume","50","cl");
        InfosProduit infosPr02 = new InfosProduit("volume","12.5","cl");
        InfosProduit infosPr03 = new InfosProduit("volume","50","cl");
        InfosProduit infosPr04 = new InfosProduit("volume","12.5","cl");
        InfosProduit infosPr05 = new InfosProduit("volume","50","cl");
        InfosProduit infosPr06 = new InfosProduit("volume","12.5","cl");
        InfosProduit infosPr07 = new InfosProduit("Alcool","Sans alcool");
        
        //==================================================================================|
        //                                     Gestion TVA                                  |
        //==================================================================================|
        
        CodeTVA tva5_5 = new CodeTVA("TVA 5.5", 5.5f);
        CodeTVA tva10 = new CodeTVA("TVA 10", 10f);
        CodeTVA tva20 = new CodeTVA("TVA 20", 20f);
        
        
        //==================================================================================|
        //                           Natures de produits                                    |
        //==================================================================================|              

        NatureProduit salades = new NatureProduit("NOS SALADES");
        salades.setCarte(carte);
        NatureProduit soupes = new NatureProduit("NOS SOUPES");
        soupes.setCarte(carte);
        NatureProduit pates = new NatureProduit("NOS PÂTES SAUTÉES");
        pates.setCarte(carte);
        NatureProduit viandes = new NatureProduit("NOS VIANDES");
        viandes.setCarte(carte);
        NatureProduit volailles = new NatureProduit("NOS VOLAILLES");
        volailles.setCarte(carte);
        NatureProduit poissons = new NatureProduit("NOS POISSONS");
        poissons.setCarte(carte);
        NatureProduit legumes = new NatureProduit("NOS LEGUMES");
        legumes.setCarte(carte);
        NatureProduit fruits = new NatureProduit("NOS FRUITS");
        fruits.setCarte(carte);
        NatureProduit fromages = new NatureProduit("NOS FROMAGES");
        fromages.setCarte(carte);
        NatureProduit boissons = new NatureProduit("NOS BOISSONS");
        boissons.setCarte(carte);
        NatureProduit aperitifs = new NatureProduit("NOS APERITIFS");
        aperitifs.setCarte(carte);
        NatureProduit fruitMer = new NatureProduit("NOS FRUIT DE MER");
        fruitMer.setCarte(carte);
        NatureProduit riz = new NatureProduit("NOS RIZ");
        riz.setCarte(carte);

        //==================================================================================|
        //                                  Type de plats                                   |
        //==================================================================================|
        //                              COCKTAILS                                           |
        //==================================================================================| 

        TypePlat tp01 = new TypePlat("COCKTAILS");
         tp01.setCarte(carte);
        Produit  produit01 = new Produit("Mojito", 8.5f, "mojito.jpeg");
         produit01.setStock(10);
        produit01.getIngredients().add(ing05);
        produit01.getIngredients().add(ing07);
        produit01.getIngredients().add(ing08);
        produit01.getIngredients().add(ing09);
        produit01.getIngredients().add(ing10);
        produit01.getIngredients().add(ing11); 
        produit01.setStatut(statut3001);
        produit01.setCodeTVA(tva20);
        tp01.getProduits().add(produit01);
        
        Produit  produit02 = new Produit("Daiquiri", 8.5f, "daiquiri.png");
        produit02.setStock(10);
        produit02.getIngredients().add(ing09);
        produit02.getIngredients().add(ing07);
        produit02.getIngredients().add(ing10);
        produit02.getIngredients().add(ing08);   
        produit02.setStatut(statut3001);
        produit02.setCodeTVA(tva20);
        tp01.getProduits().add(produit02);
        
        Produit  produit03 = new Produit("Cosmopolitan",8.5f, "Cosmopolitan.jpg");
        produit03.setStock(10);
        produit03.getIngredients().add(ing07);           
        produit03.getIngredients().add(ing12);             
        produit03.getIngredients().add(ing13);              
        produit03.getIngredients().add(ing14);
        produit03.setStatut(statut3001);
        produit03.setCodeTVA(tva20);
        tp01.getProduits().add(produit03);
        
        Produit  produit04 = new Produit("Lychee martini",8.5f,"Lychee-martini.png"); 
        produit04.setStock(10);
        produit04.getIngredients().add(ing07);
        produit04.getIngredients().add(ing15);
        produit04.getIngredients().add(ing16);
        produit04.getIngredients().add(ing17);
        produit04.setStatut(statut3001);
        produit04.setCodeTVA(tva20);
        tp01.getProduits().add(produit04);
        
        Produit  produit06 = new Produit("Ginger julep",8.5f,"Ginger-julep.jpg");
        produit06.setStock(10);
        produit06.getIngredients().add(ing05);
        produit06.getIngredients().add(ing12);
        produit06.getIngredients().add(ing07);
        produit06.setStatut(statut3001);
        produit06.setCodeTVA(tva20);
        tp01.getProduits().add(produit06);
        
        Produit  produit07 = new Produit("Eau gazeuse", 3.5f,"eau-gazeuse.jpg");
        produit07.setStock(10);
        produit07.setStatut(statut3001);
        produit07.setCodeTVA(tva10);
        tp01.getProduits().add(produit07);
        
        Produit  produit08 = new Produit("Virgin ginger mojitoi",6.5f,"Virgin-ginger-mojitoi.jpg");
        produit08.setStock(10);
        produit08.getInfosProduits().add(infosPr07);
        produit08.getIngredients().add(ing07);
        produit08.getIngredients().add(ing05);
        produit08.getIngredients().add(ing023);
        produit08.getIngredients().add(ing206);
        produit08.getIngredients().add(ing09);
        produit08.setStatut(statut3001);
        produit08.setCodeTVA(tva20);
        tp01.getProduits().add(produit08);
        
        Produit  produit09 = new Produit("Kir aligoté",14.5f,"Kir-aligote.jpg");
        produit09.setStock(10);
        produit09.getInfosProduits().add(infosPr01);
        produit09.getIngredients().add(ingd02);
        produit09.getIngredients().add(ingd01);
        produit09.setStatut(statut3001);    
        produit09.setCodeTVA(tva20);
        tp01.getProduits().add(produit09);
        
        Produit  produit10 = new Produit("Kir aligote",4f,"Kir-aligote.jpg");
        produit10.setStock(10);
        produit10.getInfosProduits().add(infosPr02);
        produit10.getIngredients().add(ingd02);
        produit10.getIngredients().add(ingd01);
        produit10.setStatut(statut3001);
        produit10.setCodeTVA(tva20);
        tp01.getProduits().add(produit10);
        
        Produit  produit11 = new Produit("Kir royal",5.9f,"kir-royal.png");
        produit11.setStock(10);
        produit11.getInfosProduits().add(infosPr03);
        produit11.getIngredients().add(ingd02);
        produit11.getIngredients().add(ingd01);
        produit11.setStatut(statut3001);
        produit11.setCodeTVA(tva20);
        tp01.getProduits().add(produit11);
        
        Produit  produit12 = new Produit("Kir royal",9.5f,"kir-royal.png");
        produit12.setStock(10);
        produit12.getInfosProduits().add(infosPr04);
        produit12.getIngredients().add(ingd02);
        produit12.getIngredients().add(ingd01);
        produit12.setStatut(statut3001);
        produit12.setCodeTVA(tva20);
        tp01.getProduits().add(produit12);
        
        Produit  produit13 = new Produit("Rosé pamplemousse",14f,"Rose-pamplemousse.jpg");
        produit13.setStock(10);
        produit13.getInfosProduits().add(infosPr05);
        produit13.getIngredients().add(ingd03);
        produit13.getIngredients().add(ingd04);
        produit13.setStatut(statut3001);
        produit13.setCodeTVA(tva20);
        tp01.getProduits().add(produit13);
        
        Produit  produit14 = new Produit("Rosé pamplemousse 12",3.9f,"Rose-pamplemousse.jpg");
        produit14.setStock(10);
        produit14.getInfosProduits().add(infosPr06);
        produit14.getIngredients().add(ingd03);
        produit14.getIngredients().add(ingd04);
        produit14.setStatut(statut3001);
        produit14.setCodeTVA(tva20);
        tp01.getProduits().add(produit14);

        //==================================================================================|
        //                                        ENTREES                                   |
        //==================================================================================|
        TypePlat tp02 = new TypePlat("ENTREES"); 
        tp02.setCarte(carte);
        // soupes
        Produit  prdu1 = new Produit("Phô au boeuf",12.5f,"Pho-au-boeuf.jpg");
        prdu1.setStock(10);
        soupes.getProduits().add(prdu1);
        prdu1.getIngredients().add(ing01);
        prdu1.getIngredients().add(ing02);
        prdu1.getIngredients().add(ing03);
        prdu1.getIngredients().add(ing04);
        prdu1.getIngredients().add(ing05);
        prdu1.getIngredients().add(ing06);        
        prdu1.setStatut(statut3001);
        prdu1.setCodeTVA(tva10);
        tp02.getProduits().add(prdu1);
        
        
        Produit  prdu2 = new Produit("Phô au boeuf et boulettes",13.5f,"Pho-au-boeuf-et-boulettes.jpg");
        prdu2.setStock(10);
        soupes.getProduits().add(prdu2);
        prdu2.getIngredients().add(ing01);
        prdu2.getIngredients().add(ing02);
        prdu2.getIngredients().add(ing03);
        prdu2.getIngredients().add(ing04);
        prdu2.getIngredients().add(ing05);
        prdu2.setStatut(statut3001);
        prdu2.setCodeTVA(tva10);
        tp02.getProduits().add(prdu2);
        
        
        
        Produit  prdu3 = new Produit("Phô légumes et boeuf",12.5f,"Pho-aux-legumes.jpg");
        prdu3.setStock(10);
        soupes.getProduits().add(prdu3);
        prdu3.getIngredients().add(ing184);
        prdu3.getIngredients().add(ing005);
        prdu3.getIngredients().add(ing032);
        prdu3.getIngredients().add(ing173);
        prdu3.getIngredients().add(ing023);
        prdu3.getIngredients().add(ing007);
        prdu3.getIngredients().add(ing04);
        prdu3.setStatut(statut3001);
        prdu3.setCodeTVA(tva10);
        tp02.getProduits().add(prdu3);
        
        
        Produit  prdu4 = new Produit("Mi xa xiu, porc laqué",13.1f,"mi-xa-xiu-porc-laque.jpg"); 
        prdu4.setStock(10);
        soupes.getProduits().add(prdu4);
        prdu4.getIngredients().add(ing001);
        prdu4.getIngredients().add(ing002);
        prdu4.getIngredients().add(ing003);
        prdu4.getIngredients().add(ing004);
        prdu4.getIngredients().add(ing005);
        prdu4.getIngredients().add(ing006);
        prdu4.setStatut(statut3001);
        prdu4.setCodeTVA(tva10);
        tp02.getProduits().add(prdu4);
        
       
      // salades        
      Produit  prdu5 = new Produit("Salade de boeuf à la vietnamienne",11.4f,"salade-de-boeuf-a-la-vietnamienne.jpg");
      prdu5.setStock(10);
      salades.getProduits().add(prdu5);
      prdu5.getIngredients().add(ing007);
      prdu5.getIngredients().add(ing05);
      prdu5.getIngredients().add(ing04);
      prdu5.getIngredients().add(ing009);
      prdu5.getIngredients().add(ing010);
      prdu5.getIngredients().add(ing011);
      prdu5.getIngredients().add(ing012);
      prdu5.getIngredients().add(ing013);
      prdu5.getIngredients().add(ing014);
      prdu5.getIngredients().add(ing017);
      prdu5.getIngredients().add(ing018);
      prdu5.setStatut(statut3001);
      prdu5.setCodeTVA(tva10);
      tp02.getProduits().add(prdu5);
     
      Produit  prdu6 = new Produit("Salade de poulet mariné",10.8f,"salade-de-poulet-marine-au-gingembre.jpg");
      prdu6.setStock(10);
      salades.getProduits().add(prdu6);
      prdu6.getIngredients().add(ing019);
      prdu6.getIngredients().add(ing020);
      prdu6.getIngredients().add(ing021);
      prdu6.getIngredients().add(ing04);
      prdu6.getIngredients().add(ing022);
      prdu6.getIngredients().add(ing023);
      prdu6.getIngredients().add(ing07);
      prdu6.getIngredients().add(ing025);
      prdu6.getIngredients().add(ing026);
      prdu6.getIngredients().add(ing027);
      prdu6.setStatut(statut3001);
      prdu6.setCodeTVA(tva10);
      tp02.getProduits().add(prdu6);
      
      
      Produit  prdu7 = new Produit("Salade de calamars",11.9f,"salade-calamars-sautes.jpg");
      prdu7.setStock(10);
      salades.getProduits().add(prdu7);
      prdu7.getIngredients().add(ing020);
      prdu7.getIngredients().add(ing028);
      prdu7.getIngredients().add(ing002);
      prdu7.getIngredients().add(ing029);
      prdu7.getIngredients().add(ing030);
      prdu7.getIngredients().add(ing031);
      prdu7.getIngredients().add(ing032);
      prdu7.getIngredients().add(ing033);
      prdu7.getIngredients().add(ing034);
      prdu7.setStatut(statut3001);
      prdu7.setCodeTVA(tva10);
      tp02.getProduits().add(prdu7);
      
      
      Produit  prdu8 = new Produit("Salade de lotus aux crevettes",12.7f,"salade-lotus-crevettes.jpg");
      prdu8.setStock(10);
      salades.getProduits().add(prdu8);
      prdu8.getIngredients().add(ing034);
      prdu8.getIngredients().add(ing036);
      prdu8.getIngredients().add(ing037);
      prdu8.getIngredients().add(ing039);
      prdu8.getIngredients().add(ing002);
      prdu8.getIngredients().add(ing005);
      prdu8.getIngredients().add(ing004);     
      prdu8.getIngredients().add(ing012);
      prdu8.getIngredients().add(ing013);
      prdu8.getIngredients().add(ing017);
      prdu8.getIngredients().add(ing026);
      prdu8.getIngredients().add(ing027);
      prdu8.getIngredients().add(ing040);
      prdu8.getIngredients().add(ing041);
      prdu8.setStatut(statut3001);
      prdu8.setCodeTVA(tva10);
      tp02.getProduits().add(prdu8);  
      
      
      
        //==================================================================================|
        //                                        PLATS                                     |
        //==================================================================================|
        TypePlat tp05 = new TypePlat("PLATS");
        tp05.setCarte(carte);
        
        Produit produ1 = new Produit("Nouilles au poulet et crevettes", 16.2f, "nouilles-riz-sautees-poulet-marine-au-gingembre-crevettes.jpg");
        produ1.setStock(10);
        produ1.setCodeTVA(tva10);
        pates.getProduits().add(produ1);
        volailles.getProduits().add(produ1);
        
        Produit produ2 = new Produit("Nouilles sautées au poulet", 13.9f,"nouilles-de-riz-sautees-au-poulet.jpg");
        produ2.setStock(10);
        produ2.setCodeTVA(tva10);
        pates.getProduits().add(produ2);
        volailles.getProduits().add(produ2);
        
        Produit produ3 = new Produit("Nouilles sautées aux crevettes", 14.9f,"pates-blanches-de-riz-sautees-aux-crevettes.jpg");
        produ3.setStock(10);
        produ3.setCodeTVA(tva10);
        pates.getProduits().add(produ3);
        fruitMer.getProduits().add(produ3);
        
        Produit produ4 = new Produit("Nouilles aux légumes", 12.3f,"nouilles-de-riz-sautees-aux-legumes.jpg");
        produ4.setStock(10);
        produ4.setCodeTVA(tva10);
        pates.getProduits().add(produ4);        
        legumes.getProduits().add(produ4);
        
        Produit produ5 = new Produit("Riz Cantonnais", 11.90f,"riz-cantonnais.jpg");
        produ5.setStock(10);
        produ5.setCodeTVA(tva10);
        riz.getProduits().add(produ5);
        
        Produit produ6 = new Produit("Bo Bun Boeuf", 13.90f,"bo-bun-boeuf.jpg"); 
        produ6.setStock(10);
        produ6.setCodeTVA(tva10);
        viandes.getProduits().add(produ6);
        
        Produit produ7 = new Produit("Porc au Caramel", 15.00f,"tit-kho-porc-au-caramel-vietnamien.jpg");
        produ7.setStock(10);
        produ7.setCodeTVA(tva10);
        viandes.getProduits().add(produ7);
        
        Produit produ8 = new Produit("Nems de Courgette", 9.80f,"nems-de-courgette-maison.jpg");
        produ8.setStock(10);
        produ8.setCodeTVA(tva10);
        legumes.getProduits().add(produ8);
        
        Produit produ9 = new Produit("Boeuf aux oignons vietnamien", 14.50f,"boeuf-aux-oignons-vietnamien.jpg");
        produ9.setStock(10);
        produ9.setCodeTVA(tva10);
        viandes.getProduits().add(produ9);
        
        Produit produ10 = new Produit("Soupe Won Ton", 9.80f,"soupe-won-ton.jpg");
        produ10.setStock(10);
        produ10.setCodeTVA(tva10);
        soupes.getProduits().add(produ10);

        //==================================================================================|
        //                   CREATION D'INGREDIENTS COMPOSANT LES PLATS                     |
        //==================================================================================|
        
        // Creation du plat 1
        produ1.getIngredients().add(ing194);
        produ1.getIngredients().add(ing036);
        produ1.getIngredients().add(ing195);
        produ1.getIngredients().add(ing023);
        produ1.getIngredients().add(ing032);
        produ1.getIngredients().add(ing154);
        produ1.getIngredients().add(ing196);
        produ1.getIngredients().add(ing197);
        produ1.getIngredients().add(ing002);
        produ1.getIngredients().add(ing198);
        produ1.getIngredients().add(ing017);
        produ1.getIngredients().add(ing199);
        produ1.getIngredients().add(ing153);
        produ1.getIngredients().add(ing026);

        produ1.setStatut(statut3001);
        tp05.getProduits().add(produ1);
        
        // Creation du plat 2
        produ2.getIngredients().add(ing188);
        produ2.getIngredients().add(ing189);
        produ2.getIngredients().add(ing190);
        produ2.getIngredients().add(ing173);
        produ2.getIngredients().add(ing154);
        produ2.getIngredients().add(ing025);
        produ2.getIngredients().add(ing027);
        produ2.getIngredients().add(ing07);
        produ2.getIngredients().add(ing155);
        produ2.getIngredients().add(ing191);
        produ2.getIngredients().add(ing192);
        produ2.getIngredients().add(ing022);
        produ2.getIngredients().add(ing023);
        produ2.getIngredients().add(ing193);
        
        produ2.setStatut(statut3001);
        tp05.getProduits().add(produ2);
        
        // Creation du plat 3
        produ3.getIngredients().add(ing150);
        produ3.getIngredients().add(ing036);
        produ3.getIngredients().add(ing185);
        produ3.getIngredients().add(ing002);
        produ3.getIngredients().add(ing177);
        produ3.getIngredients().add(ing186);
        produ3.getIngredients().add(ing017);
        produ3.getIngredients().add(ing154);
        produ3.getIngredients().add(ing034);
        produ3.getIngredients().add(ing041);
        produ3.getIngredients().add(ing187);
        produ3.getIngredients().add(ing169);
        produ3.getIngredients().add(ing07);
        
        produ3.setStatut(statut3001);
        tp05.getProduits().add(produ3);
        
        // Creation du plat 4.
        produ4.getIngredients().add(ing150);
        produ4.getIngredients().add(ing151);
        produ4.getIngredients().add(ing005);
        produ4.getIngredients().add(ing152);
        produ4.getIngredients().add(ing032);
        produ4.getIngredients().add(ing153);
        produ4.getIngredients().add(ing023);
        produ4.getIngredients().add(ing154);
        produ4.getIngredients().add(ing155);
        produ4.getIngredients().add(ing156);
        
        produ4.setStatut(statut3001);
        tp05.getProduits().add(produ4);
        
        // Creation du plat 5.
        produ5.getIngredients().add(ing157);
        produ5.getIngredients().add(ing158);
        produ5.getIngredients().add(ing159);
        produ5.getIngredients().add(ing027);
        produ5.getIngredients().add(ing002);
        produ5.getIngredients().add(ing026);
        produ5.getIngredients().add(ing160);
        produ5.getIngredients().add(ing161);
        produ5.getIngredients().add(ing162);
        produ5.getIngredients().add(ing163);
        
        produ5.setStatut(statut3001);
        tp05.getProduits().add(produ5);
        
        // Creation du plat 6.
        produ6.getIngredients().add(ing004);
        produ6.getIngredients().add(ing017);
        produ6.getIngredients().add(ing002);
        produ6.getIngredients().add(ing164);
        produ6.getIngredients().add(ing165);
        produ6.getIngredients().add(ing166);
        produ6.getIngredients().add(ing167);
        produ6.getIngredients().add(ing155);
        produ6.getIngredients().add(ing168);
        produ6.getIngredients().add(ing169);
        produ6.getIngredients().add(ing027);
        produ6.getIngredients().add(ing041);
        produ6.getIngredients().add(ing034);
        produ6.getIngredients().add(ing07);
        produ6.getIngredients().add(ing012);
        produ6.getIngredients().add(ing170);
        
        produ6.setStatut(statut3001);
        tp05.getProduits().add(produ6);
        
        // Creation du plat 7.
        produ7.getIngredients().add(ing017);
        produ7.getIngredients().add(ing027);
        produ7.getIngredients().add(ing026);
        produ7.getIngredients().add(ing171);
        produ7.getIngredients().add(ing002);
        produ7.getIngredients().add(ing162);
        produ7.getIngredients().add(ing172);
        
        produ7.setStatut(statut3001);
        tp05.getProduits().add(produ7);
        
        // Creation du plat 8.
        produ8.getIngredients().add(ing005);
        produ8.getIngredients().add(ing162);
        produ8.getIngredients().add(ing173);
        produ8.getIngredients().add(ing022);
        produ8.getIngredients().add(ing174);
        produ8.getIngredients().add(ing175);
        produ8.getIngredients().add(ing176);
        
        produ8.setStatut(statut3001);
        tp05.getProduits().add(produ8);
        
        // Creation du plat 9.
        produ9.getIngredients().add(ing017);
        produ9.getIngredients().add(ing177);
        produ9.getIngredients().add(ing178);
        produ9.getIngredients().add(ing032);
        produ9.getIngredients().add(ing179);

        produ9.setStatut(statut3001);
        tp05.getProduits().add(produ9);
        
        // Creation du plat 10.
        produ10.getIngredients().add(ing154);
        produ10.getIngredients().add(ing157);
        produ10.getIngredients().add(ing180);
        produ10.getIngredients().add(ing181);
        produ10.getIngredients().add(ing182);
        produ10.getIngredients().add(ing183);
        produ10.getIngredients().add(ing184);

        produ10.setStatut(statut3001);
        tp05.getProduits().add(produ10);
        
        //==================================================================================|
        //                                        DESSERTS                                  |
        //==================================================================================|
        TypePlat tp06 = new TypePlat("DESSERTS");
        tp06.setCarte(carte);
        
        Produit produi1 = new Produit("Tapioca au coco et banane", 5f,"soupe-de-perles-de-tapioca-au-coco-et-a-la-banane.jpg");
        produi1.setStock(10);
        produi1.setCodeTVA(tva10);
        
        Produit produi2 = new Produit("Raviolis au nutella", 6.1f,"raviolis-au-nutella.jpg");
        produi2.setStock(10);
        produi2.setCodeTVA(tva10);
        
        Produit produi3 = new Produit("Flan au caramel et litchi", 5f,"flan-au-caramel-et-litchi.jpg");
        produi3.setStock(10);
        produi3.setCodeTVA(tva10);
        
        Produit produi4 = new Produit("Fondant au chocolat et coco", 6.7f,"fondant-au-chocolat-et-glace-coco.jpg");
        produi4.setStock(10);
        produi4.setCodeTVA(tva10);
        
        Produit produi5 = new Produit("Coupe coco, vanille et chocolat", 7f,"coupe-coco-vanille-chocolat-et-sauce-chocolat.jpg");
        produi5.setStock(10);
        produi5.setCodeTVA(tva10);
        
        Produit produi6 = new Produit("Salade de fruits exotiques", 6.1f,"salade-de-fruits-frais-exotiques.jpg");
        produi6.setStock(10);
        produi6.setCodeTVA(tva10);
        
        Produit produi7 = new Produit("Crème d'avocat sucrée", 7f,"creme-d-avocat-doucement-sucree.jpg");
        produi7.setStock(10);
        produi7.setCodeTVA(tva10);
        
        Produit produi8 = new Produit("Soupe haricot au lotus", 5.9f, "soupe-sucree-de-haricots-noirs-aux-graines-de-lotus.jpg");
        produi8.setStock(10);
        produi8.setCodeTVA(tva10);
        
        Produit produi9 = new Produit("Riz gluant au taro et noix coco", 4.9f, "riz-gluant-violet-taro.jpg");
        produi9.setStock(10);
        produi9.setCodeTVA(tva10);
        
        Produit produi10 = new Produit("Entremets au riz gluant", 6.5f, "entremets-aux-cornilles-et-riz-gluant.jpg");
        produi10.setStock(10);
        produi10.setCodeTVA(tva10);
        
        //==================================================================================|
        //                   CREATION D'INGREDIENTS COMPOSANT LES DESSERTS                  |
        //==================================================================================|
        
        // Creation du déssert 1 : "Soupe de Perles de Tapioca au coco et à la banane"
        produi1.getIngredients().add(ing200);
        produi1.getIngredients().add(ing201);
        produi1.getIngredients().add(ing202);
        produi1.getIngredients().add(ing203);
        produi1.getIngredients().add(ing204);
        produi1.getIngredients().add(ing041);
        
        produi1.setStatut(statut3001);
        tp06.getProduits().add(produi1);
        
        // Creation du déssert 2 : "Raviolis au nutella"
        produi2.getIngredients().add(ing200);
        produi2.getIngredients().add(ing205);
        produi2.getIngredients().add(ing206);
        produi2.getIngredients().add(ing207);
        produi2.getIngredients().add(ing208);
        produi2.getIngredients().add(ing209);
        
        produi2.setStatut(statut3001);
        tp06.getProduits().add(produi2);
        
        // Creation du déssert 3 : "Flan au caramel et litchi"
        produi3.getIngredients().add(ing041);
        produi3.getIngredients().add(ing206);
        produi3.getIngredients().add(ing210);
        produi3.getIngredients().add(ing202);
        produi3.getIngredients().add(ing157);
        produi3.getIngredients().add(ing211);
        produi3.getIngredients().add(ing212);
        
        produi3.setStatut(statut3001);
        tp06.getProduits().add(produi3);
        
        // Creation du déssert 4 : "Fondant au chocolat et glace coco"
        produi4.getIngredients().add(ing207);
        produi4.getIngredients().add(ing157);
        produi4.getIngredients().add(ing041);
        produi4.getIngredients().add(ing213);
        produi4.getIngredients().add(ing214);
        produi4.getIngredients().add(ing215);
        produi4.getIngredients().add(ing027);
        
        produi4.setStatut(statut3001);
        tp06.getProduits().add(produi4);
        
        // Creation du déssert 5 : "Coupe coco, vanille, chocolat et banane"
        produi5.getIngredients().add(ing211);
        produi5.getIngredients().add(ing216);
        produi5.getIngredients().add(ing217);
        produi5.getIngredients().add(ing215);
        produi5.getIngredients().add(ing200);
        produi5.getIngredients().add(ing202);
        produi5.getIngredients().add(ing157);
        
        produi5.setStatut(statut3001);
        tp06.getProduits().add(produi5);
        
        // Creation du déssert 6 : "Salade de fruits frais exotiques"
        produi6.getIngredients().add(ing218);
        produi6.getIngredients().add(ing219);
        produi6.getIngredients().add(ing220);
        produi6.getIngredients().add(ing221);
        produi6.getIngredients().add(ing222);
        produi6.getIngredients().add(ing223);
        produi6.getIngredients().add(ing224);
        produi6.getIngredients().add(ing041);
        
        produi6.setStatut(statut3001);
        tp06.getProduits().add(produi6);
        
        // Creation du déssert 7 : "Mousse d'avocat doucement sucrée"
        produi7.getIngredients().add(ing225);
        produi7.getIngredients().add(ing226);
        produi7.getIngredients().add(ing227);
        produi7.getIngredients().add(ing228);
        produi7.getIngredients().add(ing041);
        produi7.getIngredients().add(ing014);
        produi7.getIngredients().add(ing229);
        produi7.getIngredients().add(ing230);
        
        produi7.setStatut(statut3001);
        tp06.getProduits().add(produi7);
        
        // Creation du déssert 8 : "Soupe sucrée de haricots noirs aux graines de lotus"
        produi8.getIngredients().add(ing231);
        produi8.getIngredients().add(ing232);
        produi8.getIngredients().add(ing204);
        produi8.getIngredients().add(ing041);
        produi8.getIngredients().add(ing027);
        produi8.getIngredients().add(ing014);
        produi8.getIngredients().add(ing203);
        produi8.getIngredients().add(ing206);
        
        produi8.setStatut(statut3001);
        tp06.getProduits().add(produi8);
        
        // Creation du déssert 9 : "Porridge sucré de riz gluant au taro et lait de coco"
        produi9.getIngredients().add(ing233);
        produi9.getIngredients().add(ing234);
        produi9.getIngredients().add(ing235);
        produi9.getIngredients().add(ing041);
        produi9.getIngredients().add(ing203);
        produi9.getIngredients().add(ing204);
        produi9.getIngredients().add(ing027);
        produi9.getIngredients().add(ing206);
        
        produi9.setStatut(statut3001);
        tp06.getProduits().add(produi9);
        
        // Creation du déssert 10 : "Entremets aux Cornilles et riz gluant (Chè dâu trang)"
        produi10.getIngredients().add(ing236);
        produi10.getIngredients().add(ing234);
        produi10.getIngredients().add(ing235);
        produi10.getIngredients().add(ing041);
        produi10.getIngredients().add(ing237);
        produi10.getIngredients().add(ing238);
        produi10.getIngredients().add(ing239);
        produi10.getIngredients().add(ing203);
        produi10.getIngredients().add(ing027);
        
        produi10.setStatut(statut3001);
        tp06.getProduits().add(produi10);
        
        //==================================================================================|
        //                                        SAUCES                                    |
        //==================================================================================|
        TypePlat tp07 = new TypePlat("SAUCES");
        tp07.setCarte(carte);
        
        //==================================================================================|
        //                                        Formules                                  |
        //==================================================================================|
         
        Formule formule01 = new Formule("Con Rong Vang / le Dragon d'Or","Entrée, Plat, Déssert" , 25, null);       
        formule01.setCodeTVA(tva10);
        formule01.setStatut(statut5001);
        formule01.setCarte(carte);
        formule01.setImage("page3_img2.jpg");
        
        TypePlat formule01Entree = new TypePlat("ENTREES");        
        formule01Entree.getProduits().add(prdu3);
        formule01Entree.getProduits().add(prdu4);
        formule01Entree.getProduits().add(prdu5);
        formule01.getTypePlats().add(formule01Entree);
        
        TypePlat formule01Plat = new TypePlat("PLATS");        
        formule01Plat.getProduits().add(produ1);
        formule01Plat.getProduits().add(produ5);
        formule01Plat.getProduits().add(produ8);
        formule01.getTypePlats().add(formule01Plat);
        
        TypePlat formule01Dessert = new TypePlat("DESSERTS");        
        formule01Dessert.getProduits().add(produi4);
        formule01Dessert.getProduits().add(produi6);
        formule01Dessert.getProduits().add(produi10);
        formule01.getTypePlats().add(formule01Dessert);
        
        Formule formule02 = new Formule("Con Mong Bien Tu Hao / le fière Goéland","Entrée, Plat", 19, null);
        formule02.setCodeTVA(tva10);
        formule02.setStatut(statut5001);
        formule02.setCarte(carte);
        formule02.setImage("page4_img1.jpg");
        
        TypePlat formule02Entree = new TypePlat("ENTREES");        
        formule02Entree.getProduits().add(prdu1);
        formule02Entree.getProduits().add(prdu3); 
        formule02.getTypePlats().add(formule02Entree);
        
        TypePlat formule02Plat = new TypePlat("PLATS");        
        formule02Plat.getProduits().add(produ4);
        formule02Plat.getProduits().add(produ6);
        formule02Plat.getProduits().add(produ8);
        formule02.getTypePlats().add(formule02Plat);
        
        Formule formule03 = new Formule("Con Ngua Co Canh / le Cheval ailé ","Plat, Déssert", 20, null);        
        formule03.setCodeTVA(tva10);
        formule03.setStatut(statut5001);
        formule03.setCarte(carte);
        formule03.setImage("page4_img2.jpg");
        
        TypePlat formule03Plat = new TypePlat("PLATS");        
        formule03Plat.getProduits().add(produ3);
        formule03Plat.getProduits().add(produ7);
        formule03Plat.getProduits().add(produ8);
        formule03.getTypePlats().add(formule03Plat);
        
        TypePlat formule03Dessert = new TypePlat("DESSERTS");         
        formule03Dessert.getProduits().add(produi4);
        formule03Dessert.getProduits().add(produi5);
        formule03Dessert.getProduits().add(produi8);
        formule03.getTypePlats().add(formule03Dessert);
        
        
        
         
        //==================================================================================|
        //                                 Creation Employes                                 |
        //==================================================================================|
        Restaurant rest = new  Restaurant("12555555587294","min-thung");
          
        
        Poste posteServeur = new Poste("Serveur", "Service en salle");
        Poste posteCaissier = new Poste("Caissier", "Encaissement des commandes");
        Poste posteManager = new Poste("Manager", "Gestion du restaurant");
        Poste posteCuisinier = new Poste("Cuisinier", "Preparation des commandes");
        
        Role RoleServeur = new Role("serveur","0001");
        Role RoleCaissier = new Role("caissier","0002");
        Role RoleCuisinier = new Role("cuisinier","0003");
        Role RoleManager = new Role("manager","0004");
        
        Employe serveur = new Employe();
        serveur.setNom("Dada");
        serveur.setPrenom("Yanick");
        Date dateEmbaucheServeur = new GregorianCalendar(2017, 9, 2).getTime();
        Date dateNaissanceServeur = new GregorianCalendar(1999, 1, 1).getTime();
        serveur.setDateNaissance(dateNaissanceServeur);
        serveur.setDateEmbauche(dateEmbaucheServeur);
        serveur.setAdresse("65 boulevard bessieres 75017 paris");     
        serveur.setPoste(posteServeur);
        serveur.setTelephone("06.23.45.67.89");
        serveur.setRestaurant(rest);
        serveur.getRoles().add(RoleServeur);

        Employe caissier = new Employe();
        caissier.setNom("cais01");        
        caissier.setPrenom("pren02");
        Date dateEmbaucheCaissier = new GregorianCalendar(2017, 6, 2).getTime();
        Date dateNaissanceCaissier = new GregorianCalendar(1997, 1, 1).getTime();
        caissier.setDateNaissance(dateNaissanceCaissier);
        caissier.setDateEmbauche(dateEmbaucheCaissier);
        caissier.setAdresse("6 rue georges et mai politzer 75012 paris");     
        caissier.setPoste(posteCaissier);
        caissier.setTelephone("06.23.45.67.80");
        caissier.setRestaurant(rest);
        caissier.getRoles().add(RoleCaissier);
        
        Employe cuisinier = new Employe();
        cuisinier.setNom("cuis01");        
        cuisinier.setPrenom("pren03");
        Date dateEmbaucheCuisinier = new GregorianCalendar(2017, 9, 2).getTime();
        Date dateNaissanceCuisinier = new GregorianCalendar(1980, 1, 1).getTime();
        cuisinier.setDateNaissance(dateNaissanceCuisinier);
        cuisinier.setDateEmbauche(dateEmbaucheCuisinier);
        cuisinier.setAdresse("2 place de clichy 75009 paris");     
        cuisinier.setPoste(posteCuisinier);
        cuisinier.setTelephone("07.23.45.67.87");
        cuisinier.setRestaurant(rest);
        cuisinier.getRoles().add(RoleCuisinier);
        
        Employe manager = new Employe();
        manager.setNom("mana01");        
        manager.setPrenom("pren04");
        Date dateEmbaucheManager = new GregorianCalendar(2017, 9, 2).getTime();
        Date dateNaissanceManager = new GregorianCalendar(1970, 1, 1).getTime();
        manager.setDateNaissance(dateNaissanceManager);
        manager.setDateEmbauche(dateEmbaucheManager);
        manager.setAdresse("3 rue alfred labriere 95100 argenteuil");     
        manager.setPoste(posteManager);
        manager.setTelephone("06.23.45.67.85");
        manager.setRestaurant(rest);
        manager.getRoles().add(RoleManager);
               
        
        Commande com1 = new Commande();
        com1.setEmplacement(Empl04);
        com1.setStatut(statut1002);
        Date dateCommande1 = new GregorianCalendar(2018, 1, 10).getTime();
        com1.setDateCommande(dateCommande1);
        
        LigneCommande lc1 = new LigneCommande();
        lc1.setProduit(produ9);
        lc1.setStatut(statut2004);        
        lc1.setCommande(com1);
        
        LigneCommande lc11 = new LigneCommande();
        lc11.setProduit(prdu5);
        lc11.setStatut(statut2004);        
        lc11.setCommande(com1);
        
        LigneCommande lc12 = new LigneCommande();
        lc12.setProduit(produi1);
        lc12.setStatut(statut2004);        
        lc12.setCommande(com1);
        
        Commande com2 = new Commande();
        com2.setEmplacement(Empl03);
        com2.setStatut(statut1002);
        Date dateCommande2 = new GregorianCalendar(2018, 1, 9).getTime();
        com2.setDateCommande(dateCommande2);
        
        LigneCommande lc13 = new LigneCommande();
        lc13.setProduit(produ6);
        lc13.setStatut(statut2004);        
        lc13.setCommande(com2);
        
        LigneCommande lc14 = new LigneCommande();
        lc14.setProduit(produ8);
        lc14.setStatut(statut2004);        
        lc14.setCommande(com2);
        
        
        em.persist(lc1);
        em.persist(lc11);
        em.persist(lc12);
        em.persist(lc13);
        em.persist(lc14);
        
        em.persist(serveur);
        em.persist(caissier);
        em.persist(cuisinier);
        em.persist(manager);
        
       
        
        em.persist(formule01);
        em.persist(formule02);
        em.persist(formule03);
        
        em.persist(tva5_5);
        em.persist(tva10);
        em.persist(tva20);
        
        em.persist(statut1001);
        em.persist(statut1002);
        em.persist(statut1003);
        em.persist(statut1004);
        em.persist(statut1005);
        em.persist(statut1006);
        em.persist(statut1007);
        em.persist(statut2001);
        em.persist(statut2002);
        em.persist(statut2003);
        em.persist(statut2004);
        em.persist(statut2005);
        em.persist(statut2006);
        em.persist(statut3001);
        em.persist(statut3002);
        em.persist(statut4001);
        em.persist(statut4002);
        em.persist(statut5001);
        em.persist(statut5002);
        em.persist(statut6001);
        em.persist(statut6002);
        em.persist(statut6003);
        em.persist(statut6004);
        
        em.persist(tp01);
        em.persist(tp02);        
        em.persist(tp05);
        em.persist(tp06);
        em.persist(tp07);
        
        em.persist(salades);
        em.persist(soupes);
        em.persist(pates);
        em.persist(viandes);
        em.persist(volailles);
        em.persist(poissons);
        em.persist(legumes);
        em.persist(fruits);
        em.persist(fromages);
        em.persist(boissons);
        em.persist(aperitifs);        
        em.persist(fruitMer);
        em.persist(riz);
        
        em.persist(Empl01);
        em.persist(Empl02);
        em.persist(Empl03);
        em.persist(Empl04);
        em.persist(Empl05);
        em.persist(Empl06);
        em.persist(Empl07);
        em.persist(Empl08);
        em.persist(Empl09);
        em.persist(Empl10);
        em.persist(Empl11);
        em.persist(Empl12);
        em.persist(Empl13);
        em.persist(Empl14);
        em.persist(Empl15);
        em.persist(Empl16);
        em.persist(Empl17);
        em.persist(Empl18);
        em.persist(Empl19);
        em.persist(Empl20);
        em.persist(Empl21);
        em.persist(Empl22);
        em.persist(Empl23);
        em.persist(Empl24);
        em.persist(Empl25);
        em.persist(Empl26);
        em.persist(Empl27);
        em.persist(Empl28);        
        
        em.persist(formule01);
        em.persist(formule02);
        em.persist(formule03);
        
        
        em.flush();
    
    }

}
