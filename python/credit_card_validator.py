cardNumber = input ("Hello, kindly Enter Card details to verify: ")
sumOfEvenAndOdd = 0
evenSum = 0
oddSum = 0
index = 0

for index in range(len(cardNumber)):
	index = index + 1
if index > 16 or index < 13:
	print("invalid card number")
elif cardNumber[0] == '4':
	print("Card Type: Visa Card")
	print(f"Credit card Number: {cardNumber}")
	print(f"Credit Card Digit Length: {index}" )
	numberCardNumber = int(cardNumber)

	while numberCardNumber != 0:
		newNumber = numberCardNumber % 10
		numberCardNumber = numberCardNumber / 10
		index = index + 1

		if index % 2 == 0:
			digit = newNumber * 2

			if digit > 9:
				value1 = digit / 10
				value2 = digit % 10
				evenSum = evenSum + value1 + value2

			else:
				evenSum = evenSum + digit
		else :
			oddDigit = newNumber
			oddSum = oddSum + oddDigit
	sumOfEvenAndOdd = evenSum + oddSum
	if sumOfEvenAndOdd % 10 == 0:
		print("Credit Card Validity Status: Valid")
	else:
		print("Credit Card Validity Status: invalid")

elif cardNumber[0] == '5':
	print("Card Type: Master Card")
	print(f"Credit card Number: {cardNumber}")
	print(f"Credit Card Digit Length: {index}")
	numberCardNumber = int(cardNumber)

	while numberCardNumber != 0:
		newNumber = numberCardNumber % 10
		numberCardNumber = numberCardNumber / 10
		index = index + 1

		if index % 2 == 0:
			digit = newNumber * 2
			if digit > 9:
				value1 = digit / 10
				value2 = digit % 10
				evenSum = evenSum + value1 + value2
			else:
				evenSum = evenSum + digit
		else:
			oddDigit = newNumber
			oddSum = oddSum + oddDigit
	sumOfEvenAndOdd = evenSum + oddSum
	if sumOfEvenAndOdd % 10 == 0:
		print("Credit Card Validity Status: Valid")
	else:
		print("Credit Card Validity Status: invalid")

elif cardNumber[0] == '6':
	print("Card Type: Discover Card")
	print(f"Credit card Number: {cardNumber}")
	print(f"Credit Card Digit Length: {index}")
	numberCardNumber = int(cardNumber)

	while numberCardNumber != 0:
		newNumber = numberCardNumber % 10
		numberCardNumber = numberCardNumber / 10
		index = index + 1

		if index % 2 == 0:
			digit = newNumber * 2
			if digit > 9:
				value1 = digit / 10
				value2 = digit % 10
				evenSum = evenSum + value1 + value2
			else :
				evenSum = evenSum + digit
		else :
			oddDigit =  newNumber
			oddSum = oddSum + oddDigit
	sumOfEvenAndOdd = evenSum + oddSum
	if sumOfEvenAndOdd % 10 == 0:
		print("Credit Card Validity Status: Valid")
	else:
		print("Credit Card Validity Status: invalid")

elif cardNumber[0] == '3' and cardNumber[1] == '7':
	print("Card Type: American Express card")
	print(f"Credit card Number: {cardNumber}")
	print(f"Credit Card Digit Length: {index}")
	numberCardNumber = int (cardNumber)

	while numberCardNumber != 0:
		newNumber = numberCardNumber % 10
		numberCardNumber = numberCardNumber / 10
		index = index + 1

		if index % 2 == 0:
			digit = newNumber * 2
			if digit > 9:
				value1 = digit / 10
				value2 = digit % 10
				evenSum = evenSum + value1 + value2
			else :
				evenSum = evenSum + digit
		else :
			oddDigit =  newNumber
			oddSum = oddSum + oddDigit
	sumOfEvenAndOdd = evenSum + oddSum
	if sumOfEvenAndOdd % 10 == 0:
		print("Credit Card Validity Status: Valid")
	else:
		System.out.println("Credit Card Validity Status: invalid")

else:
	print("Your card is not a valid card")
	print(f"Credit card Number: {cardNumber}")
	print(f"Credit Card Digit Length: {index}")