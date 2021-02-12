Feature: Start new game
 as a player,
 i want to be able to start a game of lingo,
 in order to train for tv

 Scenario: A player starts a game
  When a player clicks start
  Then the word to guess should have 5 letters


Feature: Start new round
 as a player,
 i want to be able to start a new round,
 in order to increase my score for this game

 Scenario Outline: A new round gets started
  Given a game is active
   And the round was won
   And the last word had "<previous length>" letters
   When a new round is started
   Then the word to guess has "<next length>" letters

   Examples:
     | previous length | next length |
     | 5               | 6           |
     | 6               | 7           |
     | 7               | 5           |

  # Failure path
   Given I am playing a game
   And the round was lost
   Then I cannot start a new round


Feature: Resume game
 as a player,
 i want to be able to resume a game,
 in order to continue where i left off


Feature: Guess word
 as a player,
 i want to be able to guess words,
 in order to see if my answer is correct

Scenario Outline: Guessing a word
  Given a game is active
  When the Guess is "<guess>"
  And the word is "<word>"
  Then the feedbaback should be "<feedback>"

# present = -
# absent = x
# correct = o

  Examples:
    | guess     | word     | feedback      |
    | fringe    | fridge   | o,o,o,x,o,o   |
    | later     | balls    | -,o,x,x,x     |
    | bearded   | running  | x,x,x,-,x,x,x |