package net.desertion.jedisjson.packet.packets.animationpackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayAnimationPacket {

    private String player;
    private String clazz;

}
