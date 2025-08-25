package practicalLab;

class patient
{
    String patientname;
    double height;
    double weight;

patient(String n,double h, double w)
{
    patientname=n;
    height=h;
    weight=w;
}
double computeBmi()
 {
    return (double)(weight/(height*height))                                                                                                                                                  ;
  }
}

public class PatientDemo {
    public static void main(String[] args) {
        patient p=new patient("abhi",10,10);
        System.out.println("the calculated bmi is : "+p.computeBmi());
    }
}
