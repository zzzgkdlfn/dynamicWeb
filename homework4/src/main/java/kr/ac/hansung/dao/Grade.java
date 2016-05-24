package kr.ac.hansung.dao;

public class Grade {

	private int year;	//?수강년도
	private int semester;	//학기
	private String subject; //교과명
	private String subjectCode; //교과코드
	private String part; //구분
	private int credit;	//?성적
	private String grade; //학점
	
	
	public Grade() {
		
	}
	
	public Grade(int year, int semester, String subject, String subjectCode, String part, int credit, String grade) {
		this.year = year;
		this.semester = semester;
		this.subject = subject;
		this.subjectCode = subjectCode;
		this.part = part;
		this.credit = credit;
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	
	public String toString() {
		return "Grade [수강년도=" + year + ", 학기=" + semester + ", 교과명=" + subject + ", 교과코드="
				+ subjectCode + ", 구분=" + part + ", 학점=" + credit + ", 평점" + grade + "]";
	}
	
	
	
}
