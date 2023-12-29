package src.com.DAO.POLO;

public class Students {

    private String Name;
    private String sex;
    private Integer Age;
    private Integer Studentid;
    private String major;//专业
    private Integer score;

    public Students() {
    }

    public Students(String name, String sex, Integer age, Integer studentid, String major, Integer score) {
        Name = name;
        this.sex = sex;
        Age = age;
        Studentid = studentid;
        this.major = major;
        this.score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getStudentid() {
        return Studentid;
    }

    public void setStudentid(Integer studentid) {
        Studentid = studentid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", sex='" + sex + '\'' +
                ", Age=" + Age +
                ", Studentid=" + Studentid +
                ", major='" + major + '\'' +
                ", score=" + score +
                '}';
    }
}
