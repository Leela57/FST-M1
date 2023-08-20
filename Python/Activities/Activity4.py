player1 = input("Enter the name of player1 : ")
player2 = input("Enter the name of player2 : ")
while True:
    p1value = input(player1 + " Enter Rock, Paper or Scissors : ")
    p2value = input(player2 + " Enter Rock, Paper or Scissors : ")
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
    userValue = input("Want to play game again type Yes/No: ")
    if userValue == "Yes":
        pass
    elif userValue == "No":
        raise SystemExit
    else:
        print("Entered an invalid option")
        raise SystemExit

