package com.qsp.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{
     @Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
    	 String no1=req.getParameter("n1");
    	 int a=Integer.parseInt(no1);
    	 String no2=req.getParameter("n2");
    	 int b=Integer.parseInt(no2);
    	 int c;
 
    	 String op=req.getParameter("btn");
    	 
    	 PrintWriter out=resp.getWriter();
    	 if(op.equals("Add"))
    	 {
    		 c=a+b;
    		 out.print("<h1><body bgcolor='#90ee90'>Addition of two numbers is:"+c+"</body></h1>");
    	 }
    	 if (op.equals("Substract"))
    	 {
    		 c=a-b;
    		 out.print("<h1><body bgcolor='#90ee90'> Substraction of two nos is:"+c+"</body></h1>");
    	 }
    	 if(op.equals("Multiply"))
    	 {
    		 c=a*b;
    		 out.print("<h1><body bgcolor='#90ee90'>Multiplication of no is"+c+"</body></h1>");   	
   
         }
    	 if(op.equals("Divide"))
    	 {
    		 c=a/b;
    		 out.print("<h1><body bgcolor='#90ee90'>Division of two no is of no is"+c+"</body></h1>");   	
   
         }
     }
}
    	 

