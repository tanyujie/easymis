package com.easymis.commons.web.session.id;

import java.util.UUID;

import org.apache.commons.lang.StringUtils;

/**
 * 通过UUID生成SESSION ID
 */
public class JugUUIDGenerator implements SessionIdGenerator {
	public String get() {
		return StringUtils.remove(UUID.randomUUID().toString(), '-');
	}
}
