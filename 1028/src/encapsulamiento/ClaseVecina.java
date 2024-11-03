package encapsulamiento;

public class ClaseVecina {
    public static void main(String[] args) {
        Prueba objeto = new encapsulamiento.Prueba();
        //objeto.atributoPrivate = 10;
        objeto.atributoDefault = 20;
        objeto.atributoProtected = 30;
        objeto.atributoPublic = 40;
        //System.out.println("Private: " + objeto.atributoPrivate);
        System.out.println("Default: " + objeto.atributoDefault);
        System.out.println("Protected: " + objeto.atributoProtected);
        System.out.println("Public: " + objeto.atributoPublic);
    }
}
