
import java.util.Observable;

public class FischFeeder extends Observable{
  
  public void feedTheFisch(){
    setChanged();
    notifyObservers();
  }
}
