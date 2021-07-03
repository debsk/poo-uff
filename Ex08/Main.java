package Ex08;

class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        Celular celular = new Celular(bateria);
        
        celular.enviarMensagem("Oi, meu nome é Débora");
        celular.enviarMensagem("Olá");
        celular.enviarMensagem("Turo bom?");
        

        celular.efetuarLigacao(150);
    }
}
