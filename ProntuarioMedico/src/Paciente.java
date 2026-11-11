public class Paciente {

    private String nome;
    private int idade;
    private String telefone;

    public Paciente(String nome, int idade, String telefone) {
        setNome(nome);
        setIdade(idade);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 3) {
            throw new IllegalArgumentException(
                "O nome deve possuir pelo menos 3 caracteres."
            );
        }

        this.nome = nome.trim();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException(
                "A idade deve estar entre 0 e 120 anos."
            );
        }

        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null ||
            !telefone.matches("[0-9()+ -]{8,20}")) {

            throw new IllegalArgumentException(
                "Informe um telefone valido."
            );
        }

        this.telefone = telefone.trim();
    }
}