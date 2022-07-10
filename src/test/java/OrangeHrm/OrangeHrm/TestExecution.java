package OrangeHrm.OrangeHrm;

public class TestExecution extends LaunchHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   LaunchHrm hr=new LaunchHrm();
   hr.launch();
   hr.loginPage();
   //hr.userCreation();
   //hr.employeeCreation();
   hr.employeeDeletion();
   String st=hr.driver.getTitle();
   String s=hr.driver.getCurrentUrl();
   System.out.println(s);
   System.out.println(st);
   Thread.sleep(5000);
   hr.close();
	}

}
