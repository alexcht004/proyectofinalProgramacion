# proyectofinalProgramacion

# CONTROLADOR


En esta parte lo que ponemos son las condiciones y enviando si las ordenes del usuario esta bien redactadas.

            cli.setRfc(frmc.txtRfc.getText());
             boolean bandera=false;
            cli.setTelefono(frmc.txtTelefono.getText());
            if(frmc.txtRfc.getText().length()!=13){
             JOptionPane.showMessageDialog(null,"el rfc debe tener 13 caracteres para ser válido");
