package africa.semicolon.diary.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Document
public class Entry {
    @Id
    private String id;
    private String title;
    private String body;
    private LocalDate dateOfEntry = LocalDate.now();
}
