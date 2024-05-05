The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Create a repository in your GitHub account. Put your solution there. In the readMe file must include the problem statement, UML Class Diagram of Proposed solution.

Make sure you have a TestProgram that will validate the proposed refactored codes.


![Blank diagram (1)](https://github.com/lorenzalejandrino/Lab-Asssignment-6-OOP/assets/158862246/e8ed5917-c67f-45d5-845f-ce9a7d1885eb)

OUTPUT:
```
Borrowing book with title: The Hunger Games
Borrowing journal with title: Environmental Science & Technology
Borrowing book with title: Catching Fire
Borrowing journal with title: Journal of Economic Psychology
Borrowing newspaper with title: Philippine Daily Inquirer- May 5, 2024
Borrowing newspaper with title: The Philippine Star - May 5, 2024

Resources borrowed by Ace 1001:
The Hunger Games
Environmental Science & Technology

Resources borrowed by Ban 1002:
Catching Fire
Journal of Economic Psychology

Resources borrowed by Denice 1003:
Philippine Daily Inquirer- May 5, 2024
The Philippine Star - May 5, 2024

Resource with title 'The Hunger Games' not available.
```
