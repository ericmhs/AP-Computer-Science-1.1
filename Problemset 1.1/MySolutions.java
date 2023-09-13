
/**
 * Write a description of class MySolutions here.
 *
 * @author Eric Shen
 * @version Sep 12
 */
public class MySolutions
{
     public void celsuisToFahrenheit() {
        double Celsuis = 30;
        double Fahrenheit;
        Fahrenheit = Celsuis * 9/5 + 32;
        System.out.println(Celsuis + "°C" + " = " + Fahrenheit + "°F");
    }
    
    public void elapsedTime() {
        int h = 12;
        int m = 0;
        int s = 0;
        int SecondPast;
        int SecondLeft;
        double Percentage;
        double TotalSeconds = 24 * 3600;
        SecondPast = h * 3600 + m * 60 + s;
        SecondLeft = (24 * 3600) - SecondPast;
        Percentage = SecondPast / TotalSeconds * 100;
        
        System.out.print("The current time is " + h + ":" + m + ":" + s + ".");
        System.out.println("It has been " + SecondPast + " seconds since the day began.");
        System.out.println("There are " + SecondLeft + " seconds left in the day.");
        System.out.print("The day is " + Percentage + "% done.");
    }
    
    public void secondsToHMS() {
        int seconds = 5000;
        int hr;
        int min;
        int sec;
        hr = seconds / 3600;
        min = (seconds - hr * 3600) / 60;
        sec = seconds % 60;
        System.out.print(seconds + " seconds = " + hr + "hours, " + min + " minutes, and " + sec + " seconds.");
    }
}

