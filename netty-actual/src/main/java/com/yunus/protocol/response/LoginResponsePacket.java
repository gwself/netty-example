package com.yunus.protocol.response;

import com.yunus.protocol.Packet;
import lombok.Data;

import static com.yunus.protocol.command.Command.LOGIN_RESPONSE;

/**
 * @author gaoyunfeng
 */
@Data
public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGIN_RESPONSE;
    }
}
