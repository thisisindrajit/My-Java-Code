# Vending Machine

## Operations
- Must handle different product types and track remaining stock
  - Each product has an sku, name, price, category, count
  - Inventory must track the list of products and remaining quantities for products
- Must handle different payment methods (Cash, Card)
- Must move between different states

## Key Components
- VendingMachine (Single Instance)
- Inventory (Single Instance)
- Item
- State
  - IdleState
  - ItemSelectedState
  - PaymentProcessingState
  - DispensingState
  - OutOfStockState
- Payment
    - Cash
    - Card

## Approach
- Singleton pattern for VendingMachine and Inventory
- State pattern for handling different states
- Strategy pattern for handling different payment methods

## References
- [Vending Machine - Ashish Pratap Singh](https://github.com/ashishps1/awesome-low-level-design/tree/main/solutions/java/src/vendingmachine)
- [Vending Machine - CodeWithAryan](https://codewitharyan.com/tech-blogs/design-vending-machine)


