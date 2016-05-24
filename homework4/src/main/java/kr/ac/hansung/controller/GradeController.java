package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.dao.Grade;
import kr.ac.hansung.service.GradeService;

@Controller
public class GradeController {

	private GradeService gradeService;

	@Autowired
	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	@RequestMapping("2010/1")
	public String show2010_1(Model model) {
		List<Grade> grades = gradeService.getCurrent(2010, 1);
		model.addAttribute("grades", grades);
		return "2010_1";
	}

	@RequestMapping("2010/2")
	public String show2010_2(Model model) {
		List<Grade> grades = gradeService.getCurrent(2010, 2);
		model.addAttribute("grades", grades);
		return "2010_2";
	}

	@RequestMapping("2014/1")
	public String show2014_1(Model model) {
		List<Grade> grades = gradeService.getCurrent(2014, 1);
		model.addAttribute("grades", grades);
		return "2014_1";
	}

	@RequestMapping("2014/2")
	public String show2014_2(Model model) {
		List<Grade> grades = gradeService.getCurrent(2014, 2);
		model.addAttribute("grades", grades);
		return "2014_2";
	}

	@RequestMapping("2015/1")
	public String show2015_1(Model model) {
		List<Grade> grades = gradeService.getCurrent(2015, 1);
		model.addAttribute("grades", grades);
		return "2015_1";
	}

	@RequestMapping("2015/2")
	public String show2015_2(Model model) {
		List<Grade> grades = gradeService.getCurrent(2015, 2);
		model.addAttribute("grades", grades);
		return "2015_2";
	}
	
	@RequestMapping("deleteGrade")
	public String deleteGrade(Model model) {
		List<Grade> grades = gradeService.getAllCurrent();
		int allCredit = 0; // ��û����
		int rees = 0; // ����
		int coreA = 0; // �ٱ�A
		int coreB = 0; // �ٱ� B
		int free = 0; // �ϱ�
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// ����, ����, ����
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("����"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("�ϱ�"))
				free += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("����"))
				major += grade.getCredit();
		}

		model.addAttribute("allCredit", allCredit);
		model.addAttribute("rees", rees);
		model.addAttribute("coreA", coreA);
		model.addAttribute("coreB", coreB);
		model.addAttribute("free", free);
		model.addAttribute("majorBasic", majorBasic);
		model.addAttribute("majorSelect", majorSelect);
		model.addAttribute("major", major);
		model.addAttribute("grades", grades);

		return "deleteGrade";
	}
	
	

	@RequestMapping("/createGrade")
	public String showGrade(Model model) {

		List<Grade> grades = gradeService.getAllCurrent();
		int allCredit = 0; // ��û����
		int rees = 0; // ����
		int coreA = 0; // �ٱ�A
		int coreB = 0; // �ٱ� B
		int free = 0; // �ϱ�
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// ����, ����, ����
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("����"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("�ϱ�"))
				free += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("����"))
				major += grade.getCredit();
		}

		model.addAttribute("allCredit", allCredit);
		model.addAttribute("rees", rees);
		model.addAttribute("coreA", coreA);
		model.addAttribute("coreB", coreB);
		model.addAttribute("free", free);
		model.addAttribute("majorBasic", majorBasic);
		model.addAttribute("majorSelect", majorSelect);
		model.addAttribute("major", major);
		model.addAttribute("grades", grades);

		return "createGrade2";

	}


	@RequestMapping("addDB")
	public String addDB(@RequestParam("subject") String subject,
			@RequestParam("subjectCode") String subjectCode,
			@RequestParam("part") String part, 
			@RequestParam("credit") Integer credit, Model model){

		System.out.println(subject + subjectCode + part + credit);
		Grade grade1 = new Grade(2016,1, subject, subjectCode, part, credit, "null");
		// Grade grade1 = new Grade(2016,1,"ĸ���������1", "CSE0025","����",6,"null");

		gradeService.insert(grade1);

		List<Grade> grades = gradeService.getAllCurrent();
		int allCredit = 0; // ��û����
		int rees = 0; // ����
		int coreA = 0; // �ٱ�A
		int coreB = 0; // �ٱ� B
		int free = 0; // �ϱ�
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// ����, ����, ����
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("����"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("�ϱ�"))
				free += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("����"))
				major += grade.getCredit();
		}

		model.addAttribute("allCredit", allCredit);
		model.addAttribute("rees", rees);
		model.addAttribute("coreA", coreA);
		model.addAttribute("coreB", coreB);
		model.addAttribute("free", free);
		model.addAttribute("majorBasic", majorBasic);
		model.addAttribute("majorSelect", majorSelect);
		model.addAttribute("major", major);
		model.addAttribute("grades", grades);

		return "addDB";
	}

	//�⵵, �б� ������ �����ڵ�
	@RequestMapping("deleteDB")
	public String deleteDB( @RequestParam("subjectCode") String subjectCode,
			@RequestParam("subject") String subject,
			@RequestParam("year") Integer year,
			@RequestParam("semester") Integer semester, Model model) {
		
		gradeService.delete(subjectCode);
		
		List<Grade> grades = gradeService.getAllCurrent();
		int allCredit = 0; // ��û����
		int rees = 0; // ����
		int coreA = 0; // �ٱ�A
		int coreB = 0; // �ٱ� B
		int free = 0; // �ϱ�
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// ����, ����, ����
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("����"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("�ٱ�B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("�ϱ�"))
				free += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("����"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("����"))
				major += grade.getCredit();
		}

		model.addAttribute("allCredit", allCredit);
		model.addAttribute("rees", rees);
		model.addAttribute("coreA", coreA);
		model.addAttribute("coreB", coreB);
		model.addAttribute("free", free);
		model.addAttribute("majorBasic", majorBasic);
		model.addAttribute("majorSelect", majorSelect);
		model.addAttribute("major", major);
		model.addAttribute("grades", grades);
		
		return "deleteDB";
		
	}
}
