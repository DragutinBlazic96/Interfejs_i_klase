import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {

      Krug krug=new Krug(2);
      Pravougaonik pravougaonik=new Pravougaonik(2,5);
      Trougao trougao=new Trougao(10,22,31);



      System.out.println("Obim Kruga je: " + krug.obim() + " a Povrsina Kruga je: "+krug.povrsina());
      System.out.println("Obim Pravougaonika je: " + pravougaonik.obim() + " a Povrsina Pravougaonika je: "+pravougaonik.povrsina());
      System.out.println("Obim Trougla je: " + trougao.obim() + " a Povrsina Trougla je: "+trougao.povrsina());
      





    }


    }

