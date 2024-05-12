CREATE TABLE [Product] (
	ProductID char,
	Product_name varchar,
	Product_type varchar,
	Product_unit_price float,
	CONSTRAINT PK_Product PRIMARY KEY (ProductID),
);

CREATE TABLE [Cart] (
	CartID char,
	CONSTRAINT PK_Cart PRIMARY KEY (CartID),
);

CREATE TABLE [CartProduct] (
	ProductID char,
	CartID char,
	Product_quantity int,
	CONSTRAINT PK_CartProduct PRIMARY KEY (ProductID),
	CONSTRAINT FK1_CartProduct FOREIGN KEY (ProductID) REFERENCES Product(ProductID),
	CONSTRAINT FK2_CartProduct FOREIGN KEY (CartID) REFERENCES Cart(CartID),
);

CREATE TABLE [DeliveryInfo] (
	DeliveryInfoID char,
	Receiver varchar,
	DeliveryAddress varchar,
	Phone_number char,
	CONSTRAINT PK_DeliveryInfo PRIMARY KEY (DeliveryInfoID),
);

CREATE TABLE [RushDeliveryInfo] (
	RushDeliveryInfoID char,
	DeliveryInfoID char,
	DeliveryTime time,
	DeliveryInstructions varchar,
	CONSTRAINT PK_RushDeliveryInfo PRIMARY KEY (RushDeliveryInfoID),
	CONSTRAINT FK_RushDeliveryInfo FOREIGN KEY (DeliveryInfoID) REFERENCES DeliveryInfo(DeliveryInfoID),
);

CREATE TABLE [Invoice] (
	InvoiceID char,
	Shipping_fee float,
	Total_fee float,
	CONSTRAINT PK_Invoice PRIMARY KEY (InvoiceID),
);

CREATE TABLE [TransactionInfo] (
	TransactionID char,
	TransactionDate date,
	TransactionTime time,
	TransactionAmount int,
	CONSTRAINT PK_TransactionInfo PRIMARY KEY (TransactionID),
);

CREATE TABLE [Order] (
	OrderID char,
	CartID char,
	DeliveryInfoID char,
	InvoiceID char,
	TransactionID char,
	CONSTRAINT PK_Order PRIMARY KEY (OrderID),
	CONSTRAINT FK1_Order FOREIGN KEY (CartID) REFERENCES Cart(CartID),
	CONSTRAINT FK2_Order FOREIGN KEY (DeliveryInfoID) REFERENCES DeliveryInfo(DeliveryInfoID),
	CONSTRAINT FK3_Order FOREIGN KEY (InvoiceID) REFERENCES Invoice(InvoiceID),
	CONSTRAINT FK4_Order FOREIGN KEY (TransactionID) REFERENCES TransactionInfo(TransactionID),
);