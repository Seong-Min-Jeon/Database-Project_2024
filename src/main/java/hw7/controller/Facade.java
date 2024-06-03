package hw7.controller;

import hw7.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// Service들과 Controller를 연결하기 위해 Facade Pattern을 사용
@Service
@RequiredArgsConstructor
public class Facade{
    private final StudentService studentService;
    private final ProfessorService professorService;
    private final CourseService courseService;
    private final EnrollService enrollService;
    private final LectureService lectureService;
    private final AuthorService authorService;
    private final PublisherService publisherService;
    private final CustomerService customerService;
    private final WarehouseService warehouseService;
    private final BookService bookService;
    private final StocksService stocksService;
    private final WrittenByService writtenByService;
    private final PublishedByService publishedByService;

    public StudentService getStudentService(){
        return studentService;
    }

    public ProfessorService getProfessorService(){
        return professorService;
    }

    public CourseService getCourseService(){
        return courseService;
    }

    public EnrollService getEnrollService(){
        return enrollService;
    }

    public LectureService getLectureService(){
        return lectureService;
    }

    public AuthorService getAuthorService(){
        return authorService;
    }

    public PublisherService getPublisherService(){
        return publisherService;
    }

    public CustomerService getCustomerService(){
        return customerService;
    }

    public WarehouseService getWarehouseService(){
        return warehouseService;
    }

    public BookService getBookService(){
        return bookService;
    }

    public StocksService getStocksService(){
        return stocksService;
    }

    public WrittenByService getWrittenByService(){
        return writtenByService;
    }

    public PublishedByService getPublishedByService() {
        return publishedByService;
    }

}
