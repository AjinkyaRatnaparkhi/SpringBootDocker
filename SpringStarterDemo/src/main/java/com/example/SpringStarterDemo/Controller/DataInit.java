package com.example.SpringStarterDemo.Controller;

public class DataInit /*implements ApplicationRunner*/ {/*

	@Autowired
	private StudentDAO dao;
	
	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		long count = dao.count();
		
		if(count == 0) {
			
			Course c1 = new Course();
			c1.setCourseId(new Long(11));
			c1.setCourseName("CS");
			c1.setCourseDesc("Computer Science Course");
			
			Course c2 = new Course();
			c2.setCourseId(new Long(12));
			c2.setCourseName("MATH");
			c2.setCourseDesc("Mathematics Course");

			Course c3 = new Course();
			c3.setCourseId(new Long(13));
			c3.setCourseName("CHEM");
			c3.setCourseDesc("Chemistry Science Course");

			Course c4 = new Course();
			c4.setCourseId(new Long(14));
			c4.setCourseName("PHY");
			c4.setCourseDesc("Physics Science Course");

			
			courseDAO.save(c1);
			courseDAO.save(c2);
			courseDAO.save(c3);
			courseDAO.save(c4);
			
			
			
			Student s1 = new Student();
			
			s1.setId(new Long(1));
			s1.setName("AJ");
			s1.setQualification("BSC");
			
			s1.setCourseList(Arrays.asList(c2,c3,c4));
			
			
			Student s2 = new Student();
			
			s2.setId(new Long(2));
			s2.setName("SH");
			s2.setQualification("Engineer");
			
			s2.setCourseList(Arrays.asList(c1,c2,c3));
			
			
			
			dao.save(s1);
			dao.save(s2);
		}
	}

*/}
