# proyectofinalProgramacion


public class menu extends javax.swing.JFrame {

    /**
     * Crear la formade menu
     */
    public menu() {
        initComponents();
        setTitle("Bienvenido al mejor Almacen del mundo");
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // ASOCIA LOS BOTONES Y LAS ACCIONES ASOCIADAS A LOS BOTONES
    
    
    
    
    private void initComponents() {
    // CREA LOS BOTONES
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();

        btnCitas = new javax.swing.JButton();

        btnEmpleados = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
// ESTABLECE LAS ACCIONES DE LOS BOTONES
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });


En esta parte diseñamos los botones de nuestra aplicación tanto su pocion vertical y horizontal.

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                    
                

                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                    
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );



        */

        btnEmpleados.getAccessibleContext().setAccessibleParent(btnEmpleados);

        pack();
    }


En esta parte declaclaramos los botones 


    // Declarar las variables  no se debe modificar
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientes;

    private javax.swing.JButton btnEmpleados;

    private javax.swing.JButton btnProductos;
