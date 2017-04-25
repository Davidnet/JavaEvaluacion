public void actionPerformed (ActionEvent pEvento){
    String comando = pEvento.getActionCommadn();
    if(comando.equal( AGREGAR_PUNTAJE )){
        {
            principal.agregarpuntajea( pjugadorac );
            /*
             * Paso a la interfaz el jugador actual, y ejecuta una función que añade +1 al promedio de puntos
             */
        }
    }
}
