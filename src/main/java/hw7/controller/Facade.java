package hw7.controller;

import hw7.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Facade{
    private final StudentService studentService;
    private final ProfessorService professorService;
    private final CourseService courseService;
    private final EnrollService enrollService;
    private final LectureService lectureService;
    private final AuthorService authorService;

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

}
