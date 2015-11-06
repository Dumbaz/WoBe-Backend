@Data
@Entity
public class Employee {
	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;

	private Employee() {}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}