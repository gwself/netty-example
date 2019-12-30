package com.yunus.protocol.request;

import lombok.Data;
import com.yunus.protocol.Packet;

import static com.yunus.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
