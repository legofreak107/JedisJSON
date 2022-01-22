package net.desertion.jedisjson.listeners.types;

import com.google.gson.Gson;
import net.desertion.jedisjson.packet.JedisJSONPacket;

import java.lang.reflect.Type;

public interface JedisJSONPacketListener<T extends JedisJSONPacket> {

    void accept(T t);

    Gson getPacketGson();

   Type getPacketType();

}
