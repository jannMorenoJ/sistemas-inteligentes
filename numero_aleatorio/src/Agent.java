import java.util.Random;

public class Agent {
    private int lastNumber;
    private boolean firstRun= true; // this flag is used when the agent is running by first time
    private int min;
    private int max;
    private Random r;

    public int getLastNumber() {
        return lastNumber;
    }

    public int getMax() {
        return max;
    }

    public boolean isFirstRun() {
        return firstRun;
    }

    public int getMin() {
        return min;
    }

    public Random getR() {
        return r;
    }

    public Agent(){
        this.min= 0;
        this.max= 10;
        this.r= new Random();
    }



    public String program(String perceptcion){
        if (firstRun){
            firstRun = false;

            this.lastNumber = (int) r.nextInt((this.max-this.min+1))+this.min;
            System.out.println(this.toString());
            return "El numero es: "+this.lastNumber+" ?";
        }else{
            if(perceptcion.equals("YES")){
                return "DEATH";
            }else{
                if(perceptcion.equals("NO")){
                    System.out.println(this.toString());
                    return "Es mayor o es menor a su numero?";
                }else{
                    if(perceptcion.equals("MAYOR")){
                        this.min= lastNumber;
                        this.lastNumber = (int) r.nextInt((this.max-this.min+1))+this.min;
                        System.out.println(this.toString());
                        return "El numero es: "+this.lastNumber+" ?";
                    }else{
                        if(perceptcion.equals("MENOR")){
                            this.max = this.lastNumber;
                            this.lastNumber = (int) r.nextInt((this.max-this.min+1))+this.min;
                            System.out.println(this.toString());
                            return "El numero es: "+this.lastNumber+" ?";
                        }
                    }
                }
            }
        return "OPCION NO VALIDA";
        }
    }

    @Override
    public String toString() {
        return "STATE: { MAX: "+this.max+", MIN: "+this.min+", LASTNUMBER(random number generated): "+
                this.lastNumber+" }";
    }
}
