import java.io.*;
import java.util.*;


public class Parser {
	public static void main(String[] args) {
		int width;
		int height;
        try{
		Scanner in = new Scanner(System.in);
		width = Integer.parseInt(in.next());
		height = Integer.parseInt(in.next());

		char[][] map = new char[height][width];

		for (int i = 0; i < height ; i++ ) {
            String chunk = in.next();
			for (int j = 0; j < width; j++ ) {
				map[i][j] = chunk.charAt(j);
			}
		}

		for (int i = 0; i < height ; i++ ) {
			for (int j = 0; j < width ; j++ ) {
				System.out.print(map[i][j]);
            }
            System.out.println();
        }
        
        int nDev = Integer.parseInt(in.next());
        Developer[] devList = new Developer[nDev];

        for(int i = 0; i < nDev; i++){
            Developer newDev = new Developer();
            newDev.company = in.next();
            newDev.bonus = Integer.parseInt(in.next());
            int noSkills = Integer.parseInt(in.next());
            newDev.nrOfSkills = noSkills;
            String[] skills = new String[noSkills];
            for(int j = 0; j < noSkills; j++){
                skills[j] = in.next();
            }
            newDev.skills = skills;
            devList[i] = newDev;
            System.out.println(devList[i]);
        }

        int nPM = Integer.parseInt(in.next());
        System.out.println(nPM);
        PM[] pmList = new PM[nPM];

        for(int i = 0; i < nDev; i++){
            PM newPM = new PM();
            newPM.company = in.next();
            newPM.bonus = Integer.parseInt(in.next());
            pmList[i] = newPM;
            System.out.println(pmList[i]);
        }
        }catch(NoSuchElementException e){
            System.out.print("");
        }


		//while(in.hasNext()){
			//System.out.print(in.next());
			//}
    }
    

}