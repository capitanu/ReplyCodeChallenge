class Test {

    public static char[][] map(){
	char[][] map = new char[5][3];
	map[0][0] = '#';
	map[1][0] = '#';
	map[2][0] = '#';
	map[3][0] = '#';
	map[4][0] = '#';
	map[0][1] = '#';
	map[1][1] = '_';
	map[2][1] = '#';
	map[3][1] = '#';
	map[4][1] = '_';
	map[0][2] = '#';
	map[1][2] = 'M';
	map[2][2] = 'M';
	map[3][2] = '_';
	map[4][2] = '_';
	return map;
    }

    public static Developer[] devs(){
	int nrOfDevelopers = 10;
	Developer[] devs = new Developer[10];
	String[] skills = new String[2];
	skills[0] = "java";
	skills[1] = "bpm";
	devs[0] = new Developer("opn",7,skills);
	skills = new String[2];
	skills[0] = "python";
	skills[1] = "azure";
	devs[1] = new Developer("clstr",5,skills);
	skills = new String[2];
	skills[0] = "python";
	skills[1] = "java";
	devs[2] = new Developer("open",8,skills);
	skills = new String[3];
	skills[0] = "java";
	skills[1] = "cybersecurity";
	skills[2] = "big_data";
	devs[3] = new Developer("com_v1", 4, skills);
	skills = new String[2];
	skills[0] = "nlp";
	skills[1] = "big_data";
	devs[4] = new Developer("mac",1,skills);
	skills = new String[2];
	skills[0] = "azure";
	skills[1] = "c#";
	devs[5] = new Developer("clstr",3,skills);
	skills = new String[2];
	skills[0] = "cybersecurity";
	skills[1] = "python";
	devs[6] = new Developer("com_v1",6,skills);
	skills = new String[3];
	skills[0] = "bpm";
	skills[1] = "python";
	skills[3] = "project_management";
	devs[7] = new Developer("opn",2,skills);
	skills = new String[4];
	skills[0] = "java";
	skills[1] = "c";
	skills[2] = "sql";
	skills[3] = "junit";
	devs[8] = new Developer("ble",5,skills);
	skills = new String[4];
	skills[0] = "python";
	skills[1] = "c";
	skills[2] = "java";
	skills[3] = "bpm";
	devs[9] = new Developer("clstr",1,skills);
	return devs;
    }

    public static PM[] pm(){
	PM[] pm = new PM[3];
	pm[0] = new PM("opn",2);
	pm[1] = new PM("ble",1);
	pm[2] = new PM("mac",5);
	return pm;
    }
}


