
public class city_hosp implements hosp {

	public static void main(String[] args) {
        city_hosp chp=new city_hosp();
		hosp hp=new city_hosp();
		hp.operate();
		hp.doScan();
		chp.phone_consultation();
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("city hosp operating");
	}

	@Override
	public void doScan() {
		// TODO Auto-generated method stub
		System.out.println("city hosp scanning");

	}
	public void phone_consultation()
	{
		System.out.println("city hosp phone consultation");

	}

}
