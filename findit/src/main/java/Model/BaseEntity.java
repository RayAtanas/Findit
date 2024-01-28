package Model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.UUID;

public class BaseEntity {

    @Id
    String id = UUID.randomUUID().toString();;
    LocalDate Created_at;
    LocalDate Updated_at;



}
