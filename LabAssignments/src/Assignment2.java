/**
 * From the provided url, your app should display command
 * Author: Rutuja Pise
 *
 */
public class Assignment2 {

	public static void main(String[] args) {
		String url1 = "www.codegram.in/admin/reports/daywiseuser.php";
		String url2 = "www.codegram.in/guest/registration.php";
		String url3 = "www.codegram.in/about.php";
		String command=null;
		
		command = showCommand(url1);
		System.out.println("Command is : "+command);
		
		command = showCommand(url2);
		System.out.println("Command is : "+command);
		
		command = showCommand(url3);
		System.out.println("Command is : "+command);

	}

	private static String showCommand(String url1) {
		// TODO Write your code here
		
		String cmd="";
		String[] strSplit = url1.split("/");
		for(int i=0; i<strSplit.length; i++) {
			if(strSplit[i].endsWith(".php")) {
				cmd = strSplit[i];
				}
			}
		String cmd1 = cmd.replace(".php","");
		return cmd1;
	}

}