/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: function(value){
        
            if (val!==value) {
                throw new Error("Not Equal");
            } else {
                return true;
            }
        },
        notToBe: function(value){
         
            if (val === value) {
                throw new Error("Equal");
            } else {
                return true;
            }
        }
    };
};

