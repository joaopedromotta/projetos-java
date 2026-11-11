
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class CadastroPaciente extends JFrame {

    private ArrayList<Paciente> pacientes = new ArrayList<>();

    private final String ARQUIVO = "pacientes.dat";

    private CardLayout cardLayout;
    private JPanel telas;

    private JTextField campoNome;
    private JTextField campoIdade;
    private JTextField campoTelefone;

    private DefaultTableModel modeloTabela;

    public CadastroPaciente() {

        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        telas = new JPanel(cardLayout);

        criarTelaCadastro();
        criarTelaListagem();

        add(telas);

        carregarPacientes();

        atualizarTabela();

        cardLayout.show(telas, "cadastro");
    }

    private void criarTelaCadastro() {

        JPanel painel = new JPanel(new GridLayout(6, 2, 10, 10));

        painel.setBorder(
            BorderFactory.createEmptyBorder(30, 40, 30, 40)
        );

        campoNome = new JTextField();
        campoIdade = new JTextField();
        campoTelefone = new JTextField();

        JButton botaoSalvar = new JButton("Cadastrar");
        JButton botaoListar = new JButton("Listar pacientes");

        painel.add(new JLabel("Nome:"));
        painel.add(campoNome);

        painel.add(new JLabel("Idade:"));
        painel.add(campoIdade);

        painel.add(new JLabel("Telefone:"));
        painel.add(campoTelefone);

        painel.add(new JLabel(""));
        painel.add(botaoSalvar);

        painel.add(new JLabel(""));
        painel.add(botaoListar);

        botaoSalvar.addActionListener(e -> cadastrarPaciente());

        botaoListar.addActionListener(e -> {
            atualizarTabela();
            cardLayout.show(telas, "listagem");
        });

        telas.add(painel, "cadastro");
    }


    private void criarTelaListagem() {

        JPanel painel = new JPanel(new BorderLayout(10, 10));

        modeloTabela = new DefaultTableModel(
            new String[]{"Nome", "Idade", "Telefone"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable tabela = new JTable(modeloTabela);

        JButton botaoVoltar = new JButton("Voltar ao cadastro");

        botaoVoltar.addActionListener(e -> {
            cardLayout.show(telas, "cadastro");
        });

        painel.add(new JScrollPane(tabela), BorderLayout.CENTER);
        painel.add(botaoVoltar, BorderLayout.SOUTH);

        telas.add(painel, "listagem");
    }

    private void cadastrarPaciente() {

        try {

            String nome = campoNome.getText();
            String idadeTexto = campoIdade.getText();
            String telefone = campoTelefone.getText();

            int idade = Integer.parseInt(idadeTexto);

            Paciente paciente = new Paciente(
                nome, idade, telefone
            );

            pacientes.add(paciente);

            salvarPacientes();

            limparCampos();

            atualizarTabela();

            JOptionPane.showMessageDialog(
                this,
                "Paciente cadastrado com sucesso!"
            );

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                this,
                "A idade deve ser um número inteiro.",
                "Erro de entrada",
                JOptionPane.ERROR_MESSAGE
            );

        } catch (IllegalArgumentException e) {

            JOptionPane.showMessageDialog(
                this,
                e.getMessage(),
                "Dados inválidos",
                JOptionPane.ERROR_MESSAGE
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                this,
                "Erro inesperado: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void atualizarTabela() {

        modeloTabela.setRowCount(0);

        for (Paciente paciente : pacientes) {

            modeloTabela.addRow(new Object[]{
                paciente.getNome(),
                paciente.getIdade(),
                paciente.getTelefone()
            });
        }
    }

    private void limparCampos() {

        campoNome.setText("");
        campoIdade.setText("");
        campoTelefone.setText("");
    }

    private void salvarPacientes() {

        try (DataOutputStream saida = new DataOutputStream(
                new FileOutputStream(ARQUIVO))) {

            saida.writeInt(2026);
            saida.writeInt(pacientes.size());

            for (Paciente paciente : pacientes) {
                saida.writeUTF(paciente.getNome());
                saida.writeInt(paciente.getIdade());
                saida.writeUTF(paciente.getTelefone());
            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                this,
                "Não foi possível salvar os pacientes: " + e.getMessage(),
                "Erro de armazenamento",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void carregarPacientes() {

        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            return;
        }

        try (DataInputStream entrada = new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream(arquivo)))) {


            int quantidade = entrada.readInt();

            if (quantidade < 0 || quantidade > 100000) {
                throw new IOException("Quantidade de registros inválida.");
            }

            ArrayList<Paciente> carregados = new ArrayList<>();

            for (int i = 0; i < quantidade; i++) {

                String nome = entrada.readUTF();
                int idade = entrada.readInt();
                String telefone = entrada.readUTF();

                carregados.add(
                    new Paciente(nome, idade, telefone)
                );
            }

            if (entrada.read() != -1) {
                throw new IOException("Arquivo contém dados extras.");
            }

            pacientes.addAll(carregados);

        } catch (IOException | IllegalArgumentException e) {

            JOptionPane.showMessageDialog(
                this,
                "Não foi possível carregar os pacientes: "
                    + e.getMessage(),
                "Erro ao carregar",
                JOptionPane.ERROR_MESSAGE
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                this,
                "Erro inesperado ao carregar os dados.",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
