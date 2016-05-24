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
	
	
	//�⵵, �б� ��ȸ
	public List<Grade> getCurrent(int year, int semester) {
		return gradeDAO.getGrades(year, semester);
	}
	
	
	//��� �����ͺ��̽� ��ȸ
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
