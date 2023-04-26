def calculate_total_price(item_prices_):
    total_price = sum(item_prices_)
    return total_price


# Test the calculate_total_price function with an example list of item prices
item_prices = [10, 5, 2, 8]  # sum == 25

expected_total_price = 25  # Change this value for checking how to use "assert"
actual_total_price = calculate_total_price(item_prices)

# Use assert to check that the actual total price matches the expected total price
assert (
    actual_total_price == expected_total_price
), f"Expected total price of {expected_total_price}, but got {actual_total_price}"
