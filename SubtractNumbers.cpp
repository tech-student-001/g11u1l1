#include <iostream>
using namespace std;

int main() {
    int num1, num2;
    
    cout << "Enter first number: ";
    cin >> num1;
    
    cout << "Enter second number: ";
    cin >> num2;
    
    if (num2 <= num1) {
        int result = num1 - num2;
        cout << "Result: " << result << endl;
    } else {
        cout << "Error: Second number must be smaller than or equal to the first number." << endl;
    }
    
    return 0;
}
