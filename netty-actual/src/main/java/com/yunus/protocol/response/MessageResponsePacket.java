package com.yunus.protocol.response;

import com.yunus.protocol.Packet;
import lombok.Data;

import static com.yunus.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @author gaoyunfeng
 */
@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
