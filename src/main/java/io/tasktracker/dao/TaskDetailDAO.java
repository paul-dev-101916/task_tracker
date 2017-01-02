package io.tasktracker.dao;

import java.util.List;

import io.tasktracker.types.TaskDetailType;

public interface TaskDetailDAO {
	public List<TaskDetailType> getAllTasks();
	public TaskDetailType getTask(int taskId);
	public void deleteTask(int taskId);
	public TaskDetailType updateTask(TaskDetailType taskToUpdate);
}
