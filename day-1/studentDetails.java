public class studentDetails {
    public class displayStudentDetails{
        String Name;
        int roll;
        int marks;
        public void showdetails() {
            System.out.println("Roll is"+roll);
            System.out.println("Marks is"+marks);
            System.out.println("Name is"+Name);
        }
    }

    public static void main(String[] args) {
        displayStudentDetails s1= new displayStudentDetails
        s1.Name="Rahul S";
        s1.marks=90;
        s1.roll=15;


        s1.showdetails();
    }
}
