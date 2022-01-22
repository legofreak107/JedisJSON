package net.desertion.jedisjson.packet.packets.playerpackets;

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
public class CreateSoundUrlPacket extends ResponsePacket {

    private String player;

}
