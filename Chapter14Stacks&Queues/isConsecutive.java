public static boolean isConsecutive(Stack<Integer> a) {

	

	

	Queue<Integer> storage = new LinkedList<Integer>();

	//Iterator<Integer> itr = storage.iterator();

	

	int count = 0;

	int curr = 0;

	int size = a.size();

	

	while(!a.isEmpty()) {

		

		int peek = a.pop();

		storage.add(peek);

		

	

		

		if(!a.isEmpty()) {

		if(a.peek()==peek -1) {

			count++;

		}

		}

	}

	

	while(!storage.isEmpty()) {

		a.push(storage.remove());

	}

	

	while(!a.isEmpty()) {

		storage.add(a.pop());

	}

	

	while(!storage.isEmpty()) {

		a.push(storage.remove());

	}




		if(count == size -1) {

			return true;

		}else {

			return false;

		}

		

		

	

}
