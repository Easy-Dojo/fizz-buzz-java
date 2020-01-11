- should return `special string`(Fizz|Buzz|Whizz) when number is divisible by `special number`(3|5|7)
    - Fizz ---- new FizzBuzz(6).toString
    - Buzz ---- new FizzBuzz(10).toString
    - Whizz ---- new FizzBuzz(14).toString
- should return `nutiple special string` when number is divisible by `multiple special number`
    - FizzBuzz ---- new FizzBuzz(60).toString        (3*5)*2*2
    - FizzWhizz ---- new FizzBuzz(21).toString       (3*7)
    - BuzzWhizz ---- new FizzBuzz(140).toString      (5*7)*2*2
    - FizzBuzzWhizz ---- new FizzBuzz(210).toString  (3*5*7)*2
- should return `Fizz` when number is contains `special number 3`
    - Fizz ---- new FizzBuzz(3).toString
    - Fizz ---- new FizzBuzz(13).toString
    - Fizz ---- new FizzBuzz(30).toString
- should return `special string ignore Fizz` when number is contains `special number 5`
    - Buzz ---- new FizzBuzz(15).toString
    - BuzzWhizz ---- new FizzBuzz(35).toString
    - BuzzWhizz ---- new FizzBuzz(105).toString
- should return `special string ignore Buzz` when number is contains `special number 7`
    - not contains 3
        - Fizz ---- new FizzBuzz(75).toString
        - Fizz ---- new FizzBuzz(270).toString
        - FizzWhizz ---- new FizzBuzz(1470).toString
    - contains 3
        - Fizz ---- new FizzBuzz(735).toString (3*5*7)*7
- should return number string when number is normal
    - 1 ---- new FizzBuzz(1).toString


Fizz: 被三整除/包含3 + 不包含5/包含5也包含7。

Buzz：被五整除 + 不包含7 + 不包含5也不包含3/包含5
 
Whizz：被七整除 + 不包含5也不包含3/包含5不包含7/包含5包含7不包含3
