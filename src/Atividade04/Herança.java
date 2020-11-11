package Atividade04;


public class Herança {
   
    public static void main(String[] args) {

        Cliente C = new Cliente();

        C.setNome("Igor Almeida");
        C.setCPF("454.950.684-30");
        C.setTelefone("(11)4002-8922");
        C.setEmail("igor@almeida.com");
        C.setDataNascimento("15/04/1997");
        C.setClienteDesde("02/06/2020");

        C.setclienteDesde("01 de Fevereiro de 2019");

        System.out.println("Nome: " + C.getNome()
                + "\nCPF: " + C.getCPF()
                + "\nTelefone: " + C.getTelefone()
                + "\nEmail: " + C.getEmail()
                + "\nData de Nascimento: " + C.getDataNascimento()
                + "\nCliente desde: " + C.getClienteDesde()
                + "\nCliente desde: " + C.getclienteDesde());

        Funcionario F = new Funcionario();

        F.setNome("Robertinho Saraiva");
        F.setCPF("638.666.999-00");
        F.setTelefone("(11)4042-8912");
        F.setEmail("robertinhoPedeMlk@meme.com");
        F.setDataNascimento("06/06/1996");
        F.setClienteDesde("03/01/2019");

        F.setRegistro("20475");
        F.setCarteiraTrabalho("Analista de Sistema");
        F.setPis("202.33259.50-4");

        System.out.println("\n\nNome: " + F.getNome()
                + "\nCPF: " + F.getCPF()
                + "\nTelefone: " + F.getTelefone()
                + "\nEmail: " + F.getEmail()
                + "\nData de Nascimento: " + F.getDataNascimento()
                + "\nCliente desde: " + F.getClienteDesde()
                + "\nRegistro: " + F.getRegistro()
                + "\nCarteira de Trabalho: " + F.getCarteiraTrabalho()
                + "\nPis: " + F.getPis());

    }

}
