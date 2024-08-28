package designPattern.singleton;

public class Singleton implements Cloneable{

	private static volatile Singleton INSTANCE=null;
	
	//case : to handle reflection 
	private Singleton() {	
		if(INSTANCE!=null) {
			//throw runtime exception
		}
	}
	
	//case: to handle serialization
	protected Object readOnly() {
		return getInstance();
	}
	
	//case : to handle cloneing
	@Override
	protected Object clone() throws CloneNotSupportedException {
	  throw new CloneNotSupportedException("CloneNotSupported in singleton class");
	}
	
	public static Singleton getInstance() {
		//case : add double check with synchronized and volatile to make thread safe
		if(INSTANCE==null) {
			synchronized(Singleton.class) {
				if(INSTANCE==null) {
					return new Singleton();
				}
			}
		}	
		return INSTANCE;
	}
}