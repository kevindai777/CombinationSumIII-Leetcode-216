//Objective is, given 'n' and 'k', which represent the number of elements in the output
//and the target value that the elements add up to, to find all unique combinations from 
//1 - 9.

let k = 3 
let n = 7


//O() solution

let temp = []
let result = []
let sum = 0
let index = 1

backtrack(temp, sum, index)

function backtrack(temp, sum, index) {
    if (sum > n || temp.length > k) {
        return
    }

    if (sum == n && temp.length == k) {
        result.push([...temp])
        return
    }

    for (let i = index; i <= 9; i++) {
        temp.push(i)
        backtrack(temp, sum + i, i + 1)
        temp.pop()
    }
}

return result