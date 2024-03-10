# Use Case “Pay order”

##### **Use case code**

UC02

##### **Brief Description**

This use case provides a description of the interactions between AIMS software and the customer as well as VNPay software when customer wants to make payments for an order.

##### **Actors**

- 1. Customers.
  2. VNPay

##### **Preconditions**

The customer has confirmed the order, and the AIMS software has calculated the total amount of money that the customer has to pay for the aforementioned order.

##### **Basic flow**

| Step 1 | AIMS software displays the bill |
| --- | --- |
| Step 2 | Customer requests to pay for the bill |
| Step 3 | AIMS software displays the payment instruction |
| Step 4 | AIMS software checks for the transaction |
| Step 5 | AIMS software saves the transaction information |

##### **Alternative flow**

| No  | Location | Condition | Action | Resume Location |
| --- | --- | --- | --- | --- |
| 1.  | At step 4 | If the customer’s transaction wasn’t found | Display a warning | Step 3 |
| 2.  | At step 5 | If the customer cancels the payment transaction |     | Step 1 |
| 3.  | At step 3 | If the VNPay software is being maintained | Display a warning | Step 1 |

##### **Input**

Table 1: Input data of payment information

| No  | Data fields | Description | Mandatory | Valid condition | Example |
| --- | --- | --- | --- | --- | --- |
| 1.  | Card holder name |     | Yes |     | Pham Quang Huy |
| 2.  | Card number |     | Yes | 10 digits | 03649448301 |
| 3   | Expiration date | The month, year of the card expired date | Yes | mm/yy | 05/28 |
| 4.  | Security code |     | Yes | 3 digits | 357 |

##### **Output data**

Table 2. Output data of general information of order and transaction info

<table><tbody><tr><th><p>No</p></th><th><p>Data fields</p></th><th><p>Description</p></th><th><p>Display format</p></th><th><p>Example</p></th></tr><tr><td><p>1.</p></td><td><p>Title</p></td><td><p>Title of a product</p></td><td></td><td><p>Frieren</p></td></tr><tr><td><p>2.</p></td><td><p>Price</p></td><td><p>Price of the product</p></td><td><ul><li>Comma for thousands separator</li><li>Positive value</li><li>Right alignment</li></ul></td><td><p>49,000</p></td></tr><tr><td><p>3.</p></td><td><p>Quantity</p></td><td><p>Quantity of the items</p></td><td><ul><li>Positive value</li><li>Right alignment</li></ul></td><td><p>3</p></td></tr><tr><td><p>4.</p></td><td><p>Amount</p></td><td><p>Total amount of money</p></td><td rowspan="5"><ul><li>Comma for thousands separator</li><li>Positive value</li><li>Right alignment</li></ul></td><td><p>147,000</p></td></tr><tr><td><p>5.</p></td><td><p>Subtotal before VAT</p></td><td><p>Total amount of money before VAT</p></td><td><p>578,000</p></td></tr><tr><td><p>6.</p></td><td><p>Subtotal</p></td><td><p>Total amount of money (VAT included)</p></td><td><p>635,800</p></td></tr><tr><td><p>7.</p></td><td><p>Shipping fee</p></td><td></td><td><p>25,000</p></td></tr><tr><td><p>8.</p></td><td><p>Total</p></td><td><p>Sum of subtotal and shipping fee</p></td><td><p>660,800</p></td></tr><tr><td><p>9.</p></td><td><p>Currency</p></td><td></td><td></td><td><p>VND</p></td></tr><tr><td><p>10.</p></td><td><p>Name</p></td><td></td><td></td><td><p>Pham Quang Huy</p></td></tr><tr><td><p>11.</p></td><td><p>Phone number</p></td><td></td><td></td><td><p>0394977199</p></td></tr><tr><td><p>12.</p></td><td><p>Province</p></td><td></td><td></td><td><p>Ha Noi</p></td></tr><tr><td><p>13.</p></td><td><p>Address</p></td><td></td><td></td><td><p>Ha Dong District, Ha Noi</p></td></tr><tr><td><p>14.</p></td><td><p>Shipping instructions</p></td><td></td><td></td><td></td></tr></tbody></table>

##### **Postconditions**

- AIMS software notifies of the successful money transaction.
- Order details are saved in the system.
- An email of successful order is sent to the customer.
