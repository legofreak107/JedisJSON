package net.desertion.jedisjson.packet.packets.velocitypackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterServerPacket {

    private String ip;
    private int port;
    private String name;

}
