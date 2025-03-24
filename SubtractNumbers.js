let num1 = parseInt(prompt("Enter first number: "));
let num2 = parseInt(prompt("Enter second number: "));

if (num2 <= num1) {
    let result = num1 - num2;
    console.log("Result:", result);
} else {
    console.log("Error: Second number must be smaller than or equal to the first number.");
}
