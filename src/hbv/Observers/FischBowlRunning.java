
import java.util.ArrayList;
import java.util.List;

class FischBowlRunner{
  public static void main(String[] args){
    List<TropicalFisch> fisch = new ArrayList<>();

    fisch.add(new TropicalFisch("Carp"));
    fisch.add(new TropicalFisch("Carp1"));
    fisch.add(new TropicalFisch("Carp2"));

    FischFeeder theFischFeeder = new FischFeeder();

    for(TropicalFisch i:fisch){
    theFischFeeder.addObserver(i);
    }

    System.out.println("we are feeding the fisch ...");
    theFischFeeder.feedTheFisch();
  }

}
