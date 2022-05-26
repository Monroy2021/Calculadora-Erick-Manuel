package operaciones;

public class Calculadora {
    private float operando1;
    private float operando2;

    public Calculadora(){

    }
    public Calculadora( float operando1, float operando2){
        this.operando1 = operando1;
        this.operando2= operando2;

    }

    public  float sumar(){
        return float suma = this.operando1+this.operando2;

    }
    public float restar(){
        return float resta= this.operando1-this.operando2;
    }
    public float multiplicar(){
        return float multiplicacion = this.operando1*this.operando2;
    }
    public float dividir(){
        return division = this.operando1/this.operando2;
    }
}