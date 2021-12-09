import java.util.Observable;
import java.util.Observer;


class TropicalFisch implements Observer{
    
    private String name;

    @Override
    public void update(Observable arg0, Object arg1){
      System.out.println(getName()+" was already fed");
    }

    public TropicalFisch(String name){
      super();
      this.name = name;
    }

    @Override
    public String toString(){
      return "TropicalFisch [name="+name+"]";
    }

    public String getName(){
      return name;
    }
    
    public void setName(){
      this.name = name;
    }
}


