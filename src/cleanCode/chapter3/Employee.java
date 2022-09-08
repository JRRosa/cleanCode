package cleanCode.chapter3;

public abstract class Employee {
	
	public abstract boolean isPayDay();
	public abstract Money calculatePay();
	public abstract void deliverPay(Money pay);

	public static void main(String[] args) {
	}

}

public interface EmployeeFactory {
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

public class EmployeeFactoryImpl implements EmployeeFactory {

	@Override
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
		switch (r.type) {
		case COMMISSIONED:
			return new calculateComissionedPay(r);
			break;
		case HOURLY:
			return new calculateHourlyPay(r);
			break;
		case SALARIED:
			return new calculateSalariedPay(r);
			break;

		default:
			throw new InvalidEmployeeType(e.type);
		}
	}
	
}

