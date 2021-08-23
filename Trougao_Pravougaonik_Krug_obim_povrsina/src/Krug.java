public class Krug implements Figura{

   public double r;

public Krug(int r){

    this.r=r;
}

@Override
public double obim(){

    return 2*r*Math.PI;
}
@Override
public double povrsina(){

    return r*r*Math.PI;
}
}
