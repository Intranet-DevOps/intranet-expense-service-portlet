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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link sg.com.para.intranet.expense.services.service.http.ExpenseServiceSoap}.
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.expense.services.service.http.ExpenseServiceSoap
 * @generated
 */
public class ExpenseSoap implements Serializable {
	public static ExpenseSoap toSoapModel(Expense model) {
		ExpenseSoap soapModel = new ExpenseSoap();

		soapModel.setExpenseId(model.getExpenseId());
		soapModel.setEmployeeScreenName(model.getEmployeeScreenName());
		soapModel.setLogDate(model.getLogDate());
		soapModel.setAmount(model.getAmount());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setStatus(model.getStatus());
		soapModel.setProjectCode(model.getProjectCode());
		soapModel.setApprovedBy(model.getApprovedBy());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setProcessedBy(model.getProcessedBy());
		soapModel.setProcessedDate(model.getProcessedDate());

		return soapModel;
	}

	public static ExpenseSoap[] toSoapModels(Expense[] models) {
		ExpenseSoap[] soapModels = new ExpenseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExpenseSoap[][] toSoapModels(Expense[][] models) {
		ExpenseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExpenseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExpenseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExpenseSoap[] toSoapModels(List<Expense> models) {
		List<ExpenseSoap> soapModels = new ArrayList<ExpenseSoap>(models.size());

		for (Expense model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExpenseSoap[soapModels.size()]);
	}

	public ExpenseSoap() {
	}

	public int getPrimaryKey() {
		return _expenseId;
	}

	public void setPrimaryKey(int pk) {
		setExpenseId(pk);
	}

	public int getExpenseId() {
		return _expenseId;
	}

	public void setExpenseId(int expenseId) {
		_expenseId = expenseId;
	}

	public String getEmployeeScreenName() {
		return _employeeScreenName;
	}

	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;
	}

	public Date getLogDate() {
		return _logDate;
	}

	public void setLogDate(Date logDate) {
		_logDate = logDate;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getProjectCode() {
		return _projectCode;
	}

	public void setProjectCode(String projectCode) {
		_projectCode = projectCode;
	}

	public String getApprovedBy() {
		return _approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public String getProcessedBy() {
		return _processedBy;
	}

	public void setProcessedBy(String processedBy) {
		_processedBy = processedBy;
	}

	public Date getProcessedDate() {
		return _processedDate;
	}

	public void setProcessedDate(Date processedDate) {
		_processedDate = processedDate;
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
}