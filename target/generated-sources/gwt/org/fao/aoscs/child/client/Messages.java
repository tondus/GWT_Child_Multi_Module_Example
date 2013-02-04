package org.fao.aoscs.child.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	/Users/ton/Developer/FAO/workspace_demo/child/src/main/resources/org/fao/aoscs/child/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();
}
