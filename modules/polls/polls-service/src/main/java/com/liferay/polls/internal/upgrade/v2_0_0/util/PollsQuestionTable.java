/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.polls.internal.upgrade.v2_0_0.util;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * @author	  Brian Wing Shun Chan
 * @generated
 */
public class PollsQuestionTable {

	public static final String TABLE_NAME = "PollsQuestion";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR},
		{"questionId", Types.BIGINT},
		{"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT},
		{"userId", Types.BIGINT},
		{"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"title", Types.VARCHAR},
		{"description", Types.VARCHAR},
		{"expirationDate", Types.TIMESTAMP},
		{"lastPublishDate", Types.TIMESTAMP},
		{"lastVoteDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

static {
TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);

TABLE_COLUMNS_MAP.put("questionId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);

TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);

TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);

TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);

TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);

TABLE_COLUMNS_MAP.put("expirationDate", Types.TIMESTAMP);

TABLE_COLUMNS_MAP.put("lastPublishDate", Types.TIMESTAMP);

TABLE_COLUMNS_MAP.put("lastVoteDate", Types.TIMESTAMP);

}
	public static final String TABLE_SQL_CREATE = "create table PollsQuestion (uuid_ VARCHAR(75) null,questionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,title STRING null,description STRING null,expirationDate DATE null,lastPublishDate DATE null,lastVoteDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table PollsQuestion";

	public static final String[] TABLE_SQL_ADD_INDEXES = {
		"create index IX_9FF342EA on PollsQuestion (groupId)",
		"create index IX_F910BBB4 on PollsQuestion (uuid_[$COLUMN_LENGTH:75$], companyId)",
		"create unique index IX_F3C9F36 on PollsQuestion (uuid_[$COLUMN_LENGTH:75$], groupId)"
	};

}