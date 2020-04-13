public class ParttimeJob {
	
	String ID;
	String Name;
	int Time;
	int Hours;
	int Wage;
	static int numParttimeJobsRegisterd = 0;
	
	public ParttimeJob() {
		numParttimeJobsRegisterd++;
	}
	
	public ParttimeJob(String ID,String Name) {
		this.ID = ID;
		this.Name = Name;
		numParttimeJobsRegisterd++;
	}
	
	public ParttimeJob(String ID, String Name, int Time, int Hours, int Wage) {
		this.ID = ID;
		this.Name = Name;
		this.Time = Time;
		this.Hours = Hours;
		this.Wage = Wage;
		numParttimeJobsRegisterd++;
	}
	
	public void printInfo() {
		System.out.println("parttimejobID: "+ ID + " parttimejobName: "+ Name + " parttimejobTime: "+ Time + " parttimejobHours: "+ Hours + " parttimejobWage: " + Wage);
	}
	
}
