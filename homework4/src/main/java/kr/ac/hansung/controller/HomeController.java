package kr.ac.hansung.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.dao.Grade;
import kr.ac.hansung.service.GradeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private GradeService gradeService;

	@Autowired
	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(Model model) {
		
		
		// �� ��������
		List<Grade> grades = gradeService.getAllCurrent();
		
		//�б⺰ ����
		int sumCredit[] = new int[6];
		for(Grade grade: grades) {
			if(grade.getYear() == 2010) {
				if(grade.getSemester() == 1) sumCredit[0] += grade.getCredit();
				else sumCredit[1] += grade.getCredit();
			}
			else if(grade.getYear() == 2014) {
				if(grade.getSemester()==1) sumCredit[2] += grade.getCredit();
				else sumCredit[3] += grade.getCredit();
			}
			else if(grade.getYear() == 2015) {
				if(grade.getSemester() ==1 ) sumCredit[4] += grade.getCredit();
				else sumCredit[5] += grade.getCredit();
			}
			
		}
	
		//�� ���� ����
		int allCredit = 0;   //��û����
		int rees = 0 ; //����
		int coreA = 0; //�ٱ�A
		int coreB = 0 ; //�ٱ� B
		int free = 0 ; //�ϱ�
		int majorBasic= 0; int majorSelect=0;  int major = 0;//����, ����, ����
		
		for(Grade grade: grades) {
			allCredit += grade.getCredit();
			if(grade.getPart().equals("����")) rees += grade.getCredit();
			else if(grade.getPart().equals("�ٱ�A")) coreA += grade.getCredit();
			else if(grade.getPart().equals("�ٱ�B")) coreB += grade.getCredit();
			else if(grade.getPart().equals("�ϱ�")) free += grade.getCredit();
			if(grade.getPart().equals("����")) majorBasic += grade.getCredit();
			if(grade.getPart().equals("����")) majorSelect += grade.getCredit();
			if(grade.getPart().equals("����")) major += grade.getCredit();
		}
		
		
		model.addAttribute("sumCredit", sumCredit);
		model.addAttribute("allCredit", allCredit);
		model.addAttribute("rees", rees);
		model.addAttribute("coreA",coreA);
		model.addAttribute("coreB",coreB);
		model.addAttribute("free",free);
		model.addAttribute("majorBasic",majorBasic);
		model.addAttribute("majorSelect",majorSelect);
		model.addAttribute("major",major);
		model.addAttribute("grades", grades);

		return "home";
	}
	
}
