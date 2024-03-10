# Use Case “Place order”

##### **Use case code**

UC02

##### **Brief Description**

This use case provides a description of the interactions between AIMS software and the customer when the customer wants to place an order

##### **Actors**

- 1. Customers.

##### **Preconditions**

There exists at least one item in the cart

##### **Basic flow**

| Step 1 | Customer requests to place an order in the cart |
| --- | --- |
| Step 2 | AIMS software checks whether all items in the cart are available or not |
| Step 3 | AIMS software asks customer to fill in delivery information |
| Step 4 | Customer fills in all delivery information (Table 1.) |
| Step 5 | AIMS software calculates and displays order and shipping fees (Table 2.) |
| Step 6 | Customer requests to pay the order |
| Step 7 | AIMS software calls “Pay Order” use case |
| Step 8 | AIMS software saves the order information back to the server |
| Step 9 | AIMS software reset the cart |
| Step 10 | AIMS software sends an email regarding the order’s information |

##### **Alternative flow**

| No  | Location | Condition | Action | Resume Location |
| --- | --- | --- | --- | --- |
| 1.  | At step 2 | If the items are not available | AIMS software notifies the user that some products are no longer available | Use case ends |
| 2.  | At step 4 | If the customer does not enter all the necessary fields | AIMS software asks the customer to fill all required fields | Step 4 |
| 3.  | At step 5 | If the customer requests to make a rush order | AIMS software calls the “Place a rush order” use case | Step 6 |
| 4   | At step 7 | If the user’s transaction wasn’t found | AIMS software notifies the user for an unsuccessful paying attempt | Step 6 |
| 5   | At step 6 | If the system waits for too long without any responds from the customer | AIMS software cancels the user’s attempt to pay | Use case ends |

##### **Input**

Table 1: Input data of payment information

| No  | Data fields | Description | Mandatory | Valid condition | Example |
| --- | --- | --- | --- | --- | --- |
| 1.  | Customer’s name |     | Yes |     | Pham Quang Huy |
| 2.  | Customer’s phone number |     | Yes | 10 digits | 0394977199 |
| 3   | Customer email |     | Yes | The standard form of an email | <huypham261203@gmail.com> |
| 4.  | Customer’s address |     | Yes |     |     |

##### **Output data**

Table 2. Output data of general information of order and transaction info

<table><tbody><tr><th><p>No</p></th><th><p>Data fields</p></th><th><p>Description</p></th><th><p>Display format</p></th><th><p>Example</p></th></tr><tr><td><p>1.</p></td><td><p>Title</p></td><td><p>Title of a product</p></td><td></td><td><p>Frieren</p></td></tr><tr><td><p>2.</p></td><td><p>Price</p></td><td><p>Price of the product</p></td><td><ul><li>Comma for thousands separator</li><li>Positive value</li><li>Right alignment</li></ul></td><td><p>49,000</p></td></tr><tr><td><p>3.</p></td><td><p>Quantity</p></td><td><p>Quantity of the items</p></td><td><ul><li>Positive value</li><li>Right alignment</li></ul></td><td><p>3</p></td></tr><tr><td><p>4.</p></td><td><p>Amount</p></td><td><p>Total amount of money</p></td><td rowspan="5"><ul><li>Comma for thousands separator</li><li>Positive value</li><li>Right alignment</li></ul></td><td><p>147,000</p></td></tr><tr><td><p>5.</p></td><td><p>Subtotal before VAT</p></td><td><p>Total amount of money before VAT</p></td><td><p>578,000</p></td></tr><tr><td><p>6.</p></td><td><p>Subtotal</p></td><td><p>Total amount of money (VAT included)</p></td><td><p>635,800</p></td></tr><tr><td><p>7.</p></td><td><p>Shipping fee</p></td><td></td><td><p>25,000</p></td></tr><tr><td><p>8.</p></td><td><p>Total</p></td><td><p>Sum of subtotal and shipping fee</p></td><td><p>660,800</p></td></tr><tr><td><p>9.</p></td><td><p>Currency</p></td><td></td><td></td><td><p>VND</p></td></tr><tr><td><p>10.</p></td><td><p>Name</p></td><td></td><td></td><td><p>Pham Quang Huy</p></td></tr><tr><td><p>11.</p></td><td><p>Phone number</p></td><td></td><td></td><td><p>0394977199</p></td></tr><tr><td><p>12.</p></td><td><p>Province</p></td><td></td><td></td><td><p>Ha Noi</p></td></tr><tr><td><p>13.</p></td><td><p>Address</p></td><td></td><td></td><td><p>Ha Dong District, Ha Noi</p></td></tr><tr><td><p>14.</p></td><td><p>Shipping instructions</p></td><td></td><td></td><td></td></tr></tbody></table>

##### **Postconditions**

- AIMS software notifies of the successful money transaction.
- Order details are saved in the system.
- An email of successful order is sent to the customer.
