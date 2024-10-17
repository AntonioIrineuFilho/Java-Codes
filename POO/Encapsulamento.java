// public class Encapsulamento {
//     public static class ClienteBanco {
//         public String nome;
//         public double saldo;
//         public ClienteBanco(String nome, double saldo) {
//             this.nome = nome;
//             this.saldo = saldo;
//         }
//         // public double depositar(acrecimo) {
//         //     this.saldo = this.saldo + acrescimo;
//         //     return this.saldo;
//         // }
//     }
    
//     public static void main(String[] args) {
//         ClienteBanco cliente1 = new ClienteBanco("Antonio", 500);
//         cliente1.nome = "Joao"; // NÃO RECOMENDADO
//         System.out.println(cliente1.nome);
//     }
// }

public class Encapsulamento {
    public static class ClienteBanco {
        private String nome;
        private double saldo;
        public ClienteBanco(String nome, double saldo) {
            this.nome = nome;
            this.saldo = saldo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        // public double depositar(acrescimo) {
        //     this.saldo = this.saldo + acrescimo;
        //     return this.saldo;
        // }
    }

    public static void main(String[] args) {
        ClienteBanco cliente1 = new ClienteBanco("Antonio", 500);
        cliente1.setNome("João");
        System.out.println(cliente1.nome);
    }
}

/* o método de encapsulamento mais recomendado é o private, pois impede que os atributos sejam modificados
diretamente fora da classe, e aí para modificá-los seria necessário criar um método responsável por fazer 
essa modificação(setNome, nesse caso acima) */