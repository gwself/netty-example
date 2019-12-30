package com.yunus.protocol.response;

import com.yunus.protocol.Packet;
import lombok.Data;

import static com.yunus.protocol.command.Command.JOIN_GROUP_RESPONSE;

/**
 * @author gaoyunfeng
 */
@Data
public class JoinGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_RESPONSE;
    }
}
