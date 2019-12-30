package com.yunus.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.yunus.serialize.Serializer;
import com.yunus.serialize.SerializerAlgorithm;

/**
 * json 序列化
 *
 * @author gaoyunfeng
 */
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {

        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {

        return JSON.parseObject(bytes, clazz);
    }
}
