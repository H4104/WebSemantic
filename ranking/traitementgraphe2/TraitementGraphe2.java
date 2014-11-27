/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package traitementgraphe2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Lilian
 */
public class TraitementGraphe2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream input = new FileInputStream("paires.txt");
        ComparateurGraphes comp = new ComparateurGraphes();
        comp.creerPaires(input);
        comp.grouper(Double.parseDouble(args[0]));
        comp.afficher(System.out);
        input.close();
    }
}
