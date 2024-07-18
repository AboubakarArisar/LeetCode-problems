class Solution(object):
    def isHappy(self, n):
        visited = []  
        
        while n != 1 and n not in visited:
            visited.append(n)
            
            sum = 0
            while n != 0:
                digit = n % 10
                sum += digit * digit
                n //= 10
            n = sum
        
        return n == 1
