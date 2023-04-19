package lamda;

public interface Maneger {
	void read();
    void write();
    default void log(String message){
    	System.out.println("LOG: "+message);
    }
    
    //khong overide cung khong sao
 }
