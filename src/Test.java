import javax.security.auth.Subject;

public class Test {
    public static void main(String[] args) {
        System.out.println("hi there");
    }

    void print(String statement) {
        System.out.println(statement);
    }

    public int addNumbers(int a,int b){
        return a+b;
    }

    int findAverage(int total, int numberOfSubjects){
        return total/numberOfSubjects;
    }
}
