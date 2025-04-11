public class Evento {

    private Pelea peleaEstelar;

    public Evento(Pelea peleaEstelar) {
        this.peleaEstelar = peleaEstelar;
    }

    public Pelea getPeleaEstelar() {
        return peleaEstelar;
    }

    public void setPeleaEstelar(Pelea peleaEstelar) {
        this.peleaEstelar = peleaEstelar;
    }
    
    public void iniciarEvento() {
        System.out.println("Iniciando el evento con: " + peleaEstelar);
    }

    @Override
    public String toString() {
        return "Evento [peleaEstelar=" + peleaEstelar + "]";
    }

    



}