double x = x + x

twice x = 2 * x

square x = x * x

abs x = if x >= 0 then x else -x

signum x = if x < 0 then - 1 else
	if x==0 then 0 else 1

fact1 0 = 1

abs1 x | x >= 0 = x
	   | otherwise = -x

signum1 x | x < 0 = -1
		  | x == 0 = 0
		  | otherwise = 1

fact n = if n==0 then 1 else
			fact (n-1) * n

fact1 0 = 1
fact1 n = fact (n-1) * n

sumAll [] = 0
sumAll (x:xs) = x + sumAll xs