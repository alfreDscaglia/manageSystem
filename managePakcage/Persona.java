package managePakcage;

public class Persona {



    String nome;
    String ruolo;
    double stipendio;

    /*  costruttore                */

    public Persona(String name,String occupation,double boxMoney) {


        this.nome = name;
        this.ruolo = occupation;
        this.stipendio = boxMoney ;

    }

    public String getNome() { return this.nome; }

    public String showNome() { return this.nome; }



}
