# Use Case “Place rush order”

##### **Use case code**

UC03

##### **Brief Description**

This use case provides a description of the interactions between AIMS software and the customer when the customer wants to place a rush order.

##### **Actors**

- 1. Customers.

##### **Preconditions**

The customer has filled in the delivery information and wants to placed a rush order.

##### **Basic flow**

| Step 1 | Customer requests a rush order |
| --- | --- |
| Step 2 | AIMS software checks for feasibility of a rush order |
| Step 3 | AIMS software prompts the customer to update the delivery information |
| Step 4 | Customer provides rush order delivery information (Table 1) |
| Step 5 | AIMS software verifies the customer rush order information and calculates the new shipping fee |
| Step 6 | AIMS software calls the “Pay order” use case |

##### **Alternative flow**

| No  | Location | Condition | Action | Resume Location |
| --- | --- | --- | --- | --- |
| 1.  | At step 2 | If the rush order is not feasible for the order | The AIMS software notifies the customer that rush order is not possible | Continue the “Place an order” use case with normal delivery |
| 2.  | At step 5 | If the delivery address is not supported | The AIMS software notifies the customer that the address is not supported for rush order | Step 3 |

##### **Input**

Table 1: Input data of rush order information

| No  | Data fields | Description | Mandatory | Valid condition | Example |
| --- | --- | --- | --- | --- | --- |
| 1.  | Delivery time |     | Yes |     | 9h  |
| 2.  | Delivery instruction |     | Yes |     |     |

##### **Output data**

##### **Postconditions**

- Customer places a rush order successfully.
- Customer continues to pay the order
