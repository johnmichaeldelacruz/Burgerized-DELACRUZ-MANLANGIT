package burger.burgerized;// concrete builder

public class RegularBurgerCombo implements ComboBuilder {

	private Combos combos;
	
	public RegularBurgerCombo() {
		
		this.combos = new Combos();
		
	}
	
	public void buildSelectedBurger() {
		final String chosen = wendys.chosen;
		if(chosen == "wendys") {
			combos.setSelectedBurger("Deluxe Singles");
		}
		else if(chosen == "bk"){
			combos.setSelectedBurger("Whopper");
		}
	}

	public void buildSides1() {
		
		combos.setSides1("Fries");
		
	}

	public void buildSides2() {
		
		combos.setSides2("4 piece Nuggets");
		
	}

	public void buildSides3() {
		
		combos.setSides3("Soda");
		
	}

	public Combos getCombo() {
		
		return this.combos;
	}
	
	
	
}