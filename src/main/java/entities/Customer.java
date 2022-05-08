package entities;

public class Customer {

	private boolean isRegular;

	public void setCustomerStatus(String status) {
		if (status.equals("Regular")) {
			this.isRegular = true;
		} else if (status.equals("Reward")) {
			this.isRegular = false;
		}
	}

	public boolean isRegular() {
		return isRegular;
	}

}