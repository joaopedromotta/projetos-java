
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            try {

                CadastroPaciente sistema = new CadastroPaciente();
                sistema.setVisible(true);

            } catch (Exception e) {

                System.err.println(
                    "Não foi possível iniciar o sistema: "
                    + e.getMessage()
                );
            }
        });
    }
}
