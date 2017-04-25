public PanelInfoJugador(InterfazLigaBolos interfazLigaBolos)
{
    TitledBorder border = BorderFactory.createTitledBorder("Información");
    setBorder( border );
    setLayout(new GridLayout(2,1);
    ImageIcon icon = new IMageIcon(pJugador.darrutamImagen());
    Jlabel thumb = new JLabel;
    add(thumb);
	panelInfo.setLayout(new GridLayout(5,2);
	txtNOmbreDelJugador = new JTextField(pJUgador.darNombre())
	txtPArtidasJugadas = new JTextFiled(pJugador.darPartidasJUgadas());
	txtPromedioPuntos = new JTextFiled(pJugador.darPromedioPuntos());
	txtvaio = new JTextFiled("");
	add(labNOmbre);
	add(LabPArtidasJugadas)
	add(LabPromedio)
	add( new JLabel vacio);
	add( txtNombreDelJugaor);
	add( txtPArtidasJugadas)
	add( txtPromedioPuntos);
	add( new JCheckbox profesional)
	add( btnAgregarPuntaje);
	

        }
} 
