package employeequotation;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

class Empleado{
    private String apellidoNombre;
    private int anios;
    private String area;
    private String condicion;
    private int sueldo;
    Empleado(String apNom, int anios,String area, String condicion,int sueldo)
    {
        this.apellidoNombre = apNom;
        this.anios = anios;
        this.area = area;
        this.condicion = condicion;
        this.sueldo = sueldo;
    }
    public String getApellidoNombre()
    {
        return this.apellidoNombre;
    }
    public int getAnios()
    {
        return this.anios;
    }
    public String getArea()
    {
        return this.area;
    }
    public String getCondicion()
    {
        return this.condicion;
    }
    public int getSueldo()
    {
        return this.sueldo;
    }
    private int setSueldo()
    {
        return this.sueldo;
    }
}

public class EmployeeQuotation extends javax.swing.JFrame 
{
    private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    public EmployeeQuotation()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        apellidoNombreEmpleadoTxt = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        NuevoBtn = new javax.swing.JButton();
        areaCmbx = new javax.swing.JComboBox<>();
        condicionCmbx = new javax.swing.JComboBox<>();
        aniosTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sueldoTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacionTbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        empleadoEstableAudTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mas2500menos3500mas5aniostxt = new javax.swing.JTextField();
        empleadoMenosSueldoTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        NuevoBtn.setText("Nuevoi");

        areaCmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Contabilidad", "Sistemas", "Auditoria" }));

        condicionCmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Contratado estable", "Contratado", "Estable" }));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aniosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(areaCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(condicionCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(guardarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NuevoBtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoNombreEmpleadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apellidoNombreEmpleadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(sueldoTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(condicionCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoBtn)
                    .addComponent(guardarBtn))
                .addGap(24, 24, 24))
        );

        informacionTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(informacionTbl);

        empleadoEstableAudTxt.setEnabled(false);

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empleadoMenosSueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(empleadoEstableAudTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mas2500menos3500mas5aniostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mas2500menos3500mas5aniostxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(empleadoEstableAudTxt))
                .addGap(18, 18, 18)
                .addComponent(empleadoMenosSueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public int empleadosEstablesAuditoria()
    {
        int cantidadEmpleadosEstableAuditoria = 0;
        for(int i = 0 ; i < listaEmpleados.size() ; i++)
        {
            if(listaEmpleados.get(i).getArea() == "Auditoria" && listaEmpleados.get(i).getCondicion() == "Contratado estable" && listaEmpleados.get(i).getSueldo() < 1200)
            {
                cantidadEmpleadosEstableAuditoria++;
            }
        }
        return cantidadEmpleadosEstableAuditoria;
    }
    public int empleados2500a3500mas5servicio()
    {
        int cantidadEmpleadosEstableAuditoria = 0;
        for(int i = 0 ; i < listaEmpleados.size() ; i++)
        {
            if(listaEmpleados.get(i).getSueldo() > 2500 && listaEmpleados.get(i).getSueldo() < 3500 && listaEmpleados.get(i).getAnios() > 5)
            {
                cantidadEmpleadosEstableAuditoria++;
            }
        }
        return cantidadEmpleadosEstableAuditoria;
    }
    public String empleadoMenosSueldoContabilidad()
    {
        String empleado = "";
        int sueldo = 0;
        for(int i = 0 ; i < listaEmpleados.size() ; i++)
        {
            if(listaEmpleados.get(i).getArea() == "Contabilidad"  )
            {
                if(empleado == "")
                {
                    empleado = listaEmpleados.get(i).getApellidoNombre();
                    sueldo = listaEmpleados.get(i).getSueldo();
                }
                else
                {
                    if(listaEmpleados.get(i).getSueldo() < sueldo)
                    {
                        empleado = listaEmpleados.get(i).getApellidoNombre();
                        sueldo = listaEmpleados.get(i).getSueldo();
                    }
                }
            }
        }
        return empleado;
    }
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        //inicializa valores de variables
        try{
            String apellidoNombreEmpleado = apellidoNombreEmpleadoTxt.getText();
            int anios = Integer.parseInt(aniosTxt.getText());
            int sueldo = Integer.parseInt(sueldoTxt.getText());
            String area = (String) areaCmbx.getSelectedItem();
            String condicion = (String) condicionCmbx.getSelectedItem();
            Object[] filaTabla = new Object[5];
        
            DefaultTableModel modeloDeTabla = (DefaultTableModel) this.informacionTbl.getModel();
            //agrega los datos al arreglo
            Empleado empleado = new Empleado(apellidoNombreEmpleado,anios,area,condicion,sueldo);
            //agregar datos a lista
            listaEmpleados.add(empleado);
            filaTabla[0] = apellidoNombreEmpleado;
            filaTabla[1] = anios;
            filaTabla[2] = area;
            filaTabla[3] = condicion;
            filaTabla[4] = "$"+sueldo;
            modeloDeTabla.addRow(filaTabla);
            
        
            empleadoEstableAudTxt.setText( empleadosEstablesAuditoria()+"" );
            mas2500menos3500mas5aniostxt.setText( empleados2500a3500mas5servicio()+"" );
            empleadoMenosSueldoTxt.setText( empleadoMenosSueldoContabilidad());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Ocurrio un error al guardar los datos"); 
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new EmployeeQuotation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NuevoBtn;
    private javax.swing.JTextField aniosTxt;
    private javax.swing.JTextField apellidoNombreEmpleadoTxt;
    private javax.swing.JComboBox<String> areaCmbx;
    private javax.swing.JComboBox<String> condicionCmbx;
    private javax.swing.JTextField empleadoEstableAudTxt;
    private javax.swing.JTextField empleadoMenosSueldoTxt;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JTable informacionTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mas2500menos3500mas5aniostxt;
    private javax.swing.JTextField sueldoTxt;
    // End of variables declaration//GEN-END:variables
}
