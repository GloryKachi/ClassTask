if __name__ == '__main__':
    year = 2023
    month = 'October'
    day = 13

    wrong_answer = False

    while not wrong_answer:
        guess_day = int(input("Guess my birthday "))
        if guess_day != day:
            print("Incorrect Guess. Try again")
        elif guess_day == day:
            print(f"Correct guess! My birthday is {day}th {month} {year}")
            break
