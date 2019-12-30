package com.yunus.protocol.request;

import lombok.Data;
import com.yunus.protocol.Packet;

import static com.yunus.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
