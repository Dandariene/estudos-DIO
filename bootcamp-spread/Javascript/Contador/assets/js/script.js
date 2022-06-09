
var currentNumberWrapper = document.getElementById('currentNumber')
var currentNumber = 0

function increment() {

    if (currentNumber >= 20) {
        currentNumber.innerHTML = window.alert("Você chegou ao limite da contagem")
    } else {
        currentNumber = currentNumber + 1
        currentNumberWrapper.innerHTML = currentNumber
    }
}

function decrement() {
    if (currentNumber <= 0) {
        currentNumber.innerHTML = window.alert("Você chegou ao limite da contagem")
    } else {
        currentNumber = currentNumber - 1
        currentNumberWrapper.innerHTML = currentNumber
    }
}

