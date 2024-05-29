package hw7.controller;

import hw7.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String home() {
        return "Hello World";
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

    @GetMapping(value = "/example")
    public ModelAndView ViewExample() {
        ModelAndView modelAndView =  new ModelAndView("example");

        modelAndView.addObject("name", "Example Name");

        return modelAndView;
    }

    @GetMapping(value = "/example2")
    public ModelAndView ViewExample2() {
        ModelAndView modelAndView =  new ModelAndView("example2");

        return modelAndView;
    }

//    @GetMapping(value = "/tests")
//    public ModelAndView ViewTests() {
//        ModelAndView modelAndView =  new ModelAndView("tests");
//        List<TestEntity> testEntities = testService.findAll();
//        modelAndView.addObject("tests", testEntities);
//        return modelAndView;
//    }
//
//    @GetMapping(value = "/test")
//    public ModelAndView SelectTest() {
//        ModelAndView modelAndView =  new ModelAndView("testById");
//        TestEntity testEntity = testService.findById(1);
//        modelAndView.addObject("test", testEntity);
//        return modelAndView;
//    }

}