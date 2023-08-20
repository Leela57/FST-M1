player1 = input("Enter the name of player1 : ")
player2 = input("Enter the name of player2 : ")
p1value = input(player1 + " Enter Rock, Paper or Scissors : ")
p2value = input(player2 + " Enter Rock, Paper or Scissors : ")
"""if p1value == p2value:
    print("It's a tie!")
elif ((p1value == "Rock" and p2value == "Scissors") or
        (p1value == "Scissors" and p2value == "Paper") or
        (p1value == "Paper" and p2value == "Rock")):
    print(player1 + ", Wins the game!")
else:
    print(player2 + ", Wins the game!")"""
if p1value == p2value:
    print("It's a tie!")
elif p1value == 'rock':
    if p2value == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif p1value == 'scissors':
    if p2value == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif p1value == 'paper':
    if p2value == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
