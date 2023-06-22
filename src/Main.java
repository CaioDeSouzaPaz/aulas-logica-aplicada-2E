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
        rainha.comer();

            Produto p1 = new Produto(5.00);
            Produto p2 = new Produto();
            Produto p3;
            p3 = new Produto("bala", 2.00);
            p3 = new Produto("chiclete", 4.00);
            p1.preco = 10.00;
            //p1.nome = "chocolate";
        p1.setNome("chocolate");
        }

    }
