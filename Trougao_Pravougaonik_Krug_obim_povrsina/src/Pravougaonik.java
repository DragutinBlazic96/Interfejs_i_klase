public class Pravougaonik implements Figura {

    private double a;
    private double b;


public Pravougaonik(int a,int b){

    this.a=a;
    this.b=b;
}

@Override
    public double obim(){

    return 2*a+2*b;
}
@Override
    public double povrsina(){



    return a*b;
}

}
