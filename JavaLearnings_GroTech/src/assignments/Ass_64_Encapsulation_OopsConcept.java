package assignments;
class AmazonLogin{
	private int age = 30;
	private String un="studentinfo@gmail.com";
	private String pwd="suriya123@!#$";
	private int otp=7869;
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}
public class Ass_64_Encapsulation_OopsConcept {

	public static void main(String[] args) {
		AmazonLogin a1 = new AmazonLogin();
		a1.setAge(28);
		System.out.println(a1.getAge());
		a1.setUn("hani@gmail.com");
		a1.setPwd("Hani6743@#%^^");
		a1.setOtp(8956);
		System.out.println(a1.getUn());
		System.out.println(a1.getPwd());
		System.out.println(a1.getOtp());

	}

}
