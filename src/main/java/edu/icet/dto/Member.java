package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private Integer id;
    private String name;
    private String email;
    private String phoneN;
    private String address;
    private LocalDate joinDate;
}
