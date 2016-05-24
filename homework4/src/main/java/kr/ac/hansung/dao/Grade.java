package kr.ac.hansung.dao;

public class Grade {

	private int year;	//?ˆ˜ê°•ë…„?„
	private int semester;	//?•™ê¸?
	private String subject; //êµê³¼ëª?
	private String subjectCode; //êµê³¼ì½”ë“œ
	private String part; //êµ¬ë¶„
	private int credit;	//?•™? 
	private String grade; //?„±? 
	
	
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
		return "Grade [¼ö°­³âµµ=" + year + ", ÇĞ±â=" + semester + ", ±³°ú¸í=" + subject + ", ±³°úÄÚµå="
				+ subjectCode + ", ±¸ºĞ=" + part + ", ÇĞÁ¡=" + credit + ", ÆòÁ¡" + grade + "]";
	}
	
	
	
}
