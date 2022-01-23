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
public class RegisterCutScenePacket extends ResponsePacket {

    private String ip;

}
