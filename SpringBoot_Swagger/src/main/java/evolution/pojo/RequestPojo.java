package evolution.pojo;

import io.swagger.annotations.ApiModelProperty;

// You can define examples above each field, and the examples will be shown in swagger.
public class RequestPojo {
	@ApiModelProperty(position = 0, example="Chen")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
