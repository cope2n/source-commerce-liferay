create table CommerceCurrency (
	uuid_ VARCHAR(75) null,
	commerceCurrencyId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	name STRING null,
	rate DECIMAL(30, 16) null,
	formatPattern STRING null,
	maxFractionDigits INTEGER,
	minFractionDigits INTEGER,
	roundingMode VARCHAR(75) null,
	primary_ BOOLEAN,
	priority DOUBLE,
	active_ BOOLEAN,
	lastPublishDate DATE null
);