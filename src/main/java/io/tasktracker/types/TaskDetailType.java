package io.tasktracker.types;

import java.util.Date;

public class TaskDetailType {
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getTask_details() {
		return task_details;
	}
	public void setTask_details(String task_details) {
		this.task_details = task_details;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreate_timestamp() {
		return create_timestamp;
	}
	public void setCreate_timestamp(Date create_timestamp) {
		this.create_timestamp = create_timestamp;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public Date getLast_update_timestamp() {
		return last_update_timestamp;
	}
	public void setLast_update_timestamp(Date last_update_timestamp) {
		this.last_update_timestamp = last_update_timestamp;
	}
	public String getLast_update_user() {
		return last_update_user;
	}
	public void setLast_update_user(String last_update_user) {
		this.last_update_user = last_update_user;
	}
	private int task_id;
	private String task_name;
	private String task_details;
	private String status;
	private Date create_timestamp;
	private String create_user;
	private Date last_update_timestamp;
	private String last_update_user;
}
