package coreHomework14;

import java.lang.reflect.Array;

public class Collection {

	Object[] arr = new Array[20];

	public Collection(Object[] arr) {

		this.arr = arr;
	}

	public class One implements Iterator {

		@Override
		public void hasNext() {

			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					arr[i] = 0;
					System.out.print(arr[i] + " ");
					i++;
				} else {
					System.out.println(arr[i] + " ");
				}

			}
		}

		@Override
		public void next() {
			for (int i = 0; i < arr.length; i = i + 2) {
				System.out.println(arr[i]);
			}

		}

	}

	public class Two implements Iterator {

		@Override
		public void hasNext() {

		}

		@Override
		public void next() {

		}

	}

	class LocalClass {

		void three() {

		}
	}

	static class StaticClass {

	}
}
