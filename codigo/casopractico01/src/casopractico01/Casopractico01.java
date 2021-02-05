/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casopractico01;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Casopractico01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int opcion;
        String salida;
        String salir;
        int contador = 0;
        String facebook = "";
        String whatsapp = "";
        String signal = "";
        String flickr = "";
        while (bandera == true) {
            System.out.println("Ingrese 1 para crear una cuenta de Facebook\n"+
                    "Ingrese 2 para crear una cuenta en Twitter\n"+
                    "Ingrese 3 para crear una cuenta en Whatsapp\n"+
                    "Ingrese 4 para crear una cuenta en Telegram\n"+
                    "Ingrese 5 para crear una cuenta en Signal\n"+
                    "Ingrese 6 para crear una cuenta en Instagram\n"+
                    "Ingrese 7 para crear una cuenta en Flickr\n");
            opcion = entrada.nextInt();
            if(opcion == 1){
                facebook = crearFacebook();
                contador = contador + 1;
            }else{
                if(opcion == 2){
                    crearTwitter();
                    contador = contador + 1;
                }else{
                    if(opcion == 3){
                        whatsapp = crearWhatsapp();
                        contador = contador + 1;
                    }else{
                        if(opcion == 4){
                            crearTelegram();
                            contador = contador + 1;
                        }else{
                            if(opcion == 5){
                                signal = crearSignal();
                                contador = contador + 1;
                            }else{
                                if(opcion == 6){
                                    crearInstagram();
                                    contador = contador + 1;
                                }else{
                                    if(opcion == 7){
                                        flickr = crearFlickr();
                                        contador = contador + 1;
                                    }else{
                                        System.out.println(" la Opcion es incorrecta");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            entrada.nextLine();
            System.out.println("digite si para dejar de crear cuentas");
            salir = entrada.nextLine();
            salida = salir.toLowerCase();
            if(salida.equals("si")){
                bandera = false;
            }
        }
        System.out.printf(facebook + whatsapp + signal + flickr);
        obtenerMensaje(contador);
    }
    public static String crearFacebook(){
        Scanner entrada = new Scanner(System.in);
        String usuarion;
        int edad;
        String ciudad;
        String pais;
        String correoel;
        String cadena = "";
        System.out.println("Ingrese el nombre del usuario");
        usuarion = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre del pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo electronico");
        correoel = entrada.nextLine();
        cadena = String.format("%sEl nombre del usuario es: %s\nEdad= %d\n"
                + "Ciudad: %s\nPais: %s\nCorreo: %s\n", cadena, usuarion,
                edad, ciudad, pais, correoel);
        return cadena;
    }
    public static void crearTwitter(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String nombre;
        String apellidos;
        int edad;
        String ciudad;
        String paisn;
        String idioma;
        String correo;
        System.out.println("Ingrese el nombre del usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        paisn = entrada.nextLine();
        System.out.println("Ingtese su idioma");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo");
        correo = entrada.nextLine();
        System.out.printf("%sUsuario: %s\nNombres: %s\nApellidos: %s\n"
                + "Edad: %d\nCiudad: %s\nPais: %s\nIdioma: %s\nCorreo: %s\n",
                usuario, nombre, apellidos, edad, ciudad, paisn, idioma,
                correo);
    }
    public static String crearWhatsapp(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        int edad;
        String ciudad;
        String pais;
        String cadenaac = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        cadenaac = String.format("%s\tWhatsapp\nUsuario: %s\nNumero: de telefono:"
                + " %d\nEdad: %d\nCiudad: %s\nPais: %s\n", cadenaac, usuario,
                numero, edad, ciudad, pais);
        return cadenaac;
    }
    public static void crearTelegram(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        String ciudad;
        String pais;
        String area;
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre del pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el area de interés");
        area = entrada.nextLine();
        System.out.printf("%s\nUsudario: %s\nNumero de telefono: %d\n"
                + "Ciudad: %s\nPais: %s\nArea de interés: %s\n", usuario,
                numero, ciudad, pais, area);
    }
    public static String crearSignal(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int numero;
        String ciudad;
        String pais;
        String hobby;
        String cadena = "";
        System.out.println("Ingrese el nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese su hobby principal");
        hobby = entrada.nextLine();
        cadena = String.format("%s\nUsuario: %s\nNumero de telefono:"
                + " %d\nCiudad: %s\nPais: %s\nHobby principal: %s\n", cadena,
                usuario, numero, ciudad, pais, hobby);
        return cadena;
    }
    public static void crearInstagram(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String ciudad;
        int edad;
        String correo;
        System.out.println("Ingrese el nombre del usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su correo elctronico");
        correo = entrada.nextLine();
        System.out.printf("%s\nUsuario: %s\nCiudad: %s\nEdad: %d\n"
                + "Correo: %s\n", usuario, ciudad, edad, correo);
    }
    public static String crearFlickr(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String correoel;
        String cadenan = "";
        System.out.println("Ingrese el nombre del usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su correo electronio");
        correoel = entrada.nextLine();
        cadenan = String.format("%s\nUsuario: %s\nCorreo: %s", cadenan,
                usuario, correoel);
        return cadenan;
    }
    public static void obtenerMensaje(int nCuentas){
        String [] mensajeFinal = {"Campaña con poca afluencia", 
            "Campaña moderada siga adelante", "Excelente campaña"};
        if ((nCuentas >= 1) && (nCuentas <= 5)){
                System.out.println(mensajeFinal[0]);
            }else{
            if ((nCuentas >= 6) && (nCuentas <= 15)){
                System.out.println(mensajeFinal[1]);
            }else{
                if (nCuentas >= 16){
                    System.out.println(mensajeFinal[2]);
                }
            }
        }
    }
    
}
