package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.Grade;
import kr.ac.hansung.dao.GradeDAO;

@Service("offerService")
public class GradeService {
	private GradeDAO gradeDAO;

	@Autowired
	public void setGradeDAO(GradeDAO gradeDAO) {
		this.gradeDAO = gradeDAO;
	}
	
	
	//년도, 학기 조회
	public List<Grade> getCurrent(int year, int semester) {
		return gradeDAO.getGrades(year, semester);
	}
	
	
	//모든 데이터베이스 조회
	public List<Grade> getAllCurrent() {
		return gradeDAO.getAllGrades();
	}
	
	public boolean insert(Grade grade) {
		return gradeDAO.insert(grade);
	}
	
	
	public boolean delete(String subjectCode) {
		return gradeDAO.delete(subjectCode);
	}
	public boolean delete1(Integer year, String subjectCode) {
		return gradeDAO.delete1(year, subjectCode);
	}
	

}
