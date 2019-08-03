package com.eqts.whatsapp.receive;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"body",
"fromMe",
"self",
"isForwarded",
"author",
"time",
"chatId",
"messageNumber",
"type",
"senderName",
"chatName"
})
public class Message {

@JsonProperty("id")
private String id;
@JsonProperty("body")
private String body;
@JsonProperty("fromMe")
private Boolean fromMe;
@JsonProperty("self")
private Integer self;
@JsonProperty("isForwarded")
private Integer isForwarded;
@JsonProperty("author")
private String author;
@JsonProperty("time")
private Integer time;
@JsonProperty("chatId")
private String chatId;
@JsonProperty("messageNumber")
private Integer messageNumber;
@JsonProperty("type")
private String type;
@JsonProperty("senderName")
private String senderName;
@JsonProperty("chatName")
private String chatName;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("body")
public String getBody() {
return body;
}

@JsonProperty("body")
public void setBody(String body) {
this.body = body;
}

@JsonProperty("fromMe")
public Boolean getFromMe() {
return fromMe;
}

@JsonProperty("fromMe")
public void setFromMe(Boolean fromMe) {
this.fromMe = fromMe;
}

@JsonProperty("self")
public Integer getSelf() {
return self;
}

@JsonProperty("self")
public void setSelf(Integer self) {
this.self = self;
}

@JsonProperty("isForwarded")
public Integer getIsForwarded() {
return isForwarded;
}

@JsonProperty("isForwarded")
public void setIsForwarded(Integer isForwarded) {
this.isForwarded = isForwarded;
}

@JsonProperty("author")
public String getAuthor() {
return author;
}

@JsonProperty("author")
public void setAuthor(String author) {
this.author = author;
}

@JsonProperty("time")
public Integer getTime() {
return time;
}

@JsonProperty("time")
public void setTime(Integer time) {
this.time = time;
}

@JsonProperty("chatId")
public String getChatId() {
return chatId;
}

@JsonProperty("chatId")
public void setChatId(String chatId) {
this.chatId = chatId;
}

@JsonProperty("messageNumber")
public Integer getMessageNumber() {
return messageNumber;
}

@JsonProperty("messageNumber")
public void setMessageNumber(Integer messageNumber) {
this.messageNumber = messageNumber;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("senderName")
public String getSenderName() {
return senderName;
}

@JsonProperty("senderName")
public void setSenderName(String senderName) {
this.senderName = senderName;
}

@JsonProperty("chatName")
public String getChatName() {
return chatName;
}

@JsonProperty("chatName")
public void setChatName(String chatName) {
this.chatName = chatName;
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
return new ToStringBuilder(this).append("id", id).append("body", body).append("fromMe", fromMe).append("self", self).append("isForwarded", isForwarded).append("author", author).append("time", time).append("chatId", chatId).append("messageNumber", messageNumber).append("type", type).append("senderName", senderName).append("chatName", chatName).append("additionalProperties", additionalProperties).toString();
}

}