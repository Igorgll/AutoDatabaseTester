package com.example;

import com.example.annotations.AutoDatabase;
import org.springframework.stereotype.Component;
import static com.example.enums.DatabaseType.H2;
import static com.example.enums.DatabaseType.MYSQL;

@Component
//@AutoDatabase(type=MYSQL, url = "jdbc:mysql://localhost:3306/autodatabase", username = "root", password = "admin")
@AutoDatabase(type=H2, url = "jdbc:h2:~/test", username = "sa", password = "")
public class DatabaseTest {
}
