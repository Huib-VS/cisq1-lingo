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

 Scenario: A new round gets started
  Given a game is active
   And the round was won
   And the last word had "<previous length>" letters
   When a new round is started
   Then the word to guess has "<next length>" letters



Feature: Resume game
 as a player,
 i want to be able to resume a game,
 in order to continue where i left off


Feature: Guess word
 as a player,
 i want to be able to guess words,
 in order to see if my answer is correct
