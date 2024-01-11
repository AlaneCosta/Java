class Funcionario {

    //Atributo
    double salario = 0;

    //método com retorno
    //método com parâmetro
    Double calcularSalarioComDesconto(double bonus){
        double totalComDesconto = salario - 20 + bonus;
        return totalComDesconto;

    }

}
class Scratch {
    public static void main(String[] args) {

        //Tela de funcionario
        Funcionario alane = new Funcionario();
        alane.salario = 1000;
        double salarioTotal =  alane.calcularSalarioComDesconto(80);

        System.out.println("Total salário: " + salarioTotal);
      
    }

}
