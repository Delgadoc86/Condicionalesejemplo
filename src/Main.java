/*
COMPARATIVAS:
Mayor que >
Menor que <
Mayor o igual que >=
Menor o igual que <=
Distinto a !=
Igual a  ==

CONDICIONALES:

var Estacion = "verano"
SI (Estacion = "verano") Entonces //aca se usa IF
 Aqui las acciones a tomar
 Berber_Agua()
 Bañarse_en_la_piscina()
 Tomarse_un_mojito()
 Irse_al_bar()
En caso contrario si(Estacion = "primavera") Entonces //aca se usa ELSE IF
 Salir _de_paseo()
 Ir_a_ver_a_los_amigos_con_mascarilla()
En caso contrario Entonces //aca se usa ELSE
 Poner_el_abrigo()
 Beber_chocolate_caliente()
 Ver_la_tele()
 */
public class Main {
    public static void main(String[] args) {
        String estacion = "otoño";
        if (estacion == "verano") {
            System.out.println ("es verano");
        }
        else if (estacion == "primavera"){
            System.out.println("es primavera");
        }
        else {
            System.out.println("es otra estacion");
        }
    }
}