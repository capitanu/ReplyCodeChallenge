import java.util.ArrayList; 
class OrderPM implements Comparable<OrderPM>{
    /*ArrayList<PM> pms = new ArrayList<PM>();
    String name;
    public Company_PM(ArrayList<PM> pms, String name){
	this.name = name;
	this.pms = pms;
	}*/
    int index1;
    int index2;
    int TP;

    
    public OrderPM(int index1,int index2, int TP){
	this.index1 = index1;
	this.index2 = index2;
	this.TP = TP;
    }

    public OrderPM(int index1,int index2){
	this.index1 = index1;
	this.index2 = index2;
    }

    public int compareTo(OrderPM other){
	if(this.TP > other.TP) return -1;
	else return 1;
    }

    public String toString(){
	return index1 + " " + index2 + ", Score " + TP;
    }
    
}
