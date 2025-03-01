package com.example;

import com.example.annotations.AutoDatabase;
import org.springframework.stereotype.Component;

import static com.example.enums.DatabaseType.MYSQL;

@Component
@AutoDatabase(type=MYSQL, url = "jdbc:mysql://localhost:3306/autodatabase", username = "root", password = "admin")
public class MYSQLDatabase {
}
