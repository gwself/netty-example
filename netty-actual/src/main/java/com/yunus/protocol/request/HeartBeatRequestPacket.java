package com.yunus.protocol.request;

import com.yunus.protocol.Packet;

import static com.yunus.protocol.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
