package com.eqts.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"messages",
"lastMessageNumber"
})
public class Beans {

@JsonProperty("messages")
private List<Message> messages = null;
@JsonProperty("lastMessageNumber")
private Integer lastMessageNumber;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("messages")
public List<Message> getMessages() {
return messages;
}

@JsonProperty("messages")
public void setMessages(List<Message> messages) {
this.messages = messages;
}

@JsonProperty("lastMessageNumber")
public Integer getLastMessageNumber() {
return lastMessageNumber;
}

@JsonProperty("lastMessageNumber")
public void setLastMessageNumber(Integer lastMessageNumber) {
this.lastMessageNumber = lastMessageNumber;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
return new ToStringBuilder(this).append("messages", messages).append("lastMessageNumber", lastMessageNumber).append("additionalProperties", additionalProperties).toString();
}

}