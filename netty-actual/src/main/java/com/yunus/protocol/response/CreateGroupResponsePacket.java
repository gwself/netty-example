package com.yunus.protocol.response;

import com.yunus.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.yunus.protocol.command.Command.CREATE_GROUP_RESPONSE;

/**
 * @author gaoyunfeng
 */
@Data
public class CreateGroupResponsePacket extends Packet {

    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_RESPONSE;
    }
}
