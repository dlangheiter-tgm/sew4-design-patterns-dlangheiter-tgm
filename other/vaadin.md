# Vaadin
Vaadin is based on Views.

## @Route
To specify that a specific view is accessible on a specific route you add `@Route` to a Class.  
How to use: `@Route(route)`. If route is left empty it uses `""`.

## Basic View
```java
@Route
public class MainView extends VerticalLayout {

	private final CustomerRepository repo;
	final Grid<Customer> grid;

	public MainView(CustomerRepository repo) {
		this.repo = repo;
		this.grid = new Grid<>(Customer.class);
		add(grid);
		listCustomers();
	}

	private void listCustomers() {
		grid.setItems(repo.findAll());
	}

}
```