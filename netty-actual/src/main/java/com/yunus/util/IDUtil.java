package com.yunus.util;

import java.util.UUID;

/**
 * @author gaoyunfeng
 */
public class IDUtil {
    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
