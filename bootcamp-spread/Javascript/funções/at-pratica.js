/*
Atividade 1: Alunos Aprovados
1.Crie uma função que recebe o array alunos e um número que irá representar a média final;
2.Percorra o array e popule um novo array auxiliar apenas com os alunos cujas notas são maiores ou iguais à média final;
3.Utilize a técnica "object destructuring" para manipular as propriedades desejadas de cada aluno.
*/

const alunos =  [
    {
        nome: 'João',
        nota: 5,
        turma:  '1B'
    },
    {
        nome: 'Maria',
        nota: 6,
        turma:  '1B'
    },
    {
        nome: 'Sofia',
        nota: 9,
        turma:  '2C'
    },
    {
        nome: 'Paulo',
        nota: 3,
        turma:  '1B'
    },
    {
        nome: 'Ana',
        nota: 5,
        turma:  '2C'
    }
]
function alunosAprovados(array, media){
    let aprovados =  []
    for(let i = 0; i <  array.length; i++){
        const {nota, nome} = array[i]
        if(nota >= media){
            aprovados.push(nome)
        }
    }
    return aprovados
}

console.log(alunosAprovados(alunos, 5))

/*
Atividade 2: This
Dada a função calculaIdade, utilize os métodos call e apply para modificar o valor de this. Crie seus próprios objetos para esta atividade!

function calculaIdade(anos) {
	return `Daqui a ${anos} anos, ${this.nome} terá ${
		this.idade + anos
	} anos de idade.`;
}
*/

function calculaIdade(anos) {
	return `Daqui a ${anos} anos, ${this.nome} terá ${
		this.idade + anos
	} anos de idade.`;
}

const pessoa1 = {
    nome: 'Ana',
    idade: 38
}

const pessoa2 = {
    nome: 'Pedro',
    idade: 30
}

const pessoa3 = {
    nome: 'Sara',
    idade: 19
}

const animal = {
    nome: 'Kika',
    idade: 8,
    raca: 'vira-lata'
}

//Usando call
console.log(calculaIdade.call(pessoa1, 28))
console.log(calculaIdade.call(pessoa2, 50))
console.log(calculaIdade.call(pessoa3, 16))
console.log(calculaIdade.call(animal, 5))

//usando apply
console.log(calculaIdade.apply(pessoa1, [8]))
console.log(calculaIdade.apply(pessoa2, [12]))
console.log(calculaIdade.apply(pessoa3, [18]))
console.log(calculaIdade.apply(animal,[3]))