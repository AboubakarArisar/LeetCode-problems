class Solution(object):
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False
        
        char_map = {}
        char_map_reverse = {}
        
        for char_s, char_t in zip(s, t):
            if char_s in char_map:
                if char_map[char_s] != char_t:
                    return False
            else:
                char_map[char_s] = char_t
            
            if char_t in char_map_reverse:
                if char_map_reverse[char_t] != char_s:
                    return False
            else:
                char_map_reverse[char_t] = char_s
        
        return True
