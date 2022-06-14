
const calc = function(operacao, num1, num2){
    return operacao(num1, num2)
}

const soma  = function(num1, num2){
    return num1 + num2
}

const  subt = function(num1, num2){
    return num1 - num2
}

console.log(resultSoma = calc(soma, 1, 5))
console.log(resultSubt = calc( subt, 8, 5))