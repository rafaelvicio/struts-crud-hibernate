package com.ashok.mvc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ashok.dao.StudentDAO;
import com.ashok.dao.StudentDAOImpl;
import com.ashok.entity.Student;
import com.ashok.mvc.bean.StudentFormBean;
import com.ashok.mvc.bean.StudentIdFormBean;

public class StudentAction extends MappingDispatchAction {

	private static final String SUCCESS = "success";
	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentAction.class);
	private StudentDAO dao = StudentDAOImpl.getStudentDaoInstance();

	public ActionForward createStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LOGGER.info("createStudent() called..");
		StudentFormBean studentBean = (StudentFormBean) form;
		dao.saveStudent(new Student(studentBean.getId(), studentBean.getName(),
				studentBean.getCourse(), studentBean.getAddress()));

		request.setAttribute("msg",
				"Student added succesfully !" + studentBean.getName());
		return mapping.findForward(SUCCESS);
	}

	public ActionForward getStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LOGGER.info("getStudent() called..");
		StudentIdFormBean idBean = (StudentIdFormBean) form;
		Student student = dao.getStudent(idBean.getId());
		LOGGER.info("Student :" + student);
		if (student == null) {
			request.setAttribute("nostudent", "Can't find student with id "
					+ idBean.getId());
			request.setAttribute("show", Boolean.FALSE);
		} else {
			request.setAttribute("show", Boolean.TRUE);
			request.setAttribute("student", student);
		}

		return mapping.findForward(SUCCESS);
	}

	public ActionForward updateStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StudentFormBean studentBean = (StudentFormBean) form;
		LOGGER.info("Student :" + studentBean);
		dao.updateStudent(new Student(studentBean.getId(), studentBean
				.getName(), studentBean.getCourse(), studentBean.getAddress()));
		request.setAttribute("msg", "Student updated.." + studentBean.getName());
		return mapping.findForward(SUCCESS);
	}

	public ActionForward deleteStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StudentIdFormBean idFormBean = (StudentIdFormBean) form;
		dao.deleteStudent(idFormBean.getId());
		request.setAttribute("msg",
				"Student deleted with id " + idFormBean.getId());
		return mapping.findForward(SUCCESS);
	}

	public ActionForward showAllStudent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Student> students = dao.getStudents();
		request.setAttribute("students", students);
		request.setAttribute("showAll", Boolean.TRUE);
		return mapping.findForward(SUCCESS);
	}

	public ActionForward deleteSingleStudent(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		StudentIdFormBean idFormBean = (StudentIdFormBean) form;
		dao.deleteStudent(idFormBean.getId());
		request.setAttribute("msg",
				"Student deleted with id " + idFormBean.getId());
		return mapping.findForward(SUCCESS);
	}
}
