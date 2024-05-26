# Spell Checker Application

This repository contains a Java application that implements a spell-checker. The application stores a lexicon of words in a set and includes a method, `spellChecker(a)`, to perform a spell check on a given string with respect to the set of words.

## Objective

The objective of this assignment is to develop a spell-checker that can identify correctly spelled words and suggest possible corrections for misspelled words by considering common types of misspellings.

## Features of the System

1. **Store Lexicon of Words**:
    - Stores a set of words, `Y`, in a Java `Set`.

2. **Spell Checker Method**:
    - Implements a method `spellChecker(a)` which performs the following:
      - If the word `a` is in the set `Y`, returns a list containing only `a`.
      - If the word `a` is not in the set `Y`, returns a list of words from `Y` that might be correct spellings of `a`.

3. **Handling Common Misspellings**:
    - Swapping adjacent characters in a word.
    - Inserting a single character between two adjacent characters in a word.
    - Deleting a single character from a word.
    - Replacing a character in a word with another character.

## Project Structure

- **Main.java**: The main Java file containing the implementation of the spell-checker application.

## How to Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/nisal2002/Spell-Checker.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd Spell-Checker
   ```

3. **Compile and run the Java program:**

   ```bash
   javac Main.java
   java Main
   ```

   The program will initialize the lexicon of words and perform spell checking based on the provided method.

## Implementation Details

### SpellChecker Class

- **Data Structures**:
  - Uses a `Set<String>` to store the lexicon of words, `Y`.

- **Methods**:
  - `spellChecker(String a)`: Performs spell check on the input string `a`.

### Spell Checking Logic

1. **Correct Spelling**:
   - If `a` is in the set `Y`, return a list containing only `a`.

2. **Possible Misspellings**:
   - Generate and check possible correct spellings by:
     - Swapping adjacent characters.
     - Inserting a character at each possible position.
     - Deleting each character from the word.
     - Replacing each character with every other possible character.

## Technologies Used

- Java

## Author

- [Author](nisal2002) - Initial work

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
