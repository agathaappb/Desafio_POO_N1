import java.time.LocalDate

fun main(){
        val funcionario= Funcionario("Agatha","Desenvolvedor", 3001.00)
        val calculaFolha = FolhaPagamento(funcionario)

        println(calculaFolha.calcularPagamento())


}