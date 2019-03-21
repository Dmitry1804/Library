import Models.Book;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class TestLibrary {
   @Test
    public void testBook() {
        RestTemplate restTemplate = new RestTemplate();
        Book book = restTemplate.getForObject("/url...", Book.class);

    }
}
