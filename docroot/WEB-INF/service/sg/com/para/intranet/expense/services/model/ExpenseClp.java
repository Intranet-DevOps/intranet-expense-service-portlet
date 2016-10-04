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

package sg.com.para.intranet.expense.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import sg.com.para.intranet.expense.services.service.ClpSerializer;
import sg.com.para.intranet.expense.services.service.ExpenseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Karnagi
 */
public class ExpenseClp extends BaseModelImpl<Expense> implements Expense {
	public ExpenseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Expense.class;
	}

	@Override
	public String getModelClassName() {
		return Expense.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _expenseId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setExpenseId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _expenseId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("expenseId", getExpenseId());
		attributes.put("employeeScreenName", getEmployeeScreenName());
		attributes.put("logDate", getLogDate());
		attributes.put("amount", getAmount());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());
		attributes.put("projectCode", getProjectCode());
		attributes.put("approvedBy", getApprovedBy());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("processedBy", getProcessedBy());
		attributes.put("processedDate", getProcessedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer expenseId = (Integer)attributes.get("expenseId");

		if (expenseId != null) {
			setExpenseId(expenseId);
		}

		String employeeScreenName = (String)attributes.get("employeeScreenName");

		if (employeeScreenName != null) {
			setEmployeeScreenName(employeeScreenName);
		}

		Date logDate = (Date)attributes.get("logDate");

		if (logDate != null) {
			setLogDate(logDate);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String projectCode = (String)attributes.get("projectCode");

		if (projectCode != null) {
			setProjectCode(projectCode);
		}

		String approvedBy = (String)attributes.get("approvedBy");

		if (approvedBy != null) {
			setApprovedBy(approvedBy);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		String processedBy = (String)attributes.get("processedBy");

		if (processedBy != null) {
			setProcessedBy(processedBy);
		}

		Date processedDate = (Date)attributes.get("processedDate");

		if (processedDate != null) {
			setProcessedDate(processedDate);
		}
	}

	@Override
	public int getExpenseId() {
		return _expenseId;
	}

	@Override
	public void setExpenseId(int expenseId) {
		_expenseId = expenseId;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setExpenseId", int.class);

				method.invoke(_expenseRemoteModel, expenseId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployeeScreenName() {
		return _employeeScreenName;
	}

	@Override
	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeScreenName",
						String.class);

				method.invoke(_expenseRemoteModel, employeeScreenName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLogDate() {
		return _logDate;
	}

	@Override
	public void setLogDate(Date logDate) {
		_logDate = logDate;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setLogDate", Date.class);

				method.invoke(_expenseRemoteModel, logDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(double amount) {
		_amount = amount;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", double.class);

				method.invoke(_expenseRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_expenseRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_expenseRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProjectCode() {
		return _projectCode;
	}

	@Override
	public void setProjectCode(String projectCode) {
		_projectCode = projectCode;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectCode", String.class);

				method.invoke(_expenseRemoteModel, projectCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprovedBy() {
		return _approvedBy;
	}

	@Override
	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedBy", String.class);

				method.invoke(_expenseRemoteModel, approvedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovedDate() {
		return _approvedDate;
	}

	@Override
	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedDate", Date.class);

				method.invoke(_expenseRemoteModel, approvedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProcessedBy() {
		return _processedBy;
	}

	@Override
	public void setProcessedBy(String processedBy) {
		_processedBy = processedBy;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessedBy", String.class);

				method.invoke(_expenseRemoteModel, processedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getProcessedDate() {
		return _processedDate;
	}

	@Override
	public void setProcessedDate(Date processedDate) {
		_processedDate = processedDate;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessedDate", Date.class);

				method.invoke(_expenseRemoteModel, processedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getExpenseRemoteModel() {
		return _expenseRemoteModel;
	}

	public void setExpenseRemoteModel(BaseModel<?> expenseRemoteModel) {
		_expenseRemoteModel = expenseRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _expenseRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_expenseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ExpenseLocalServiceUtil.addExpense(this);
		}
		else {
			ExpenseLocalServiceUtil.updateExpense(this);
		}
	}

	@Override
	public Expense toEscapedModel() {
		return (Expense)ProxyUtil.newProxyInstance(Expense.class.getClassLoader(),
			new Class[] { Expense.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ExpenseClp clone = new ExpenseClp();

		clone.setExpenseId(getExpenseId());
		clone.setEmployeeScreenName(getEmployeeScreenName());
		clone.setLogDate(getLogDate());
		clone.setAmount(getAmount());
		clone.setRemarks(getRemarks());
		clone.setStatus(getStatus());
		clone.setProjectCode(getProjectCode());
		clone.setApprovedBy(getApprovedBy());
		clone.setApprovedDate(getApprovedDate());
		clone.setProcessedBy(getProcessedBy());
		clone.setProcessedDate(getProcessedDate());

		return clone;
	}

	@Override
	public int compareTo(Expense expense) {
		int primaryKey = expense.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExpenseClp)) {
			return false;
		}

		ExpenseClp expense = (ExpenseClp)obj;

		int primaryKey = expense.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{expenseId=");
		sb.append(getExpenseId());
		sb.append(", employeeScreenName=");
		sb.append(getEmployeeScreenName());
		sb.append(", logDate=");
		sb.append(getLogDate());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", projectCode=");
		sb.append(getProjectCode());
		sb.append(", approvedBy=");
		sb.append(getApprovedBy());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", processedBy=");
		sb.append(getProcessedBy());
		sb.append(", processedDate=");
		sb.append(getProcessedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.expense.services.model.Expense");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>expenseId</column-name><column-value><![CDATA[");
		sb.append(getExpenseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeScreenName</column-name><column-value><![CDATA[");
		sb.append(getEmployeeScreenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logDate</column-name><column-value><![CDATA[");
		sb.append(getLogDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectCode</column-name><column-value><![CDATA[");
		sb.append(getProjectCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedBy</column-name><column-value><![CDATA[");
		sb.append(getApprovedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedDate</column-name><column-value><![CDATA[");
		sb.append(getApprovedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processedBy</column-name><column-value><![CDATA[");
		sb.append(getProcessedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processedDate</column-name><column-value><![CDATA[");
		sb.append(getProcessedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _expenseId;
	private String _employeeScreenName;
	private Date _logDate;
	private double _amount;
	private String _remarks;
	private String _status;
	private String _projectCode;
	private String _approvedBy;
	private Date _approvedDate;
	private String _processedBy;
	private Date _processedDate;
	private BaseModel<?> _expenseRemoteModel;
	private Class<?> _clpSerializerClass = sg.com.para.intranet.expense.services.service.ClpSerializer.class;
}