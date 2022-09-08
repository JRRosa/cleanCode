package cleanCode.chapter3;

public class Payroll {
	
	public Money caluclatePay(Employee e) throws InvalidEmployeeType {
		
		switch (e.type) {
		case COMMISSIONED:
			return calculateComissionedPay(e);
			break;
		case HOURLY:
			return calculateHourlyPay(e);
			break;
		case SALARIED:
			return calculateSalariedPay(e);
			break;

		default:
			throw new InvalidEmployeeType(e.type);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
