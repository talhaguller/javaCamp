package kodlamaio.northwind.core.utilities.result;

public class SuccessDateResult<T> extends DataResult<T> {

	public SuccessDateResult(T data, String message) {
		super(data, true, message);
	}

	public SuccessDateResult(T data) {
		super(data, true);
	}
	
	public SuccessDateResult(String message) {
		super(null, false, message);
	}

	public SuccessDateResult() {
		super(null, true);
	}

}
