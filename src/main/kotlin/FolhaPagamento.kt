import sun.security.ec.point.ProjectivePoint

class FolhaPagamento(funcionario: Funcionario) {

    val funcionario: Funcionario = funcionario

    fun calcularPagamento(): kotlin.collections.MutableList<String>{
        var salarioFinal:Double = 0.0
        when (funcionario.cargo){

            "Desenvolvedor" -> if (funcionario.salario > 3000) {
                                    salarioFinal = funcionario.salario * 0.8

                                    } else {
                                    salarioFinal = funcionario.salario* 0.9

                                    }
            "DBA" ->            if(funcionario.salario > 2500){
                                     salarioFinal = funcionario.salario *0.75

                                    } else {
                                        salarioFinal = funcionario.salario * 0.85

                                    }
            "Gerente" ->        if(funcionario.salario > 7000){
                                    salarioFinal = funcionario.salario * 0.77

                                    }else{
                                        salarioFinal = funcionario.salario* 0.82

                                    }
        }
        var listPagamento = mutableListOf<String>(funcionario.name, funcionario.cargo)
        listPagamento.add(2,salarioFinal.toString())
        return listPagamento
    }

}