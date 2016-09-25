/*
 *	Copyright 2016 Naver Corp.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.navercorp.mattermost.migration.domains;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Posts {
	private String id;
	private BigInteger createat;
	private BigInteger updateat;
	private BigInteger deleteat;
	private String userid;
	private String channelid;
	private String rootid;
	private String parentid;
	private String originalid;
	private String message;
	private String type;
	private String props;
	private String hashtags;
	private String filenames;
}
