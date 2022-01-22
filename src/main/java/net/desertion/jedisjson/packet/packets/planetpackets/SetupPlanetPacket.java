package net.desertion.jedisjson.packet.packets.planetpackets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SetupPlanetPacket {

    private String name;
    private float distance;
    private float size;
    private int difficulty;
    private float movingSpeed;
    private float temperature;
    private float gravity;
    private float moisture;
    private boolean oxygen;
    private boolean radiation;

}
