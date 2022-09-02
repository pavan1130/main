class Student {
    String name;
    int rollno;
    char Gender;
    static String institutename = "SSITS";

    public static void m1() {
        Student s1 = new Student();
        s1.name = "pavan";
        s1.rollno = 516;
        s1.Gender = 'm';
        System.out.println("student name" + s1.name + "student rollno " + s1.rollno + "student gender" + s1.Gender
                + "college name" + institutename);

    }

    public static void m2() {

        Student s2 = new Student();
        s2.name = "charan";
        s2.rollno = 523;
        s2.Gender = 'm';
        System.out.print("      " + s2.name + "          " + s2.rollno + "              " + s2.Gender + "        "
                + institutename);
    }

    public static void main(String[] args) {

        m1();
        m2();
    }
}
