package org.wso2.identity.integration.test.rest.api.user.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

public class ListObject {

    private String display;
    private String value;
    private String $ref;

    /**
     *
     **/
    public ListObject display(String display) {

        this.display = display;
        return this;
    }

    @ApiModelProperty(example = "abc")
    @JsonProperty("display")
    @Valid
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     *
     **/
    public ListObject value(String value) {

        this.value = value;
        return this;
    }

    @ApiModelProperty(example = "csdhfkjcdoqfo[adpscbdsjk]")
    @JsonProperty("value")
    @Valid
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     **/
    public ListObject $ref(String $ref) {

        this.$ref = $ref;
        return this;
    }

    @ApiModelProperty(example = "false")
    @JsonProperty("$ref")
    @Valid
    public String getRef() {
        return $ref;
    }

    public void setRef(String $ref) {
        this.$ref = $ref;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListObject listObj = (ListObject) o;
        return Objects.equals(this.display, listObj.display) &&
                Objects.equals(this.value, listObj.value) &&
                Objects.equals(this.$ref, listObj.$ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(display, value, $ref);
    }

    @Override
    public String toString() {

        return "class ListObject {\n" +
                "    display: " + toIndentedString(display) + "\n" +
                "    value: " + toIndentedString(value) + "\n" +
                "    $ref: " + toIndentedString($ref) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString();
    }
}
