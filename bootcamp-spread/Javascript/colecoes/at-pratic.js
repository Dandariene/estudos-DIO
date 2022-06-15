//atividade 1

function getAdmin(map){
    let admins = []
    for([key, value] of map){
        if(value === 'Admin'){
            admins.push(key)
        }
    }
    return admins
}

const usuarios = new Map()

usuarios.set('Maria', 'Admin')
usuarios.set('Ana', 'User')
usuarios.set('João', 'Admin')
usuarios.set('Laura', 'User')
usuarios.set('Gustavo', 'Admin')
usuarios.set('Luiz', 'Admin')
usuarios.set('Beatriz', 'User')

console.log(getAdmin(usuarios))


//atividade 2

const meuArray = [30, 30, 40, 5, 223, 2049, 3034, 5]

function valoresUnicos(array){
    const mySet = new Set(array)

    return[...mySet]
}

console.log(valoresUnicos(meuArray))

