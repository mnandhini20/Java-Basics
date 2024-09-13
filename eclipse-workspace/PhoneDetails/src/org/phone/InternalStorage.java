package org.phone;
import org.company.Master;
//child

public class InternalStorage {
	private void processorName() {
       System.out.println("Intel");
	}
	private void ramSize() {
		 System.out.println("16GB");
	}
    public static void main(String[] args) {
    	 InternalStorage in = new InternalStorage();
    	 in.processorName();
    	 in.ramSize();
    	 ExternalStorage ex = new ExternalStorage();
    	 ex.size();
    	 Master ms = new Master();
    	 ms.masterName();
    }
}
