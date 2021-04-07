### FizzBuzz logic
Java 8 provides the IntStream interface. We have used the following 
two methods of the IntStream interface.

rangeClosed() Method: Returns a sequential ordered

- In this method we specify the starting number (1) and ending 
number (100 or num)

mapToObj() Method: Returns an object-valued consisting of the 
results of applying the given function to the elements of this 
stream

- In this method we check if the number is divisible by 3 and 5 
to return "FizzBuzz", divisible only by 3 to return "Fizz", 
divisible only by 5 to return "Buzz" or else return the number itself

forEach Method: Performs an action for each element of this stream

- In this method we print the returned values