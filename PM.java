
public class PM implements Comparable<PM>{
    String company;
    int bonus;
    public PM(String company, int bonus){
	this.company = company;
	this.bonus = bonus;
    }

    public int compareTo(PM other){
	if(this.bonus > other.bonus) return 1;
	else return -1;
    }
}
