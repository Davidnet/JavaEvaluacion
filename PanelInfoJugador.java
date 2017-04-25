import javax.swing.JPanel;

public class PanelInfoJugador extends JPanel implements ActionListener
{
    private static final int ALTURA = 300;

    private static final int ANCHO = 300;

    /**
     * La ruta de la imagen que muestra el panel cuando ni hay ningun jugador selecionado
     */
    private static final String IMAGEN = null;

    private InterfazLigaBolos principal;

    private Jugador jugadorac;

    private JPanel panelInformacion;

    private JPanel panelImagen;

    private ImageIcon icono;

    private JTextField txtNombreDelJugador;

    private JTextField txtPartidasJugadas;

    private JTextField txtPromedioPuntos;

    /**
     * Profesional
     */

    private JLabel labNombre;

    private JLabel labPartidasJugadas;

    private JLabel labPromedio;

    private JButton btnAgregarPuntaje;

}
