package com.yunus.protocol.request;

import lombok.Data;
import com.yunus.protocol.Packet;

import static com.yunus.protocol.command.Command.LOGOUT_REQUEST;

@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
