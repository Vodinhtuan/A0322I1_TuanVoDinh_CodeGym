package com.example.casestudy_ss1.model;

import com.example.casestudy_ss1.model.person.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer educationDegreeId;

    private String educationDegreeName;

    public EducationDegree() {
    }
    @OneToMany(mappedBy = "education_degree", cascade = CascadeType.REMOVE)
    private Set<Employee> employees;

    public EducationDegree(Integer education_Degree_Id, String education_Degree_Name) {
        this.educationDegreeId = education_Degree_Id;
        this.educationDegreeName = education_Degree_Name;
    }

    public Integer getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Integer education_Degree_Id) {
        this.educationDegreeId = education_Degree_Id;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String education_Degree_Name) {
        this.educationDegreeName = education_Degree_Name;
    }
}
