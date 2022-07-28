package com.j2ee.td2.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {

        String line;
        System.out.println("Entrez une chaine : ");
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        Collection<Character> caracteres = extraireCaracteres(line);
        System.out.println(caracteres);

    }

    public static Collection<Character> extraireCaracteres(String string){

        Collection<Character> ctemp = new ArrayList<>();
        Collection<Character> c = new ArrayList<>();

        //Extrait les caractère de la chaine
        for (int i = 0; i < string.length(); i++) {
            ctemp.add(string.charAt(i));
        }

        //Récupération des caractères sans doublon
        for (Character cara : ctemp) {
            if (!c.contains(cara)) {
                c.add(cara);
            }
        }

        return c;
    }

}
