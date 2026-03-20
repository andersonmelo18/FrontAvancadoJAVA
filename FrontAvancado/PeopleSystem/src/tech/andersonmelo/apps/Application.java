package tech.andersonmelo.apps;

import tech.andersonmelo.pessoas.Cliente;
import tech.andersonmelo.auxi.Endereco;
import tech.andersonmelo.pessoas.Funcionario;

public class Application {
    public static void main(String[] args) {
        // Criar endereço do Cliente
        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setRua("Rua A");
        enderecoCliente.setNumero("123");
        enderecoCliente.setCidade("São Paulo");
        enderecoCliente.setEstado("SP");
        enderecoCliente.setCep("01310-100");
        
        // Criar e preencher objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        cliente.setDataNascimento("15/05/1990");
        cliente.setEndereço(enderecoCliente);
        cliente.setTelsContato("(11) 98765-4321");
        cliente.setCodigo("CLI001");
        cliente.setProfissao("Engenheiro");
        
        // Imprimir dados do Cliente
        System.out.println("===== DADOS DO CLIENTE =====");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Endereço: " + cliente.getEndereço());
        System.out.println("Telefone: " + cliente.getTelsContato());
        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Profissão: " + cliente.getProfissao());
        System.out.println();
        
        // Criar endereço do Funcionário
        Endereco enderecoFuncionario = new Endereco();
        enderecoFuncionario.setRua("Avenida B");
        enderecoFuncionario.setNumero("456");
        enderecoFuncionario.setCidade("Rio de Janeiro");
        enderecoFuncionario.setEstado("RJ");
        enderecoFuncionario.setCep("20040020");
        
        // Criar e preencher objeto Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria Santos");
        funcionario.setDataNascimento("22/08/1985");
        funcionario.setEndereço(enderecoFuncionario);
        funcionario.setTelsContato("(21) 99876-5432");
        funcionario.setMatricula(1001);
        funcionario.setCargo("Gerente de Projetos");
        funcionario.setSalario(5000.00);
        funcionario.setDataAdmissao("10/01/2020");
        
        // Imprimir dados do Funcionario
        System.out.println("===== DADOS DO FUNCIONÁRIO =====");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Endereço: " + funcionario.getEndereço());
        System.out.println("Telefone: " + funcionario.getTelsContato());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
    }
}