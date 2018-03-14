import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import managePakcage.Manager;
import managePakcage.Persona;

public class Principale {


    public static void main(String[] args) {


        Persona uno = new Persona("Daniele Rossi","secretary",18556);
        Persona due = new Persona("Marco Gelata","developer",22345);
        Persona tre = new Persona("Attilio Monco","developer",31000);

        Map<Integer,Persona> dipendenti = new HashMap<>();

        dipendenti.put(1,uno);
        dipendenti.put(2,due);
        dipendenti.put(3,tre);





        //Restituisce uninsieme di Map.Entry che rappresenta le coppie chiave - valore presenti nella tabella.
          //Map.entry è un contenitore,utilizzo un oggetto ed una variabile di appoggio
        for(Map.Entry<Integer,Persona> entry:dipendenti.entrySet()) {
            int key=entry.getKey();
            Persona b= entry.getValue();
            System.out.println(key+" dettaglio:");
            System.out.println(b.getNome());
        }


        // creo l' entità manager che gestisce le eliminazioni dall collezione
        Manager m = new Manager("giuann","manager", 45000);

        int flag=0;

        for(Map.Entry<Integer,Persona> entry:dipendenti.entrySet()) {

             int bey= entry.getKey();  //variabile a cui viene associata la key corrente
             Persona be= entry.getValue();  //oggetto a cui viene associato l oggetto corrente

             String locale = be.getNome();


            if(locale == m.reMoveDip())
            {

             System.out.println("\n\n dipendente trovato\n");
             flag= bey;
            }



        }

       // rimuove il dipendente trovato e ristampa aggiornato
       dipendenti.remove(flag);

        System.out.println("\n\nElenco Aggiornato ");

        for(Map.Entry<Integer,Persona> entry:dipendenti.entrySet()) {
            int key=entry.getKey();
            Persona b= entry.getValue();
            System.out.println(key+" dettaglio:");
            System.out.println(b.getNome());
        }







    }

}