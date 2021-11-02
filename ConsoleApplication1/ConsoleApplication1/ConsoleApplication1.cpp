/*
 * Calculator.cpp
 *
 *  Date: 21069
 *  Author: Christian J. Busca
 */

#include <iostream>

using namespace std;

int main()
{
	char statement[100];
	int op1, op2;
	char operation;
	char answer = 'y'; //missing semicolon and since it's a char should be in single quote instead of double
	while (answer == 'y')
	{
		cout << "Enter expression" << endl;
		cin >> op2 >> operation >> op1;
		if (operation == '+') //changed from double to single quotes due to the nature of this char also if statements don't function with a semicolon 
			cout << op1 << " + " << op2 << " = " << op1 + op2 << endl; //changed >> to << after op2
		if (operation == '-') //if statements don't function with a semicolon 
			cout << op1 << " - " << op2 << " = " << op1 - op2 << endl; //simple fix changed >> on cout to <<
		if (operation == '*')
			cout << op1 << " / " << op2 << " = " << op1 * op2 << endl; //missing semicolon
		if (operation == '/')
			cout << op1 << " * " << op2 << " = " << op1 / op2 << endl;

		cout << "Do you wish to evaluate another expression? " << endl;
		cin >> answer;
	}
}
