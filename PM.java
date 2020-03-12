
public class PM implements Comparable<PM>{
    String company;
    int bonus;
    public PM(String company, int bonus){
    this.bonus = bonus;
	this.company = company;
    }

    public PM(){
        String company = this.company;
        int bonus = this.bonus;
    }


    public int compareTo(PM other){
	if(this.bonus > other.bonus) return 1;
	else return -1;
    }

    public String toString(){
        return company + " " + bonus;
    }

}
