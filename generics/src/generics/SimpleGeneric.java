package generics;

public class SimpleGeneric<T> {
	
	T obj;
	
	SimpleGeneric(T obj){
		this.obj = obj;
	}
	
	void showObjectType(){
		System.out.println(obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		SimpleGeneric<String>genClass = new SimpleGeneric<>("Input");
		genClass.showObjectType();
		
	}
}
