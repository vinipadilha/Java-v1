public class Motor {
    private boolean ligado;

    public Motor(){
        this.ligado = false;
    }

    public void ligar(){
        if (this.ligado == false){
            this.ligado = true;
        }
    }

    public void desligar(){
        if(this.ligado){
            this.ligado = false;
        }
    }

    public boolean isLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}

