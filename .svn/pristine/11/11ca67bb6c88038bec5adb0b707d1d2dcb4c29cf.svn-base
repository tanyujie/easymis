package cn.easymis.entitys.mybatis.dto;

import cn.easymis.entitys.mybatis.dto.base.BaseUnifiedUser;

public class UnifiedUser extends BaseUnifiedUser {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public UnifiedUser() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public UnifiedUser(java.lang.String id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public UnifiedUser(java.lang.String id, java.lang.String username, java.lang.String password,
			java.util.Date registerTime, java.lang.String registerIp, java.lang.Integer loginCount,
			java.lang.Integer errorCount, java.lang.Boolean activation, java.lang.String token_id,
			java.lang.String token_Time) {

		super(id, username, password, registerTime, registerIp, loginCount, errorCount, activation, token_id,
				token_Time);
	}

	/* [CONSTRUCTOR MARKER END] */

	public void init() {
		if (getLoginCount() == null) {
			setLoginCount(0);
		}
		if (getErrorCount() == null) {
			setErrorCount(0);
		}
	}

}