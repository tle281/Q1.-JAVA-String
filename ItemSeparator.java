
public class ItemSeparator {
	private String rawInput;
	private String name;
	private Double price;
	private Integer quantity;
	
	public ItemSeparator(String rawInput) {
		this.rawInput = rawInput;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void filterRawInput() {
		String[] splitResults = rawInput.split("\\$\\$\\#\\#");
		this.setName(splitResults[0]);
		this.setPrice(Double.valueOf(splitResults[1]));
		this.setQuantity(Integer.valueOf(splitResults[2]));
	}	
	
}
