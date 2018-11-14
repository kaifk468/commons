package io.mosip.registration.manager;

import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Trigger;

import io.mosip.registration.entity.SyncJob;
import io.mosip.registration.exception.RegBaseUncheckedException;

/**
 * This class includes the functionalities of what transaction table needed.,
 * like getting job details and preparation of sync transaction data
 * 
 * @author YASWANTH S
 * @since 1.0.0
 *
 */
public interface BaseTransactionManager {

	/**
	 * To get the job by using jobContext
	 * 
	 * @param context
	 *            is a job information
	 * @return SyncJob the entity
	 */
	public SyncJob getJob(JobExecutionContext context);

	/**
	 * To get the job by using jobDetail
	 * 
	 * @param jobDetail
	 *            is a job information
	 * @return SyncJob the entity
	 */
	public SyncJob getJob(JobDetail jobDetail);

	/**
	 * To get the job by using api name
	 * 
	 * @param apiName
	 *            or bean name
	 * @return SyncJob the entity
	 */
	public SyncJob getJob(String apiName);

	/**
	 * To get the job by using trigger information
	 * 
	 * @param trigger
	 *            class
	 * @return SyncJob the entity
	 */
	public SyncJob getJob(Trigger trigger);

	/**
	 * To create a new transacion in sync transaction table
	 * 
	 * @param status
	 *            of Job
	 * @param statusComment
	 *            of job
	 * @param triggerPoint
	 *            information system/User
	 * 
	 * @param syncJob
	 *            information
	 */
	public void createSyncTransaction(String status, String statusComment, String triggerPoint, SyncJob syncJob)
			throws RegBaseUncheckedException;
}
