# shopping_list.py

def main():
    print("Enter up to 5 items to buy:")

    shopping_list = []

    for i in range(5):
        item = input(f"Item {i + 1}: ").strip()
        if item:
            shopping_list.append(item)
        else:
            break  # stop input if user presses enter without typing

    print("\nYour shopping list:")
    print(", ".join(shopping_list))

    print(f"\nYou entered {len(shopping_list)} item(s).")

    # Extra: Search for an item
    search_item = input("\nSearch for an item: ").strip()
    if search_item in shopping_list:
        print(f"{search_item} is in your shopping list!")
    else:
        print(f"{search_item} is NOT in your shopping list.")

if __name__ == "__main__":
    main()
