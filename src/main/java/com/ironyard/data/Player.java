package com.ironyard.data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by nathanielellsworth on 10/24/16.
 */
@Entity
public class Player {

    private String firstName;
    private String lastName;
    private int age;
    private String sex; //male or female
    private String experienceLevel; //amateur or professional
    private int divisionRank; // ranked #4 overall

    @OneToMany(cascade = CascadeType.ALL)
    private List<TennisMatch> TennisMatches;

    public List<TennisMatch> getTennisMatches() {
        return TennisMatches;
    }

    public void setTennisMatches(List<TennisMatch> TennisMatches) {
        this.TennisMatches = TennisMatches;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getSex() {return sex;}

    public void setSex(String sex) {this.sex = sex;}

    public String getExperienceLevel() {return experienceLevel;}

    public void setExperienceLevel(String experienceLevel) {this.experienceLevel = experienceLevel;}

    public int getDivisionRank() {return divisionRank;}

    public void setDivisionRank(int divisionRank) {this.divisionRank = divisionRank;}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}
}
