class Funcionario {

    //Atributo
    double salario = 0;

    //metodo com retorno
    Double calcularSalarioComDesconto(){
        double totalComDesconto = salario - 20;
        return totalComDesconto;

    }

}
class Scratch {
    public static void main(String[] args) {

        //Tela de funcionario
        Funcionario alane = new Funcionario();
        alane.salario = 1000;
        double salarioComDesconto =  alane.calcularSalarioComDesconto();
        System.out.println("Total com desconto: " + salarioComDesconto);
    }

}
