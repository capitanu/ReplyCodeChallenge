class Developer {
    int bonus;
    String company;
    int nrOfSkills;
    String[] skills;
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


}
