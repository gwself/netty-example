package com.yunus.protocol.response;

import com.yunus.protocol.Packet;
import com.yunus.session.Session;
import lombok.Data;

import static com.yunus.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
