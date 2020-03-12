import java.util.ArrayList;

class Reply {
    public static void main(String[] args){
	PM[] pms = Test.pm();
	Developer[] devs = Test.devs();
	char[][] map = Test.map();
	/*ArrayList<Company_PM> cmp = new ArrayList<Company_PM>();
	for(int i = 0; i < pms.length; i++){
	    int ok = 1;
	    for(Company_PM cpm : cmp)
		if(cpm.name.equals(pms[i].company)){
		    cpm.pms.add(pms[i]);
		    ok = 0;
		    break;
		}
	    if(ok == 1){
		ArrayList<PM> newpm = new ArrayList<PM>();
		newpm.add(pms[i]);
		Company_PM newcmp = new Company_PM(newpm, pms[i].company);
		    cmp.add(newcmp);
	    }
	}
	for(Company_PM cpm: cmp)
	System.out.println(cpm);*/
	
    }
    
}
