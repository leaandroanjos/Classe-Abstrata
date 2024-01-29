package br.com.leandro;

import java.util.Scanner;

public class Programa {

    public static void main(String arg[]){

        System.out.println("Preencher informações de: ");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        Scanner s = new Scanner(System.in);
        Integer ent = s.nextInt();
        if (ent == 1){
            informaPessoaFisica();
        } else if (ent == 2) {
            informaPessoaJuridica();
        } else {
            System.out.println("Entrada não identificada");
        }
    }

    private static void informaPessoaJuridica() {
        Scanner s = new Scanner(System.in);
        PessoaJuridica pessoa = new PessoaJuridica();
        System.out.println("Digite seu nome: ");
        String nome = s.next();
        pessoa.setNome(nome);
        System.out.println("Digite seu cnpj: ");
        Long cnpj = s.nextLong();
        pessoa.setCnpj(cnpj);
        System.out.println("Digite sua Inscrição Estadual: ");
        Long IE = s.nextLong();
        pessoa.setInscricaoEstadual(IE);
        System.out.println("O seu nome é: " + pessoa.getNome());
        System.out.println("O seu cnpj é: " + pessoa.getCnpj());
        System.out.println("A sua inscrição estadual é: " + pessoa.getInscricaoEstadual());
    }

    private static void informaPessoaFisica() {
        Scanner s = new Scanner(System.in);
        PessoaFisica pessoa = new PessoaFisica();
        System.out.println("Digite seu nome: ");
        String nome = s.next();
        pessoa.setNome(nome);
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        pessoa.setIdade(idade);
        System.out.println("Digite seu cpf: ");
        Long cpf = s.nextLong();
        pessoa.setCpf(cpf);
        System.out.println("O seu nome é: " + pessoa.getNome());
        System.out.println("A sua idade é: " + pessoa.getIdade());
        System.out.println("O seu cpf é: " + pessoa.getCpf());
    }

}
