import java.util.*;

class  stream_reduce{
	
	public static void main(String[] args) {
		int [] array = {5,6,7,8,6};

		int arr = Arrays.stream(array).reduce(0,(a,b) -> a + b);

		System.out.println(arr);

	}


}