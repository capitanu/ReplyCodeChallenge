class Developer {
    int bonus;
    String company;
    int nrOfSkills;
    String[] skills;

    public Developer(){
        int bonus = this.bonus;
        String company = this.company;
        int nrOfSkills = this.nrOfSkills;
        String[] skills = this.skills;
    }
    public Developer(String company, int bonus, String[] skills){
	this.company = company;
	this.bonus = bonus;
	this.skills = skills;
    }
    public Developer(String company, int bonus, int nrOfSkills, String[] skills){
        this.company = company;
        this.bonus = bonus;
        this.nrOfSkills = nrOfSkills;
        this.skills = skills;
        }

        public String toString(){
			String devString = company + " " + bonus + " " + nrOfSkills;
			for (String i : skills) {
				devString = devString.concat(" " + i);
			}
			return devString;
        }
    
}
