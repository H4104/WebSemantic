package traitementgraphe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;



public class TraitementGraphe {

    public static void main(String[] args) throws FileNotFoundException {
       test2();
    }
    
    public static void test1(){
        Graphe g1 = new Graphe();
        Noeud A1 = new Noeud("A");
        Noeud B1 = new Noeud("B");
        Arete frere1 = new Arete(A1,B1,"frere");
        g1.ajouterArete(frere1);
        Noeud B2 = new Noeud("B");
        Noeud C1 = new Noeud("C");
        Arete pere1 = new Arete(B2,C1,"pere");
        g1.ajouterArete(pere1);

        Graphe g2 = new Graphe();
        Noeud A2 = new Noeud("A");
        Noeud B3 = new Noeud("B");
        Arete frere2 = new Arete(A2,B3,"frere");
        g2.ajouterArete(frere2);
        Noeud A3 = new Noeud("A");
        Noeud B4 = new Noeud("B");
        Arete frere3 = new Arete(B4,A3,"frere");
        g2.ajouterArete(frere3);
        Noeud B5 = new Noeud("B");
        Noeud E1 = new Noeud("E");
        Arete pere2 = new Arete(B5,E1,"pere");
        g2.ajouterArete(pere2);
        Noeud B6 = new Noeud("B");
        Noeud C2 = new Noeud("C");
        Arete mere1 = new Arete(B6,C2,"mere");
        g2.ajouterArete(mere1);
        Noeud C3 = new Noeud("C");
        Noeud D1 = new Noeud("D");
        Arete soeur1 = new Arete(C3,D1,"soeur");
        g2.ajouterArete(soeur1);

        System.out.println(g1.coefficientJaccard(g2));
        System.out.println(g2.coefficientJaccard(g1));
    }
    
    public static void test2() throws FileNotFoundException{
        ComparateurGraphes comp = new ComparateurGraphes();
        comp.parserGraphes(System.in);
        comp.creerPaires();
        FileOutputStream output = new FileOutputStream("paires.txt");
        comp.afficher(new PrintStream(output));
    }
}
