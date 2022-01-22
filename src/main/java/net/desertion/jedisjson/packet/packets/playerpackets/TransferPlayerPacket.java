package net.desertion.jedisjson.packet.packets.playerpackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferPlayerPacket {

    private String player;
    private String animation;
    private String targetServer;

}
