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

package sg.com.para.intranet.expense.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import sg.com.para.intranet.expense.services.model.Expense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Expense in entity cache.
 *
 * @author Fernando Karnagi
 * @see Expense
 * @generated
 */
public class ExpenseCacheModel implements CacheModel<Expense>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{expenseId=");
		sb.append(expenseId);
		sb.append(", employeeScreenName=");
		sb.append(employeeScreenName);
		sb.append(", logDate=");
		sb.append(logDate);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", status=");
		sb.append(status);
		sb.append(", projectCode=");
		sb.append(projectCode);
		sb.append(", approvedBy=");
		sb.append(approvedBy);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", processedBy=");
		sb.append(processedBy);
		sb.append(", processedDate=");
		sb.append(processedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Expense toEntityModel() {
		ExpenseImpl expenseImpl = new ExpenseImpl();

		expenseImpl.setExpenseId(expenseId);

		if (employeeScreenName == null) {
			expenseImpl.setEmployeeScreenName(StringPool.BLANK);
		}
		else {
			expenseImpl.setEmployeeScreenName(employeeScreenName);
		}

		if (logDate == Long.MIN_VALUE) {
			expenseImpl.setLogDate(null);
		}
		else {
			expenseImpl.setLogDate(new Date(logDate));
		}

		expenseImpl.setAmount(amount);

		if (remarks == null) {
			expenseImpl.setRemarks(StringPool.BLANK);
		}
		else {
			expenseImpl.setRemarks(remarks);
		}

		if (status == null) {
			expenseImpl.setStatus(StringPool.BLANK);
		}
		else {
			expenseImpl.setStatus(status);
		}

		if (projectCode == null) {
			expenseImpl.setProjectCode(StringPool.BLANK);
		}
		else {
			expenseImpl.setProjectCode(projectCode);
		}

		if (approvedBy == null) {
			expenseImpl.setApprovedBy(StringPool.BLANK);
		}
		else {
			expenseImpl.setApprovedBy(approvedBy);
		}

		if (approvedDate == Long.MIN_VALUE) {
			expenseImpl.setApprovedDate(null);
		}
		else {
			expenseImpl.setApprovedDate(new Date(approvedDate));
		}

		if (processedBy == null) {
			expenseImpl.setProcessedBy(StringPool.BLANK);
		}
		else {
			expenseImpl.setProcessedBy(processedBy);
		}

		if (processedDate == Long.MIN_VALUE) {
			expenseImpl.setProcessedDate(null);
		}
		else {
			expenseImpl.setProcessedDate(new Date(processedDate));
		}

		expenseImpl.resetOriginalValues();

		return expenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		expenseId = objectInput.readInt();
		employeeScreenName = objectInput.readUTF();
		logDate = objectInput.readLong();
		amount = objectInput.readDouble();
		remarks = objectInput.readUTF();
		status = objectInput.readUTF();
		projectCode = objectInput.readUTF();
		approvedBy = objectInput.readUTF();
		approvedDate = objectInput.readLong();
		processedBy = objectInput.readUTF();
		processedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(expenseId);

		if (employeeScreenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeScreenName);
		}

		objectOutput.writeLong(logDate);
		objectOutput.writeDouble(amount);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (projectCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectCode);
		}

		if (approvedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approvedBy);
		}

		objectOutput.writeLong(approvedDate);

		if (processedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(processedBy);
		}

		objectOutput.writeLong(processedDate);
	}

	public int expenseId;
	public String employeeScreenName;
	public long logDate;
	public double amount;
	public String remarks;
	public String status;
	public String projectCode;
	public String approvedBy;
	public long approvedDate;
	public String processedBy;
	public long processedDate;
}