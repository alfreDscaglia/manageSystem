package managePakcage;


public class Manager extends Persona
{

    public String nome;
    String ruolo;
    double stipendio;
    public String chiAzzoppo="Daniele Rossi";

    /*  costruttore                */

    public Manager(String name,String occupation,double boxMoney) {

        //super richiama il costruttore di base della classe Persona
        super(name, occupation, boxMoney);
    }

    public String getNome() { return this.nome; }

    public String reMoveDip(){ return  chiAzzoppo; }




}
