package net.desertion.jedisjson.packet.conversation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.desertion.jedisjson.packet.JedisJSONPacket;

@AllArgsConstructor
@Getter
public class ConversationStartPacket extends JedisJSONPacket {

    private String clazz;
    private String conversationID;

}
