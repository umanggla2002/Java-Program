public class patient {
    String Name;
    double height;
    double width;
}
class pati{
public static void main(String []args) {
    patient obj=new patient();
   double vol;
   obj.Name="sachin";
    obj.height=30;
    obj.width=40;
     vol= obj.width/ obj.height*obj.height;
    System.out.println(obj.Name);
    System.out.println(vol+"in meter the ");
}
}
