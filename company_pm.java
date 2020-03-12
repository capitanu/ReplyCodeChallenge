import java.util.ArrayList; 
class Company_PM {
    ArrayList<PM> pms = new ArrayList<PM>();
    String name;
    public Company_PM(ArrayList<PM> pms, String name){
	this.name = name;
	this.pms = pms;
    }
}
