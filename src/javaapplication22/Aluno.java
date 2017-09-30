package javaapplication22;
public class Aluno {
    private int ra;
    private String Nome;
    private float n1;
    private float n2;

    public Aluno(int ra, String Nome, float n1, float n2) {
        this.ra = ra;
        this.Nome = Nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    public float calcMedia(){
        return this.n1 + this.n2 / 2;
        
    }


    
    public String imprimir(){
        return null;
    
           
}    
    
            
         
}
