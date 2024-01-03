package com.example.Users.model;

import com.example.Users.enums.UserRole;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Long id;
  private String userName;
  private String userEmail;
  private String password;
  private UserRole userRole;
  private LocalDateTime dateCreated;
}
