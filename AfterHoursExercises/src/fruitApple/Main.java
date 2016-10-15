package fruitApple;

public class Main {

	public static void main(String[] args) {

			Apple redApple = new Apple();
			redApple.setProperties("Tree Fruit");
			redApple.setColor("Red");
			redApple.setVariety("Red Delicious");
			redApple.setWeight(8);
			System.out.println("An apple is a " + redApple.getProperties() + ". Bet you can't guess it's color...that's right, it's " + redApple.getColor() + ". They call it " + redApple.getVariety() + ". They weigh about " + redApple.getWeight() + " ounces each.");

			Pear yellowPear = new Pear();
			yellowPear.setProperties("Tree Fruit");
			yellowPear.setColor("Yellow");
			yellowPear.setVariety("Pears in a can");
			yellowPear.setWeight(4);
			System.out.println("An pear is a " + yellowPear.getProperties() + ". Bet you can't guess it's color...that's right, it's " + yellowPear.getColor() + ". They call it " + yellowPear.getVariety() + ". They weigh about " + yellowPear.getWeight() + " ounces each.");

	}
}
