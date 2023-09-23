import java.util.*;

class  stream{
	
	public static void main(String[] args) {
		int [] array = {23,4,3,5,7};

		int[] arr = Arrays.stream(array).map(e -> myfunc(e)).toArray();

		System.out.println(Arrays.toString(arr));

	}

static int myfunc(int e){
	

	return e * e;
}

}