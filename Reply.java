import java.util.ArrayList;
import java.util.Arrays;
class Reply {
    public static void main(String[] args){
	PM[] pms = Test.pm();
	Developer[] devs = Test.devs();
	char[][] map = Test.map();
	OrderPM[] prio = new OrderPM[(pms.length-1)*pms.length/2];
	int index = 0;
	for(int i = 0; i < pms.length; i++)
	    for(int j = i+1; j < pms.length; j++){
		OrderPM newel = new OrderPM(i,j);
		    newel.TP = 0;
		if(pms[i].company.equals(pms[j].company))
		    newel.TP = pms[i].bonus*pms[j].bonus;
		prio[index] = newel;
		index++;
	    }
	Arrays.sort(prio);
	for(int i = 0; i < prio.length; i++)
	    System.out.println(prio[i].toString());
	int indexf = 0;
	int indexl = prio.length-1;
	int[][] plcpm = new int[map.length][map[0].length];
	for(int i = 0; i < plcpm.length; i++)
	    for(int j = 0; j < plcpm[0].length; j++)
		plcpm[i][j] = -1;
	for(int i = 0; i < map.length; i++)
	    for(int j = 0, j<map[i].length; j++){
		if (map[i][j] == 'M')
		
			  
			  
	    }
	
    }
    
}
