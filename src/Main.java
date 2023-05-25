public class Main {
    public static void main(String[] args) {
        //aula introdutória de Orientação á Objetos
        Pessoa adao = new Pessoa();
        //Declaração de objeto
        Pessoa qualquer;
        //instanciação de objeto
        qualquer = new Pessoa();
        //Definiçao do formato pessoa qualquer
        qualquer.nome = "rita";
        qualquer.sobrenome = "lee";
        qualquer.falar();
        // Criar novos objetos
        //Declarar objeto
        Pessoa rainha;
        // instanciar objetos
        rainha = new Pessoa();
        //definir forma do objeto
        rainha.nome = "tina";
        rainha.sobrenome = "tunner";
        // definir comportamento do objeto
        rainha.falar();
        System.out.println(rainha.falar(" alto"));
        rainha.comer();
        public void comer(){
            System.out.println("comer como pessoa");
        }

    }
}