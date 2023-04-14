if __name__ == '__main__':
    word = ['M', 'I', 'S', 'S', 'I', 'S', 'S', 'I', 'P', 'I']
    number = 0
    for letters in word:
        if letters == 'S':
            number += 1
        if letters == "I":
            number += 1

    print(number)
            # number_of_times = letters
            # len(number_of_times)
            # sum += number_of_times
            # print(len(number_of_times))
