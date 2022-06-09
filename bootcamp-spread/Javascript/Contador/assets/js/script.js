
var currentNumberWrapper = document.getElementById('currentNumber')
var currentNumber = 0

function increment() {

    (currentNumber >= 20) 
    ? currentNumber.innerHTML = window.alert("Você chegou ao limite da contagem")
    : currentNumber = currentNumber + 1
    currentNumberWrapper.innerHTML = currentNumber
   
}

function decrement() {
    (currentNumber <= 0) 
    ? currentNumber.innerHTML = window.alert("Você chegou ao limite da contagem")
    : currentNumber = currentNumber - 1
    currentNumberWrapper.innerHTML = currentNumber
}

