package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class GradeDAO {
	
	private JdbcTemplate jdbcTemplateObject;
	
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from grade";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	

	
	// 수강년도, 학기 입력받아 조회
	public List<Grade> getGrades(int year, int semester) {
		String sqlStatement = "select * from grade where 수강년도=? and 학기=?" ;
		return jdbcTemplateObject.query(sqlStatement, new Object[]{year, semester},
				new RowMapper<Grade>() {

					public Grade mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						Grade grade = new Grade();
						
						grade.setYear(rs.getInt("수강년도"));
						grade.setSemester(rs.getInt("학기"));
						grade.setSubject(rs.getString("교과명"));
						grade.setSubjectCode(rs.getString("교과코드"));
						grade.setPart(rs.getString("구분"));
						grade.setCredit(rs.getInt("학점"));
						grade.setGrade(rs.getString("성적"));
						
						return grade;
					}
		});
	}
	
	public List<Grade> getAllGrades() {
		String sqlStatement = "select * from grade";
		return jdbcTemplateObject.query(sqlStatement,
				new RowMapper<Grade>() {

					public Grade mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						Grade grade = new Grade();
						
						grade.setYear(rs.getInt("수강년도"));
						grade.setSemester(rs.getInt("학기"));
						grade.setSubject(rs.getString("교과명"));
						grade.setSubjectCode(rs.getString("교과코드"));
						grade.setPart(rs.getString("구분"));
						grade.setCredit(rs.getInt("학점"));
						grade.setGrade(rs.getString("성적"));
						
						return grade;
					}
		});
	}
	
	public boolean insert (Grade grade) {
		String sqlStatement = "insert into grade values (?,?,?,?,?,?,?)";
		Integer year = grade.getYear();
		Integer semester = grade.getSemester();
		String subject = grade.getSubject();
		String subjectCode = grade.getSubjectCode();
		String part = grade.getPart();
		Integer credit = grade.getCredit();
		String grade1= grade.getGrade();
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year,semester,subject,subjectCode,part,credit,grade1} ) == 1);
		
	}
	
	public boolean delete (String subjectCode) {

		String sqlStatement = "delete from grade where  교과코드=? and 수강년도=? and 학기=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{subjectCode,2016,1} ) ==1);
	}
	
	
	public boolean delete1 (Integer year, String subjectCode) {
		String sqlStatement = "delete from grade where 수강년도=? and 교과코드=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year,subjectCode} ) ==1);
	}
}
