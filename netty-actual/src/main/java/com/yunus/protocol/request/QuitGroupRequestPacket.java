package com.yunus.protocol.request;

import lombok.Data;
import com.yunus.protocol.Packet;

import static com.yunus.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
