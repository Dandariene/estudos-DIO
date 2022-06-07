

//Isso é um comentário de linha

/*
Esse é um comentário
de várias linhas
*/

// function soma(a,b){
//     console.log(a +b )
//    // return a + b;
// }

// soma(5, 6)

// console.log('Hello world!')

function retornaPares(array){
    let numerosPares = []
    for(let i = 0 ; i < array.length; i++){
        if(array[i] % 2 === 0){
            numerosPares.push(array[i])
        }else{
            console.log(`${array[i]} não é par`)
        }
    }
    console.log('Esses são os números pares',numerosPares)
}

let array = [0, 2, 4, 5, 6, 7, 8, 10, 11, 12, 15]

retornaPares(array)