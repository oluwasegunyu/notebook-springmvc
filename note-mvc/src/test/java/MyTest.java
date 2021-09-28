import com.yxy.notebookspringmvc.model.Note;
import com.yxy.notebookspringmvc.service.NoteService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        NoteService noteService = (NoteService) context.getBean("noteService");
        for(Note note:noteService.getNoteList()){
            System.out.println(note);
        }
    }
}
