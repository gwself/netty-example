package com.yunus.protocol.response;

import com.yunus.protocol.Packet;
import com.yunus.session.Session;
import lombok.Data;

import java.util.List;

import static com.yunus.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

/**
 * @author gaoyunfeng
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
