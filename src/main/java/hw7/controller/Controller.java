package hw7.controller;

import hw7.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class Controller {
    private final Facade facade;

    public Controller(Facade facade) {this.facade = facade;}

    @GetMapping(value = "/")
    public RedirectView redirectByRoot() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8090/home");
        return redirectView;
    }

    @GetMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView modelAndView =  new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping(value = "/university/a")
    public ModelAndView UnivA() {
        ModelAndView modelAndView =  new ModelAndView("univA");
        List<StudentEntity> studentList = facade.getStudentService().findAllStudents();
        List<ProfessorEntity> professorList = facade.getProfessorService().findAllProfessors();
        List<CourseEntity> courseList = facade.getCourseService().findAllCourses();
        List<EnrollEntity> enrollList = facade.getEnrollService().findAllEnrolls();
        List<LectureEntity> lectureList = facade.getLectureService().findAllLectures();

        modelAndView.addObject("students", studentList);
        modelAndView.addObject("professors", professorList);
        modelAndView.addObject("courses", courseList);
        modelAndView.addObject("enrolls", enrollList);
        modelAndView.addObject("lectures", lectureList);

        return modelAndView;
    }

    @GetMapping(value = "/university/b")
    public ModelAndView UnivB() {
        ModelAndView modelAndView =  new ModelAndView("univB");
        List<StudentEntity> studentList = facade.getStudentService().findAllStudents();
        modelAndView.addObject("students", studentList);
        return modelAndView;
    }

    @GetMapping(value = "/university/b/1")
    public ModelAndView UnivB1(String name) {
        ModelAndView modelAndView =  new ModelAndView("univB1");
        List<UnivB> list = facade.getStudentService().retrieveUnivB(name);
        modelAndView.addObject("univB", list);
        return modelAndView;
    }

    @GetMapping(value = "/university/c")
    public ModelAndView UnivC() {
        ModelAndView modelAndView =  new ModelAndView("univC");
        List<UnivC> list = facade.getStudentService().findWrongGradeStudents();
        modelAndView.addObject("univC", list);
        return modelAndView;
    }

    @PostMapping(value = "/university/c/1")
    public ModelAndView UnivC1() {
        ModelAndView modelAndView =  new ModelAndView("univC1");
        facade.getEnrollService().updateWrongGrade();
        List<UnivC> list = facade.getStudentService().findAllGradeAndStudents();
        modelAndView.addObject("univC", list);
        return modelAndView;
    }

    @GetMapping(value = "/university/d")
    public ModelAndView UnivD() {
        ModelAndView modelAndView =  new ModelAndView("univD");
        List<UnivD> list1 = facade.getStudentService().findHighGradeStudent();
        List<UnivD> list2 = facade.getStudentService().findLowGradeStudent();
        modelAndView.addObject("univD1", list1);
        modelAndView.addObject("univD2", list2);
        return modelAndView;
    }

    @GetMapping(value = "/university/e")
    public ModelAndView UnivE() {
        ModelAndView modelAndView =  new ModelAndView("univE");
        List<UnivE> list = facade.getStudentService().findTotalCreditsAndAvgExams();
        modelAndView.addObject("univE", list);
        return modelAndView;
    }

    @GetMapping(value = "/university/f")
    public ModelAndView UnivF() {
        ModelAndView modelAndView =  new ModelAndView("univF");
        List<UnivF> list = facade.getCourseService().findAvgExamsAndCountStudents();
        modelAndView.addObject("univF", list);
        return modelAndView;
    }

    @GetMapping(value = "/university/g")
    public ModelAndView UnivG() {
        ModelAndView modelAndView =  new ModelAndView("univG");
        List<UnivG> list = facade.getProfessorService().findDeptAndCountLecture();
        modelAndView.addObject("univG", list);
        return modelAndView;
    }

    @GetMapping(value = "/university/h")
    public ModelAndView UnivH() {
        ModelAndView modelAndView =  new ModelAndView("univH");
        List<UnivH1> list1 = facade.getStudentService().findCountStudentsBasedDept();
        List<UnivH2> list2 = facade.getStudentService().findCountStudentsBasedYear();
        modelAndView.addObject("univH1", list1);
        modelAndView.addObject("univH2", list2);
        return modelAndView;
    }

    @GetMapping(value = "/bookstore/a")
    public ModelAndView BookA() {
        ModelAndView modelAndView =  new ModelAndView("bookA");
        List<AuthorEntity> list = facade.getAuthorService().findAllAuthors();
        modelAndView.addObject("bookA", list);
        return modelAndView;
    }

    @GetMapping(value = "/bookstore/a/1")
    public ModelAndView BookA1(String name, String address) {
        ModelAndView modelAndView =  new ModelAndView("bookA1");
        List<BookA> list = facade.getAuthorService().retrieveBookA(name, address);
        modelAndView.addObject("bookA", list);
        return modelAndView;
    }

}