package com.yunus.protocol.response;

import com.yunus.protocol.Packet;
import lombok.Data;

import static com.yunus.protocol.command.Command.LOGOUT_RESPONSE;

@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
