package ua.lviv.lgs;

public interface Iterator {
	public boolean hasNext();

	public Object next();
}

class Collection {
	private static Object[] arr;

	Collection(Object[] arr) {
		Collection.arr = arr;

	}

	public class Forward implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			Object a = arr[count];
			if ((int) a % 2 == 1) {
				arr[count] = 0;

			}

			return arr[count++];
		}

	}

	public Forward createForward() {
		return new Forward();
	}

	public class Backward implements Iterator {

		int count = arr.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public Object next() {

			if (count % 2 != 1) {
				System.out.println(arr[count]);
			}
			return arr[count--];
		}
	}

	public Backward createBackward() {
		return new Backward();
	}

//	local
	public Iterator localForward() {
		class Forward implements Iterator {

			private int count = 0;

			@Override
			public boolean hasNext() {
				return count < arr.length;
			}

			@Override
			public Object next() {
				Object a = arr[count];

				if (count % 5 == 0) {
					if ((int) a % 2 == 0) {
						arr[count] = count - 100;
						System.out.println(arr[count]);
					}

				}

				return arr[count++];
			}

		}

		return new Forward();

	}

//	anon
	public Iterator anonymIterator() {
		return new Backward() {

			int count = arr.length - 1;

			@Override
			public boolean hasNext() {
				return count >= 0;
			}

			@Override
			public Object next() {

				Object a = arr[count];

				if (count % 3 == 0) {
					if ((int) a % 2 == 1) {
						System.out.println(arr[count]);
					}

				}

				return arr[count--];
			}
		};
	}

//	static
	public static class StaticForward implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			Object a = arr[count];
			if (count % 2 == 0) {
				if ((int) a % 2 == 0) {
					arr[count] = (int) a + 1;
					System.out.println(arr[count]);
				}

			}

			return arr[count++];
		}

	}

	public StaticForward staticForward() {
		return new StaticForward();
	}
}
