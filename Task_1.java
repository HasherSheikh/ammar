class Mark_sheet{
	
	private String studentname;
	private double totalmarks;
	private double obtainedmarks;
	private double percentage;
	private String grade;
	private double GPA;

public Mark_sheet(String studentname,double totalmarks,double obtainedmarks){
    this.studentname=studentname;
    this.totalmarks=totalmarks;
    this.obtainedmarks=obtainedmarks;
    calculate_marks();
}
private void calculate_marks(){
percentage=(obtainedmarks/totalmarks)*100;
if (percentage>=85){
	grade="A+";
	GPA=4.0;
}
}
}

