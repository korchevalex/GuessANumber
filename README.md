# GuessANumber
A console game where you guess a random number with hints from the computer
# Solution
After generating a random number for the computer the player starts guessing and recieves hints based on his input through multiple checks. When the player guesses the correct number they are asked whether to continue to the next level or end the game. Going to the next level increases the random number range. We achieve this through two while loops one for when the level is increased and one for every guess.
# Input and Output
First we recieve the player's choice for the hot/cold system. If it is turned on the computer gives an extra proximity hint in the form of temperature. After that we output the current level and computer number range. Then the player can start guessing. We check the input to make sure it is a number and then we either print that it is invalid or continue on to the hint checks. Upon guessing the correct number the player is prompted to continue to the next level. If they so choose we start the next level or print a message before ending the game. 
[Source code](GuessANumber.java)
# Screenshots
![image](https://user-images.githubusercontent.com/122821827/215315866-1bbc7517-c1de-4cbf-956f-c271734a1583.png)
![image](https://user-images.githubusercontent.com/122821827/215315984-4ddf350d-717b-42b5-8ec9-95b71832c4cd.png)
![image](https://user-images.githubusercontent.com/122821827/215315936-0ee4a1d8-5eb9-41db-b030-b11d3ef3509a.png)
