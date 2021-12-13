public class Student3 {
    String name;
    int  age;
    String address;
    Student3(String a,int age,String address){
        name="unknown";
        age='0';
        address="not avalilable";
    }
    public void setInfo(String name,int age,String address,Student3 tarr[]){
        for (int i = 0; i < age; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How many creat the object ");
        int size=sc.nextInt();
        Student3 arr[]=new Student3[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" entre the name and age or address");
            arr[i]=new Student3(sc.nextLine(),sc.nextInt(),sc.nextLine());
        }
    }
}
