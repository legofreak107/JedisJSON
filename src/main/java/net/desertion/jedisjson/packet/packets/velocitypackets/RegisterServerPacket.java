package net.desertion.jedisjson.packet.packets.velocitypackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.desertion.jedisjson.packet.JedisJSONPacket;
import net.desertion.jedisjson.packet.packets.responsepackets.ResponsePacket;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterServerPacket extends ResponsePacket {

    private String ip;
    private int port;
    private String name;

}
