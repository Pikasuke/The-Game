package com.thegame.model;

public class Combat {


    static void combatAMort( Bon bon, Mauvais mauvais,Integer choix ){
        // Le bon attaque avant le mauvais
            bon.attaquer(mauvais, choix);
            // on arrête le combat avant que le mechant attaque si on a gagne
            if( mauvais.getPv() <= 0 ) {
                return;
            }
            mauvais.attaquer(0, bon); // choix est inutile ici
            // on arrete le combat si on a perdu
            if( bon.getPv() <= 0  ) {
            	return;
        }
           
    }

    public static void main(String[] args) {
        Bon bon = new Bon();
        Mauvais mauvais = new Mauvais();
        combatAMort(bon, mauvais, null);

    }

}
