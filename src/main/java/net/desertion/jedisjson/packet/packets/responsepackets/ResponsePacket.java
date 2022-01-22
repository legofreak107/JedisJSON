package net.desertion.jedisjson.packet.packets.responsepackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.desertion.jedisjson.packet.JedisJSONPacket;
import net.desertion.jedisjson.packet.packets.responsepackets.enums.PacketResponse;

@AllArgsConstructor
@NoArgsConstructor
public class ResponsePacket extends JedisJSONPacket {

    @Getter
    private PacketResponse response;

    public ResponsePacket setResponse(PacketResponse response) {
        this.response = response;
        return this;
    }
}
