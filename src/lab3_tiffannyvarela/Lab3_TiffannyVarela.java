/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tiffannyvarela;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tiffa
 */
public class Lab3_TiffannyVarela {

    /**
     * @param args the command line arguments
     */
    static int opc, opc2, opc3;
    static Connective_line cn = new Connective_line();
    static Scanner r = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        char resp = 's';
        Proyecto_web pro_w = new Proyecto_web();
        Proyecto_comercial pro_c = new Proyecto_comercial();
        Proyecto_publicitario pro_p = new Proyecto_publicitario();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        ArrayList<Proyecto> proyectos = new ArrayList();
        int edad, b, t, p = 0, e = 0, pro = 0;
        String n_usuario, contra, correo, id, n_completo, genero, ciudad, telefono, l_programacion, universidad, idioma, nombre;
        String n_marca, modelo_camara, hobbies, modelo_c_video, red_social, descripcion, pais, url, departamento, municipio, mision, vision;
        double dinero;
        boolean inscripcion = false;

        while (resp == 's' || resp == 'S') {
            switch (Menu(opc)) {
                case 1:
                    System.out.println("Ingrese ID: ");
                    id = r.next();

                    System.out.println("Ingrese el correo: ");
                    correo = r.next();
                    switch (Menu2(opc2)) {
                        case 1:
                            System.out.println("Ingrese nombre de usuario: ");
                            n_usuario = r.next();
                            System.out.println("Ingrese la contrasena: ");
                            contra = r.next();
                            cn.getPersonas().add(new Administrador(n_usuario, contra, id, correo));
                            break;

                        case 2:
                            System.out.println("Ingrese nombre completo: ");
                            r.nextLine();
                            n_completo = r.nextLine();
                            System.out.println("Ingrese contrasena");
                            contra = r.next();
                            System.out.println("Genero: ");
                            genero = r.next();
                            System.out.println("Edad: ");
                            edad = r.nextInt();
                            cn.getEmpresas().add(new Empresa());
                            System.out.println("Dinero: ");
                            dinero = r.nextDouble();
                            System.out.println("Ciudad: ");
                            r.hasNextLine();
                            ciudad = r.nextLine();
                            System.out.println("Telefono: ");
                            telefono = r.next();
                            cn.getPersonas().add(new Freelance(n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo));
                            switch (Menu3(opc3)) {

                                case 1:
                                    System.out.println("Lenguaje de programacion: ");
                                    l_programacion = r.next();
                                    System.out.println("Universidad: ");
                                    r.nextLine();
                                    universidad = r.nextLine();
                                    System.out.println("Idioma: ");
                                    idioma = r.next();
                                    proyectos.add(new Proyecto());
                                    cn.getPersonas().add(new Desarrollador_web(l_programacion, universidad, idioma, n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo));
                                    break;

                                case 2:
                                    proyectos.add(new Proyecto());
                                    System.out.println("Nombre de la marca: ");
                                    r.nextLine();
                                    n_marca = r.nextLine();
                                    System.out.println("Modelo de la camara: ");
                                    r.nextLine();
                                    modelo_camara = r.nextLine();
                                    cn.getPersonas().add(new Fotografo(n_marca, modelo_camara, n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo));
                                    break;

                                case 3:
                                    proyectos.add(new Proyecto());
                                    System.out.println("Universidad: ");
                                    r.nextLine();
                                    universidad = r.nextLine();
                                    System.out.println("Hobbies: ");
                                    r.nextLine();
                                    hobbies = r.nextLine();
                                    cn.getPersonas().add(new Disenador_grafico(universidad, hobbies, n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo));
                                    break;

                                case 4:
                                    proyectos.add(new Proyecto());
                                    System.out.println("Nombre de la marca: ");
                                    r.nextLine();
                                    n_marca = r.nextLine();
                                    System.out.println("Modelo de la camara de video: ");
                                    r.nextLine();
                                    modelo_c_video = r.nextLine();
                                    cn.getPersonas().add(new Medios_audiovisuales(n_marca, modelo_c_video, n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo));
                                    break;

                                case 5:
                                    proyectos.add(new Proyecto());
                                    System.out.println("Red social mas utilizada: ");
                                    r.nextLine();
                                    red_social = r.nextLine();
                                    cn.getPersonas().add(new Marketing(red_social, n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo));
                                    break;

                                case 6:
                                    proyectos.add(new Proyecto());
                                    System.out.println("Universidad: ");
                                    r.nextLine();
                                    universidad = r.nextLine();
                                    System.out.println("Estado de la incripcion del Colegio de Peritos Mecantiles [1.True, 2.False]: ");
                                    b = r.nextInt();
                                    if (b == 1) {
                                        inscripcion = true;
                                    }
                                    if (b == 2) {
                                        inscripcion = false;
                                    }
                                    System.out.println("Hobbies: ");
                                    r.nextLine();
                                    hobbies = r.nextLine();
                                    cn.getPersonas().add(new Contador(universidad, inscripcion, hobbies, n_completo, contra, genero, edad, dinero, ciudad, telefono, id, correo));
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Nombre: ");
                            r.nextLine();
                            nombre = r.nextLine();
                            System.out.println("Telefono");
                            telefono = r.nextLine();
                            proyectos.add(new Proyecto());
                            System.out.println("Correo: ");
                            correo = r.next();
                            System.out.println("Contrasena: ");
                            contra = r.next();
                            System.out.println("Descripcion: ");
                            r.nextLine();
                            descripcion = r.nextLine();
                            System.out.println("Tipo de empresa:\n 1.Extranjera\n 2.Nacional");
                            t = r.nextInt();
                            switch (t) {

                                case 1:
                                    System.out.println("Ingrese el pais: ");
                                    r.nextLine();
                                    pais = r.nextLine();
                                    System.out.println("Ingrese la ciudad: ");
                                    r.nextLine();
                                    ciudad = r.nextLine();
                                    System.out.println("URL: ");
                                    url = r.next();
                                    cn.getEmpresas().add(new Extranjera(pais, ciudad, url, nombre, telefono, correo, contra, descripcion));
                                    break;

                                case 2:
                                    System.out.println("Ingrese el departamento: ");
                                    r.nextLine();
                                    departamento = r.nextLine();
                                    System.out.println("Ingrese el municipio: ");
                                    r.nextLine();
                                    municipio = r.nextLine();
                                    System.out.println("Ingrese la ciudad: ");
                                    r.nextLine();
                                    ciudad = r.nextLine();
                                    System.out.println("Ingrese la mision: ");
                                    r.nextLine();
                                    mision = r.nextLine();
                                    System.out.println("Ingrese vision: ");
                                    r.nextLine();
                                    vision = r.nextLine();
                                    cn.getEmpresas().add(new Nacional(departamento, municipio, ciudad, mision, vision, nombre, telefono, correo, contra, descripcion));
                                    break;

                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;

                case 2:
                    String empresa,
                     estado = null;
                    boolean be=false;
                    double precio;
                    int es,
                     proyec;
                    String entrada,
                     salida;
                    Date f_entrada,
                     f_salida;
                    System.out.println("Ingrese su correo: ");
                    String correoi = r.next();
                    System.out.println("Ingrese su contrasena: ");
                    String contrai = r.next();
                    
                    if (valid_empresa(be, correoi, contrai)==true) {
                        System.out.println("Nombre del proyecto: ");
                        nombre = r.next();
                        System.out.println("Empresa: ");
                        empresa = r.next();
                        System.out.println("Precio: ");
                        precio = r.nextDouble();
                        System.out.println("Estado\n 1.Recien ingresado\n 2.En proceso\n 3.Terminado\n 4.Cancelado");
                        es = r.nextInt();
                        switch (es) {
                            case 1:
                                estado = "Recien ingresado";
                                break;

                            case 2:
                                estado = "En proceso";
                                break;

                            case 3:
                                estado = "Terminado";
                                break;

                            case 4:
                                estado = "Cancelado";
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        System.out.println("Descripcion: ");
                        r.nextLine();
                        descripcion = r.nextLine();
                        System.out.println("Fecha de inicio: ");
                        entrada = r.next();
                        f_entrada = format.parse(entrada);
                        System.out.println("Fecha de salida: ");
                        salida = r.next();
                        f_salida = format.parse(salida);
                        System.out.println("Proyectos\n 1.Proyecto Web\n 2.Proyecto Publcitario\n 3.Proyecto Comercial");
                        proyec = r.nextInt();
                        int pos;
                        switch (proyec) {

                            case 1:
                                String dise;
                                for (int i = 0; i < cn.getPersonas().size(); i++) {
                                    if (((Desarrollador_web) cn.getPersonas().get(i)) instanceof Desarrollador_web) {
                                        System.out.println(cn.getPersonas().indexOf(i) + " = " + cn.getPersonas().get(i));
                                    }
                                }

                                System.out.println("Ingrese la posicion del desarrollador web que desea");
                                pos = r.nextInt();
                                
                                pro_w.getweb().add(new Proyecto_web(nombre, empresa, precio, estado, descripcion, f_salida, f_entrada, estado));
                                break;

                            case 2:
                                String free = "";
                                for (int i = 0; i < cn.getPersonas().size(); i++) {
                                    if (((Disenador_grafico) cn.getPersonas().get(i)) instanceof Disenador_grafico || ((Fotografo) cn.getPersonas().get(i)) instanceof Fotografo || ((Medios_audiovisuales) cn.getPersonas().get(i)) instanceof Medios_audiovisuales) {
                                        System.out.println(cn.getPersonas().indexOf(i) + " = " + cn.getPersonas().get(i));
                                    }
                                }

                                System.out.println("Ingrese la posicion del freelancer que desea");
                                pos = r.nextInt();
                                //pro_p.getPublicitario().add(new Proyecto_publicitario(nombre, empresa, precio, estado, descripcion, f_salida, f_entrada, url));

                                break;

                            case 3:
                                for (int i = 0; i < cn.getPersonas().size(); i++) {
                                    if (((Contador) cn.getPersonas().get(i)) instanceof Contador || ((Marketing) cn.getPersonas().get(i)) instanceof Marketing) {
                                        System.out.println(cn.getPersonas().indexOf(i) + " = " + cn.getPersonas().get(i));
                                    }
                                }

                                System.out.println("Ingrese la posicion del freelancer que desea");
                                pos = r.nextInt();
                                //pro_c.getcomercial().add(new Proyecto_comercial(nombre, empresa, precio, estado, descripcion, f_salida, f_entrada, free));

                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }

                    } else {
                        System.out.println("Usuario no valido");
                    }
                    break;

                case 3:
                    boolean bp=false;
                    System.out.println("Ingrese su correo: ");
                    correoi = r.next();
                    System.out.println("Ingrese su Id: ");
                    contrai = r.next();
                    
                    if (valid_empresa(bp, correoi, contrai)==true) {
                        System.out.println("Proyecto Web\n");
                        for (int i = 0; i < proyectos.size(); i++) {
                            if (((Disenador_grafico) cn.getPersonas().get(i)) instanceof Disenador_grafico || ((Fotografo) cn.getPersonas().get(i)) instanceof Fotografo || ((Medios_audiovisuales) cn.getPersonas().get(i)) instanceof Medios_audiovisuales) {
                                System.out.println(cn.getPersonas().indexOf(i) + " = " + cn.getPersonas().get(i));
                            }
                        }
                        System.out.println("\n\n");
                        System.out.println("Proyecto Publicitario\n");
                        for (int i = 0; i < proyectos.size(); i++) {
                            if (((Disenador_grafico) cn.getPersonas().get(i)) instanceof Disenador_grafico || ((Fotografo) cn.getPersonas().get(i)) instanceof Fotografo || ((Medios_audiovisuales) cn.getPersonas().get(i)) instanceof Medios_audiovisuales) {
                                System.out.println(cn.getPersonas().indexOf(i) + " = " + cn.getPersonas().get(i));
                            }
                        }
                        System.out.println("\n\n");
                        System.out.println("Proyecto Comercial\n");
                        for (int i = 0; i < proyectos.size(); i++) {
                            if (((Disenador_grafico) cn.getPersonas().get(i)) instanceof Disenador_grafico || ((Fotografo) cn.getPersonas().get(i)) instanceof Fotografo || ((Medios_audiovisuales) cn.getPersonas().get(i)) instanceof Medios_audiovisuales) {
                                System.out.println(cn.getPersonas().indexOf(i) + " = " + cn.getPersonas().get(i));
                            }
                        }
                        System.out.println("\n\n");
                    } else {
                        System.out.println("Usuario invalido");
                    }
                    break;
                    
                case 4:
                    boolean el=false;
                    int de,posi,elim,conf;
                    String correoel, contrael;
                    System.out.println("Que desea eliminar?\n 1.Empresa\n 2.Personas");
                    de=r.nextInt();
                    switch(de){
                        
                        case 1:
                            System.out.println("Empresas\n");
                            for (int i = 0; i < cn.getEmpresas().size(); i++) {
                                System.out.println(i + " = " + cn.getEmpresas());
                            }
                            System.out.println("\n\n");
                            
                            System.out.println("Ingrese la posicion a eliminar: ");
                            posi=r.nextInt();
                            while(posi<0||posi>cn.getEmpresas().size()){
                                System.out.println("Ingrese la posicion a eliminar: ");
                                posi=r.nextInt();
                            }
                            System.out.println("Ingrese correo de empresa: ");
                            correoel=r.next();
                            System.out.println("Ingrese la contrasena de empresa: ");
                            contrael=r.next();
                            if (valid_empresa(el, correoel, contrael)==true) {
                                System.out.println("Desea eliminar la posicion "+posi+" ?\n 1.Si\n 2.No");
                            elim=r.nextInt();
                            if(elim==1)
                            {
                                cn.getEmpresas().remove(posi);
                                System.out.println("Posicion eliminada");
                                
                            }
                            else{
                                System.out.println("Posicion no eliminada");
                            }
                            }
                            else{
                                System.out.println("Correo y contrasena no validos");
                            }
                            
                            break;
                            
                        case 2:
                            System.out.println("Personas\n");
                            for (int i = 0; i < cn.getPersonas().size(); i++) {
                                System.out.println(i + " = " + cn.getPersonas());
                            }
                            System.out.println("\n\n");
                            
                            System.out.println("Ingrese la posicion a eliminar: ");
                            posi=r.nextInt();
                            while(posi<0||posi>cn.getPersonas().size()){
                                System.out.println("Ingrese la posicion a eliminar: ");
                                posi=r.nextInt();
                            }
                            System.out.println("Ingrese correo de empresa: ");
                            correoel=r.next();
                            System.out.println("Ingrese la contrasena de empresa: ");
                            contrael=r.next();
                            if (valid_empresa(el, correoel, contrael)==true) {
                                System.out.println("Desea eliminar la posicion "+posi+" ?\n 1.Si\n 2.No");
                            elim=r.nextInt();
                            if(elim==1)
                            {
                                cn.getPersonas().remove(posi);
                                System.out.println("Posicion eliminada");
                                
                            }
                            else{
                                System.out.println("Posicion no eliminada");
                            }
                            }
                            else{
                                System.out.println("Correo y contrasena no validos");
                            }
                            break;
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                case 10:
                    String P = "",
                     E = "",
                     PER = "",
                     I = "";
                    System.out.println("Proyectos\n");
                    for (int i = 0; i < proyectos.size(); i++) {
                        System.out.println(proyectos);
                    }
                    System.out.println("\n\n");
                    System.out.println("Empresas\n");
                    for (int i = 0; i < cn.getEmpresas().size(); i++) {
                        System.out.println(cn.getEmpresas());
                    }
                    System.out.println("\n\n");
                    System.out.println("Personas\n");
                    for (int i = 0; i < cn.getPersonas().size(); i++) {
                        System.out.println(cn.getPersonas());
                    }
                    System.out.println("\n\n");
                    System.out.println("Ingresos\n");
                    for (int i = 0; i < cn.getIngresos().size(); i++) {
                        System.out.println(cn.getIngresos());
                    }
                    System.out.println("\n\n");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("Volver? [s/n]: ");
            resp = r.next().charAt(0);
        }

    }

    public static int Menu(int opc) {
        System.out.println("Menu\n 1.Registrar\n 2.Crear Proyecto\n 3.Ver Proyectos\n 4.Eliminar\n 5.Salir\n 10.Listar");
        return opc = r.nextInt();
    }

    public static int Menu2(int opc2) {
        System.out.println("Menu\n 1.Administrador\n 2.Freelance\n 3.Empresa\n");
        return opc2 = r.nextInt();
    }

    public static int Menu3(int opc3) {
        System.out.println("Menu\n 1.Desarrollador Web\n 2.Fotografo\n 3.Disenador Grafico\n 4.Medios Audiovisuales\n 5.Marketing\n 6.Contador");
        return opc3 = r.nextInt();
    }

    public static String texto(String nombre) {
        while (nombre.matches("([a-z]|[A-Z]|\\s)+") == false) {
            System.out.println("Vuelva a ingresar el TEXTO");
            nombre = r.next();
        }
        return nombre;
    }

    public static int num(int numero) {
        while (numero < 0) {
            System.out.println("Vuelva a ingresar el NUMERO debe ser mayor a 0");
            numero = r.nextInt();
        }
        while (Integer.toString(numero).matches("^[0-9]+$") == false) {
            System.out.println("Vuelva a ingresar el NUMERO");
            numero = r.nextInt();
        }
        return numero;
    }

    public static double dec(double decimal) {
        while (decimal < 0) {
            System.out.println("Vuelva a ingresar el NUMERO debe ser mayor a 0");
            decimal = r.nextDouble();
        }
        while (Double.toString(decimal).matches("^-?[0-9]+([\\.,][0-9]{1," + decimal + "})?$") == false) {
            System.out.println("Vuelva a ingresar el NUMERO");
            decimal = r.nextDouble();
        }
        return decimal;
    }

    public static String fec(String fecha) {
        while (fecha.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$") == false) {
            System.out.println("Ingrese una fecha con formato dd/mm/yyyy");
            fecha = r.next();
        }
        return fecha;
    }

    public static int val_cliente(ArrayList clientes, int pos) {
        while (pos < 0 || pos > clientes.size()) {
            System.out.println("poscion de cliente no valida");
            System.out.println("Ingrese la posicion del cliente: ");
            pos = r.nextInt();
        }
        return pos;
    }
    
    public static boolean valid_empresa(boolean be, String correoi, String contrai){
        for (int i = 0; i < cn.getEmpresas().size(); i++) {
                        if (cn.getEmpresas().get(0).getCorreo().equals(correoi)&&cn.getEmpresas().get(0).getContra().equals(contrai)) {
                            be = true;
                        }
                    }
        return be;
    }

}
