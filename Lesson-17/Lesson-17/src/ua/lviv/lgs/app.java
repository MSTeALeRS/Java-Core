package ua.lviv.lgs;

public class app {

	public static void main(String[] args) {

		Integer[] array = { 2, 3, 4, 5, 6, 4, 5, 5, 6, 9, 11, 11, 11, 13, 15 };

		Collection collection = new Collection(array);
		Iterator iteratorForward = collection.createForward();

		while (iteratorForward.hasNext()) {
			System.out.println(iteratorForward.next());
		}

		System.out.println();

		Iterator iterBackward = collection.createBackward();

		while (iterBackward.hasNext()) {
			iterBackward.next();

		}
		System.out.println();
		System.out.println("Anon");
		Integer[] array1 = { 2, 3, 4, 5, 6, 4, 5, 5, 6, 9, 11, 11, 11, 13, 15 };

		Collection collection1 = new Collection(array1);

		Iterator aninBackward = collection1.anonymIterator();
		while (aninBackward.hasNext()) {
			aninBackward.next();
		}
		System.out.println();
		System.out.println("Local");

		Integer[] array2 = { 2, 3, 4, 5, 6, 4, 5, 5, 6, 9, 11, 11, 11, 13, 15 };
		Collection collection2 = new Collection(array2);

		Iterator localForward = collection2.localForward();
		while (localForward.hasNext()) {
			localForward.next();
		}
		System.out.println();
		System.out.println("Static");

		Integer[] array3 = { 2, 3, 4, 5, 6, 4, 5, 5, 6, 9, 11, 11, 11, 13, 15 };
		Collection collection3 = new Collection(array3);

		Iterator staticForward = collection3.staticForward();
		while (staticForward.hasNext()) {
			staticForward.next();
		}

	}
}
