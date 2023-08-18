package Solid_Principles.S;

public class SRP {
    //Single Responsibility Principle


}

class Email{
    public String sendEmail(){
        return "Solid_Principles.S.Email Sent";
    }
}

class Logger{
    public void log(String msg){

    }

    // this class is use only for logging

}
