/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author PERSONAL
 */
public class EXCEPTION4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     try  
        {  
        int data=50/0; //may throw exception   
        }  
            // handling the exception by using Exception class      
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code"); 
    }
    
}
