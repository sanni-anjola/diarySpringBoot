package africa.semicolon.diary.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document
public class Diary {
    @Id
    private String id;
    private String title;
    private List<Entry> anEntry = new ArrayList<>();
}
