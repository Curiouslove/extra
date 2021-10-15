package practicewithchief.execptions;

public class ArraySortException extends Exception{

    public ArraySortException(){
        super();
    }

    public ArraySortException(String message){
        super(message);
    }

    public ArraySortException(Throwable e){
        super(e);
    }

    public ArraySortException(String message, Throwable e){
        super(message, e);
    }

}
