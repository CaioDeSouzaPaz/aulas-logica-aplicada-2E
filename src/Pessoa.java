public class Pessoa extends Animal{
    //atributos da pessoa
    public String sobrenome;
    //Método da pessoa
    public void falar (){
        System.out.println("falei"); }
        //sobrecarga de metodo falar ()
        public String falar(String volume) {
            return "falei" + volume;
    }

}