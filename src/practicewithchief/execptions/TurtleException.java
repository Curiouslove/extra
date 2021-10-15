package practicewithchief.execptions;

public class TurtleException extends Exception{
    public TurtleException(String message){
        super(message);
    }

  public TurtleException(String message, Throwable e){
       super(message, e);
  }

  public TurtleException(Throwable e){
        super(e);
  }
}
