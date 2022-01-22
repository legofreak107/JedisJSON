package net.desertion.jedisjson.packet.packets.velocitypackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.desertion.jedisjson.packet.packets.responsepackets.ResponsePacket;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UnregisterServerPacket extends ResponsePacket {

    private String ip;
    private int port;
    private String name;

}
