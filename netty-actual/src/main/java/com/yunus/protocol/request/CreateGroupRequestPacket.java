package com.yunus.protocol.request;

import lombok.Data;
import com.yunus.protocol.Packet;

import java.util.List;

import static com.yunus.protocol.command.Command.CREATE_GROUP_REQUEST;

/**
 * @author gaoyunfeng
 */
@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
