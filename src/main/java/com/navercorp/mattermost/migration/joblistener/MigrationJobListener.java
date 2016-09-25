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
package com.navercorp.mattermost.migration.joblistener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MigrationJobListener implements JobExecutionListener {
	private Long startTime;
	private Long endTime;

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Before Job =====");
		startTime = System.currentTimeMillis();
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("After Job =====");
		endTime = System.currentTimeMillis();

		System.out.println("Migrate in " + (endTime - startTime) + " Milliseconds.");
	}
}
