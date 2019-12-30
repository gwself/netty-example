package com.yunus.attribute;

import com.yunus.session.Session;
import io.netty.util.AttributeKey;

/**
 * @author gaoyunfeng
 */
public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
