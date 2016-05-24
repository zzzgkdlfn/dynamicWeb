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
		int allCredit = 0; // 신청학점
		int rees = 0; // 교필
		int coreA = 0; // 핵교A
		int coreB = 0; // 핵교 B
		int free = 0; // 일교
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// 전기, 전선, 전지
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("교필"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("핵교A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("핵교B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("일교"))
				free += grade.getCredit();
			if (grade.getPart().equals("전기"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("전선"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("전지"))
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
		int allCredit = 0; // 신청학점
		int rees = 0; // 교필
		int coreA = 0; // 핵교A
		int coreB = 0; // 핵교 B
		int free = 0; // 일교
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// 전기, 전선, 전지
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("교필"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("핵교A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("핵교B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("일교"))
				free += grade.getCredit();
			if (grade.getPart().equals("전기"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("전선"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("전지"))
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
		// Grade grade1 = new Grade(2016,1,"캡스톤디자인1", "CSE0025","전지",6,"null");

		gradeService.insert(grade1);

		List<Grade> grades = gradeService.getAllCurrent();
		int allCredit = 0; // 신청학점
		int rees = 0; // 교필
		int coreA = 0; // 핵교A
		int coreB = 0; // 핵교 B
		int free = 0; // 일교
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// 전기, 전선, 전지
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("교필"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("핵교A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("핵교B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("일교"))
				free += grade.getCredit();
			if (grade.getPart().equals("전기"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("전선"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("전지"))
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

	//년도, 학기 교과목 교과코드
	@RequestMapping("deleteDB")
	public String deleteDB( @RequestParam("subjectCode") String subjectCode,
			@RequestParam("subject") String subject,
			@RequestParam("year") Integer year,
			@RequestParam("semester") Integer semester, Model model) {
		
		gradeService.delete(subjectCode);
		
		List<Grade> grades = gradeService.getAllCurrent();
		int allCredit = 0; // 신청학점
		int rees = 0; // 교필
		int coreA = 0; // 핵교A
		int coreB = 0; // 핵교 B
		int free = 0; // 일교
		int majorBasic = 0;
		int majorSelect = 0;
		int major = 0;// 전기, 전선, 전지
		for (Grade grade : grades) {
			allCredit += grade.getCredit();
			if (grade.getPart().equals("교필"))
				rees += grade.getCredit();
			else if (grade.getPart().equals("핵교A"))
				coreA += grade.getCredit();
			else if (grade.getPart().equals("핵교B"))
				coreB += grade.getCredit();
			else if (grade.getPart().equals("일교"))
				free += grade.getCredit();
			if (grade.getPart().equals("전기"))
				majorBasic += grade.getCredit();
			if (grade.getPart().equals("전선"))
				majorSelect += grade.getCredit();
			if (grade.getPart().equals("전지"))
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
