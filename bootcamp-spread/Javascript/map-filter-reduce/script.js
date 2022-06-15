//Map
const maca = {
    value: 2,
}

const laranja = {
    value: 3,
}

const pera = {
    value: 5,
}
function mapComThis(array, thisArg){
    return array.map(function(item){
       return item * this.value
    }, thisArg)
}

const nums = [1, 2]

console.log('this -> maça', mapComThis(nums, maca))

console.log('this -> laranja', mapComThis(nums, laranja))

console.log('this -> pera', mapComThis(nums, pera))

//-------------------------------------------------------------------//

function mapSemThis(array){
    return array.map(function(item){
        return item * 2
    })
}
const nums2 = [2, 4, 6, 8, 10, 18, 36]

console.log(mapSemThis(nums2))

//Filter

function filtraPares(array){
    return array.filter(function(item){
        return item % 2 === 0
    })
}

const nums3 = [1, 2, 3, 7, 8, 12, 13, 51, 24, 83, 15, 20]

console.log(filtraPares(nums3))

//Reduce