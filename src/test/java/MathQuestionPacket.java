import lombok.AllArgsConstructor;
import lombok.Getter;
import net.desertion.jedisjson.packet.JedisJSONPacket;

@AllArgsConstructor
@Getter
public class MathQuestionPacket extends JedisJSONPacket {

    private String question;
    private int response;

}
