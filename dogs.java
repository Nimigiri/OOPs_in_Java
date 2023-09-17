class Dogs{
	String color;
	int age;
void initObj(String c, int a){
 color=c;
age=a;}
void display()
{System.out.println(color+" "+ age);
}
	    
	public static void main(String args[])
        {
	 Dogs tuffy= new Dogs();
	 tuffy.initObj("Black", 10);
	 tuffy.display();
	}

}