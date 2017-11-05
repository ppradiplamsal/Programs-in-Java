/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamsa
 */

package homework6;

import java.util.Scanner;
import java.text.DateFormatSymbols;

public class Test {
    
    public static String getMonth(int month){
        return new DateFormatSymbols().getMonths()[month-1];
    }
    
    public static void main(String args[]) throws MonthException, DayException, YearException {
       
        while (true) {
        
        String msg = null;
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the date in mm/dd/yyyy format: ");
        String input_date = user_input.nextLine();
        
        int month = Integer.parseInt(input_date.substring(0,2));
        int day = Integer.parseInt(input_date.substring(3,5));
        int year = Integer.parseInt(input_date.substring(6));
        
        try {
            if (!(month>0 && month<13)) {
                msg = "month";
                throw new MonthException("Invalid " + msg);
            }
            
            if (!(day>0 && day<32)) {
                msg = "day";
                throw new DayException("Invalid " + msg);
            }
            
            if (!(year>999 && year<3001)) {
                msg = "year";
                throw new YearException("Invalid " + msg);
            }
            
            System.out.println("The date is: " + getMonth(month) + " " + day + ", " + year);
            
            break;
            
        }

        
        catch (DayException | MonthException | YearException e) {
            System.out.println(e + ".\nPlease re-enter the " + msg + " properly.");
        }
        }
        
    }
        