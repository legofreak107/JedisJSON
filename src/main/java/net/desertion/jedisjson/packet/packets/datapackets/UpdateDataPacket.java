package net.desertion.jedisjson.packet.packets.datapackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.desertion.jedisjson.packet.packets.responsepackets.ResponsePacket;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDataPacket extends ResponsePacket {

    private String uid;
    private String oldData;
    private String newData;

}
