public void actualizar (Jugador pJugador)
{
    txtNombreDelJugador.setText( pJugador.darNombreJugador())
        txtPartidasJugadas.setText( pJugador.darCantidadPartidasJugadas())
        txtPromedioPuntos.setText( pJugador.darPromedioPuntos());
}
