package com.yunus.protocol.request;

import com.yunus.protocol.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.yunus.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @author gaoyunfeng
 */
@Data
@NoArgsConstructor
public class MessageRequestPacket extends Packet {
    private String toUserId;
    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
