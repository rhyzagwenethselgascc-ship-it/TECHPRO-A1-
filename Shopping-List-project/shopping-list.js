// shopping_list.js

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const shoppingList = [];
let itemCount = 0;

console.log("Enter up to 5 items to buy:");

function askItem() {
  if (itemCount >= 5) {
    displayList();
    return;
  }

  rl.question(`Item ${itemCount + 1}: `, (input) => {
    const item = input.trim();

    if (item !== '') {
      shoppingList.push(item);
      itemCount++;
      askItem();
    } else {
      displayList(); // Stop early if input is blank
    }
  });
}

function displayList() {
  console.log("\nYour shopping list:");
  console.log(shoppingList.join(", "));

  console.log(`\nYou entered ${shoppingList.length} item(s).`);

  // Extra: search feature
  rl.question("\nSearch for an item: ", (searchTerm) => {
    if (shoppingList.includes(searchTerm.trim())) {
      console.log(`${searchTerm} is in your shopping list!`);
    } else {
      console.log(`${searchTerm} is NOT in your shopping list.`);
    }
    rl.close();
  });
}

askItem();
