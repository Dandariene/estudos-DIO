
function validaArray(array, number) {
    try {
        if (!array && !number) throw new ReferenceError('Envie os parâmetros')

        if (typeof array !== 'object') throw new TypeError('Array precisa se do tipo object')

        if (typeof number !== 'number') throw new TypeError('Number precisa se do tipo number')

        if (array.length !== number) throw new RangeError('Tamanho inválido')

        return array

    } catch (error) {
        if(error instanceof ReferenceError){
            console.log('Este erro é um ReferenceError')
            console.log(error.message)
        } else if (error instanceof TypeError){
            console.log('Este erro é um TypeError')
            console.log(error.message)
        }  else if (error instanceof RangeError){
            console.log('Este erro é um RangeError')
            console.log(error.message)
        } else {
            console.log('Tipo de erro não esperado:' + error)
        }
    }
}

console.log(validaArray())