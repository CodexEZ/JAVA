class Person{
    String mName;
    String mBirthDate;
    String mSex;
    void getName(String Name){
        this.mName=Name;
    }
    void getBirthDate(String BirthDate){
        this.mBirthDate=BirhtDate; 
    }
    void getSex(String Sex){
        this.mSex=Sex;
    }
}
class Student extends Person{
    private String address;
    private String department;
    void getAddress(String address){
        this.address=address
    }
    void getDepartment(String department){
        this.department=department;
    }
}

class Teacher extends Person{
    private int rank;
    private String department;
    private String courseinfo;
    void getRank(int rank){
        this.rank=rank;
    }
    void getDepartment(String department){
        this.department=department;

    }
    void getCourseInfo(String courserinfo){
        this.courseinfo=courseinfo;
    }
}

class GradTeachingFellow extends  Student, Person {
    private String supervisor;
    void getSupervisor(String supervisor){
        this.supervisor=supervisor
    }
}

public class inheritance {
    
}
