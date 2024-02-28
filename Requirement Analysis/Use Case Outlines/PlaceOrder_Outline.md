# Place an order use case

**Basic flow:**

| #   | Doer | Action |
| --- | --- | --- |
| 1   | Customer | Request to place an order |
| 2   | Software | Check inventory quantity |
| 3   | Software | Request user to set up delivery information |
| 4   | Customer | Fill in delivery information |
| 5   | Customer | Pay the order |
| 6   | Software | Confirm the transaction |
| 7   | Software | Confirm the order |

**Alternative flow 1:**

| #   | Doer | Action |
| --- | --- | --- |
| 1   | Customer | Request to place an order |
| 2   | Software | Check inventory quantity |
| 3   | Software | Request the customer to update the cart, due to insufficient resources. |
| 4   | Customer | Update the cart |
| 5   | Software | Check inventory quantity |
| 6   | Customer | Fill in delivery information |
| 7   | Customer | Pay the order |
| 8   | Software | Confirm the transaction |
| 9   | Software | Confirm the order |

**Alternative flow 2:**

| #   | Doer | Action |
| --- | --- | --- |
| 1   | Customer | Request to place an order |
| 2   | Software | Check inventory quantity |
| 3   | Software | Request user to set up delivery information |
| 4   | Customer | Fill in delivery information |
| 5   | Customer | Select rush hour delivery |
| 6   | Software | Check for feasibility of rush hour delivery |
| 7   | Software | Request user to add more information for rush hour delivery |
| 8   | Customer | Fill in additional information |
| 9   | Customer | Pay the order |
| 10  | Software | Confirm the transaction |
| 11  | Software | Confirm the order |
