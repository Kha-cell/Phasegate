// 1. Initialize score to 0
2. Repeat 10 times 
3 Generate random numbers num1 and num2
4 Generate random operator / + -*
 5 Display question: num1 operator num2
 6 Get user  answer
  7  Check if answer is correct:
  8  If yes, increment score and display Correct
  9 If no  display  failed Try again?
  10   Get user  answer again
  11   Check if answer is correct:
 12  If yes, increment score and display Correct 
13 If no  display put more effort on next Trial
14  Display final score //

import random

def main():
    score = 0
    for i in range(10):
        num1 = random.randint(0, 9)
        num2 = random.randint(0, 9)
        ops = ['+', '-', '*', '/']
        op = random.choice(ops)

        print(f"What is {num1} {op} {num2}?")
        user_answer = int(input())

        if op == '+':
            correct_answer = num1 + num2
        elif op == '-':
            correct_answer = num1 - num2
        