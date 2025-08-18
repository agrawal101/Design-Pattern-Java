package Behavioral.mementoDesignPattern;

import javax.swing.*;
import java.util.List;

public class ResumeEditor {

    private String name;
    private String education;
    private String experience;
    private List<String> skill;


    public void setName(String name) {
        this.name = name;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }

    public void printResume()
    {
        System.out.println("x:------Resume------");
        System.out.println("Name : "+name);
        System.out.println("Education : "+education);
        System.out.println("Experience : "+experience);
        System.out.println("Skills : "+skill);
        System.out.println("x--------------------");
    }

    public Momento save(){
        return new Momento(name,education,experience,List.copyOf(skill));
    }

    public void restore(Momento momento)
    {
        this.name = momento.getName();
        this.experience = momento.getExperience();
        this.education = momento.getEducation();
        this.skill = momento.getSkill();
    }

    public class Momento
    {
        private String name;
        private String education;
        private String experience;
        private List<String> skill;


        private Momento(String name, String education, String experience, List<String> skill) {
            this.name = name;
            this.education = education;
            this.experience = experience;
            this.skill = skill;
        }

        public String getName() {
            return name;
        }

        public String getEducation() {
            return education;
        }

        public String getExperience() {
            return experience;
        }

        public List<String> getSkill() {
            return skill;
        }
    }
}
