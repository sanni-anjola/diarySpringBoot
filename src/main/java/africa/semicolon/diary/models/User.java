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
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    private List<Diary> aDiary = new ArrayList<>();
}
