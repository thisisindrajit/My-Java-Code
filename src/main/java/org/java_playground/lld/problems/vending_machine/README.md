# Vending Machine

## Operations
- Must handle different product types and track remaining stock
  - Each product has a id, name, price, category
  - Inventory must track the list of products and remaining quantities for products
- Must handle different payment methods (Cash [Coins only], Card, UPI)
- Must move between different states (Idle, ItemSelection, PaymentPending, Dispensing, Maintenance)

## Key Components
- VendingMachine (Single Instance)
- Item
- Inventory
- State
  - IdleState
  - ItemSelectionState
  - PaymentPendingState
  - DispensingState
  - MaintenanceState
- Payment
    - Cash
    - Card
    - Upi

## Approach
- Singleton pattern for VendingMachine
- State pattern for handling different states
- Strategy pattern for handling different payment methods

## References
- [Vending Machine - Ashish Pratap Singh](https://github.com/ashishps1/awesome-low-level-design/tree/main/solutions/java/src/vendingmachine)
- [Vending Machine - CodeWithAryan](https://codewitharyan.com/tech-blogs/design-vending-machine)


