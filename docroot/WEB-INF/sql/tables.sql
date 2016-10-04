create table intranet_expense (
	expenseId INTEGER not null primary key,
	employeeScreenName VARCHAR(75) null,
	logDate DATE null,
	amount DOUBLE,
	remarks VARCHAR(75) null,
	status VARCHAR(75) null,
	projectCode VARCHAR(75) null,
	approvedBy VARCHAR(75) null,
	approvedDate DATE null,
	processedBy VARCHAR(75) null,
	processedDate DATE null
);