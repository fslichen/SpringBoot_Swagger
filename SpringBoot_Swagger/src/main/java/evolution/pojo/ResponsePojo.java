package evolution.pojo;

import io.swagger.annotations.ApiModelProperty;

// You can define examples above each field, and the examples will be shown in swagger.
public class ResponsePojo {
	@ApiModelProperty(position = 0, example="Hello World")
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
