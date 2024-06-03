package hw7.controller;

import hw7.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.regex.Pattern;

@RestController
public class Controller {
    private final Facade facade;

    public Controller(Facade facade) {this.facade = facade;}

    // 루트로 접속하였을 때 /home으로 리다이렉트
    @GetMapping(value = "/")
    public RedirectView redirectByRoot() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8090/home");
        return redirectView;
    }

    // home으로 접속하였을 때 home 페이지를 보여줌
    @GetMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView modelAndView =  new ModelAndView("home");
        return modelAndView;
    }

    // university/a로 접속하였을 때, 5가지의 테이블 정보를 넘겨줌
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

    // university/b로 접속하였을 때, 학생 테이블의 정보를 넘겨줌
    @GetMapping(value = "/university/b")
    public ModelAndView UnivB() {
        ModelAndView modelAndView =  new ModelAndView("univB");
        List<StudentEntity> studentList = facade.getStudentService().findAllStudents();
        modelAndView.addObject("students", studentList);
        return modelAndView;
    }

    // university/b/1로 접속하였을 때, 선택한 sno에 따른 정보를 넘겨줌
    @GetMapping(value = "/university/b/1")
    public ModelAndView UnivB1(String sno) {
        ModelAndView modelAndView =  new ModelAndView("univB1");
        List<UnivB> list = facade.getStudentService().retrieveUnivB(sno);
        modelAndView.addObject("univB", list);
        return modelAndView;
    }

    // university/c로 접속하였을 때, 시험 점수에 대한 학점이 잘못 기재되어 있는 학생 목록을 넘겨줌
    @GetMapping(value = "/university/c")
    public ModelAndView UnivC() {
        ModelAndView modelAndView =  new ModelAndView("univC");
        List<UnivC> list = facade.getStudentService().findWrongGradeStudents();
        modelAndView.addObject("univC", list);
        return modelAndView;
    }

    // university/c/1로 Post 요청이 왔을 때, 학점이 잘못 기재되어 있는 학생들의 정보를 수정하고, 전체 학생의 학점 데이터를 넘겨줌
    @PostMapping(value = "/university/c/1")
    public ModelAndView UnivC1() {
        ModelAndView modelAndView =  new ModelAndView("univC1");
        facade.getEnrollService().updateWrongGrade();
        List<UnivC> list = facade.getStudentService().findAllGradeAndStudents();
        modelAndView.addObject("univC", list);
        return modelAndView;
    }

    // university/d로 접속하였을 때, 과목별 최고 점수를 받은 학생의 데이터와 최소 점수를 받은 학생의 데이터를 넘겨줌
    @GetMapping(value = "/university/d")
    public ModelAndView UnivD() {
        ModelAndView modelAndView =  new ModelAndView("univD");
        List<UnivD> list1 = facade.getStudentService().findHighGradeStudent();
        List<UnivD> list2 = facade.getStudentService().findLowGradeStudent();
        modelAndView.addObject("univD1", list1);
        modelAndView.addObject("univD2", list2);
        return modelAndView;
    }

    // university/e로 접속하였을 때, 학생별 수강한 교과목의 총학점과 시험점수의 평균 데이터를 넘겨줌
    @GetMapping(value = "/university/e")
    public ModelAndView UnivE() {
        ModelAndView modelAndView =  new ModelAndView("univE");
        List<UnivE> list = facade.getStudentService().findTotalCreditsAndAvgExams();
        modelAndView.addObject("univE", list);
        return modelAndView;
    }

    // university/f로 접속하였을 때, 과목별 전체 평균 점수와 학점별 학생 수 데이터를 넘겨줌
    @GetMapping(value = "/university/f")
    public ModelAndView UnivF() {
        ModelAndView modelAndView =  new ModelAndView("univF");
        List<UnivF> list1 = facade.getCourseService().findAvgExams();
        modelAndView.addObject("univF1", list1);
        List<UnivF> list2 = facade.getCourseService().findCountStudents();
        modelAndView.addObject("univF2", list2);
        return modelAndView;
    }

    // university/g로 접속하였을 때, 학과별로 개설된 강좌의 수 데이터를 넘겨줌
    @GetMapping(value = "/university/g")
    public ModelAndView UnivG() {
        ModelAndView modelAndView =  new ModelAndView("univG");
        List<UnivG> list = facade.getProfessorService().findDeptAndCountLecture();
        modelAndView.addObject("univG", list);
        return modelAndView;
    }

    // university/h로 접속하였을 때, 학과별, 학년별 총 학생 수 데이터를 넘겨줌
    @GetMapping(value = "/university/h")
    public ModelAndView UnivH() {
        ModelAndView modelAndView =  new ModelAndView("univH");
        List<UnivH1> list1 = facade.getStudentService().findCountStudentsBasedDept();
        List<UnivH2> list2 = facade.getStudentService().findCountStudentsBasedYear();
        modelAndView.addObject("univH1", list1);
        modelAndView.addObject("univH2", list2);
        return modelAndView;
    }

    // bookstore/a로 접속하였을 때, 모든 작가의 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/a")
    public ModelAndView BookA() {
        ModelAndView modelAndView =  new ModelAndView("bookA");
        List<AuthorEntity> list = facade.getAuthorService().findAllAuthors();
        modelAndView.addObject("bookA", list);
        return modelAndView;
    }

    // bookstore/a/1로 접속하였을 때, 선택한 name과 address를 가지고 해당 작가가 작성한 도서의 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/a/1")
    public ModelAndView BookA1(String name, String address) {
        ModelAndView modelAndView =  new ModelAndView("bookA1");
        List<BookA> list = facade.getAuthorService().retrieveBookA(name, address);
        modelAndView.addObject("bookA", list);
        return modelAndView;
    }

    // bookstore/b로 접속하였을 때, 모든 출판사의 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/b")
    public ModelAndView BookB() {
        ModelAndView modelAndView =  new ModelAndView("bookB");
        List<PublisherEntity> list = facade.getPublisherService().findAllPublishers();
        modelAndView.addObject("bookB", list);
        return modelAndView;
    }

    // bookstore/b/1로 접속하였을 때, 선택한 name을 가지고 해당 출판사에서 출판된 도서의 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/b/1")
    public ModelAndView BookB1(String name) {
        ModelAndView modelAndView =  new ModelAndView("bookB1");
        List<BookB> list = facade.getPublisherService().retrieveBookB(name);
        modelAndView.addObject("bookB", list);
        return modelAndView;
    }

    // bookstore/c로 접속하였을 때, 모든 고객의 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/c")
    public ModelAndView BookC() {
        ModelAndView modelAndView =  new ModelAndView("bookC");
        List<CustomerEntity> list = facade.getCustomerService().findAllCustomers();
        modelAndView.addObject("bookC", list);
        return modelAndView;
    }

    // bookstore/c/1로 접속하였을 때, 선택한 email을 가지고 고객이 주문한 도서와 해당 도서의 출판사, 작가 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/c/1")
    public ModelAndView BookC1(String email) {
        ModelAndView modelAndView =  new ModelAndView("bookC1");
        List<BookC> list = facade.getCustomerService().retrieveBookC(email);
        modelAndView.addObject("bookC", list);
        return modelAndView;
    }

    // bookstore/d로 접속하였을 때, 작가, 출판사, 창고의 정보를 넘겨줌
    @GetMapping(value = "/bookstore/d")
    public ModelAndView BookD() {
        ModelAndView modelAndView =  new ModelAndView("bookD");
        List<AuthorEntity> list1 = facade.getAuthorService().findAllAuthors();
        modelAndView.addObject("bookD1", list1);
        List<PublisherEntity> list2 = facade.getPublisherService().findAllPublishers();
        modelAndView.addObject("bookD2", list2);
        List<WarehouseEntity> list3 = facade.getWarehouseService().findALlWarehouse();
        modelAndView.addObject("bookD3", list3);
        return modelAndView;
    }

    // university/d/1로 Post 요청이 왔을 때, 입력된 데이터를 가지고
    // book, stocks, written_by, published_by 테이블을 수정하고 수정된 데이터를 넘겨줌
    @PostMapping(value = "/bookstore/d/1")
    public ModelAndView BookD1(int ISBN, String title, int year, int price,
                               String authorData, String publisherData, String[] codes, String[] nums) {
        boolean lock = false;

        for(BookEntity book : facade.getBookService().findAllBooks()) {
            if(book.getISBN() == ISBN) {
                lock = true;
            }
        }

        if(lock) {
            ModelAndView modelAndView =  new ModelAndView("bookD2");
            return modelAndView;
        }

        facade.getBookService().insertBookD(ISBN, title, year, price);
        for(int i = 0 ; i<(codes.length) ; i++) {
            if(!codes[i].equals("") && !nums[i].equals("")) {
                facade.getStocksService().insertStocksD(ISBN, codes[i], Integer.parseInt(nums[i]));
            }
        }
        String[] authorDataArray = authorData.split(Pattern.quote("^//^"));
        facade.getWrittenByService().insertWrittenByD(authorDataArray[0], authorDataArray[1], ISBN);
        facade.getPublishedByService().insertPublishedByD(publisherData, ISBN);

        ModelAndView modelAndView =  new ModelAndView("bookD1");
        List<BookEntity> list1 = facade.getBookService().findAllBooks();
        modelAndView.addObject("bookD1", list1);
        List<StocksEntity> list2 = facade.getStocksService().findAllStocks();
        modelAndView.addObject("bookD2", list2);
        List<WrittenByEntity> list3 = facade.getWrittenByService().findAllWrittenBy();
        modelAndView.addObject("bookD3", list3);
        List<PublishedByEntity> list4 = facade.getPublishedByService().findAllPublishedBy();
        modelAndView.addObject("bookD4", list4);
        return modelAndView;
    }

    // bookstore/e로 접속하였을 때, 도서의 평균 가격 및 년도별 평균 가격 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/e")
    public ModelAndView BookE() {
        ModelAndView modelAndView =  new ModelAndView("bookE");
        List<BookE> list1 = facade.getBookService().findAvgPrice();
        modelAndView.addObject("bookE1", list1);
        List<BookE> list2 = facade.getBookService().findAvgPriceBasedYear();
        modelAndView.addObject("bookE2", list2);
        return modelAndView;
    }

    // bookstore/f로 접속하였을 때, 작가별 도서의 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/f")
    public ModelAndView BookF() {
        ModelAndView modelAndView =  new ModelAndView("bookF");
        List<BookF> list = facade.getAuthorService().findBooks();
        modelAndView.addObject("bookF", list);
        return modelAndView;
    }

    // bookstore/g로 접속하였을 때, 할인을 적용할 부수와 할인률을 정할 수 있는 페이지를 출력함
    @GetMapping(value = "/bookstore/g")
    public ModelAndView BookG() {
        ModelAndView modelAndView =  new ModelAndView("bookG");
        return modelAndView;
    }
    
    // bookstore/g로 접속하였을 때, 총 재고량이 num부 이상인 책의 데이터를 넘겨줌
    @GetMapping(value = "/bookstore/g/1")
    public ModelAndView BookG1(int num, int percent) {
        ModelAndView modelAndView =  new ModelAndView("bookG1");
        List<BookG> list = facade.getBookService().findBookStocks(num);
        modelAndView.addObject("bookG", list);
        modelAndView.addObject("num", num);
        modelAndView.addObject("percent", percent);
        return modelAndView;
    }

    // university/g/1로 Post 요청이 왔을 때, 총 재고량이 m부 이상인 책의 가격을 n% 낮추고, 할인한 책의 데이터를 넘겨줌
    @PostMapping(value = "/bookstore/g/2")
    public ModelAndView BookG2(int num, int percent) {
        facade.getBookService().discountBooks(num, percent);
        ModelAndView modelAndView =  new ModelAndView("bookG2");
        List<BookG> list = facade.getBookService().findBookStocks(num);
        modelAndView.addObject("bookG", list);
        return modelAndView;
    }

}