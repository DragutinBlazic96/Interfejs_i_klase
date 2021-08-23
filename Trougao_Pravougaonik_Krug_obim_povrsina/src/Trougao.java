public class Trougao implements Figura {
   private double a;
    private double b;
    private double c;

    public Trougao(int a, int b, int c){

        this.a=a;
        this.b=b;
        this.c=c;
    }

   @Override
    public double obim(){

        return a+b+c;
    }
    @Override
    public double povrsina(){

        double s=this.obim()/2;

        return Math.sqrt((s*a)*(s-b)*(s-c));

    }
}



