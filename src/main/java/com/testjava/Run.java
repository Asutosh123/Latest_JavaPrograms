package com.testjava;

class Run1En {
	
	 private  String name;
	 private int roolnumber;

	public void SetName(String n) {
		
		   name = n;
	}
    public  String GetName()
    {
    	  return name; 
    }
	public int getRoolnumber() {
		return roolnumber;
	}
	public void setRoolnumber(int rl) {
		roolnumber = rl;
	}
	
    
}
   public class Run{
	    public static void main(String[] args){
	    	Run1En es = new Run1En();
	    	 es.SetName("fdf asd");
	    	 es.setRoolnumber(563456456);
	    System.out.println("Name ageya" +es.GetName());
	    System.out.println("Roll no. ageya" +es.getRoolnumber());
	    }
	    }
   