public class TestElectronicWallet {
    public static void main(String[] args) {
        ElectronicWallet wallet1 = new ElectronicWallet();
       
        //test 1
        System.out.println("FIRST TEST");
        if(wallet1.setOwner("david")==true){
          System.out.println("nombre aceptado con exito");
        }else{
            System.out.println("nombre no aceptado");
        }
        //recarga
        if(wallet1.settopUp(300)==true){
          System.out.println("recarga aceptada con exito");
        }else{
            System.out.println("recarga no aceptada");
        }
        //pago
        if(wallet1.setpayment(200)==true){
          System.out.println("pago aceptado con exito");
        }else{
            System.out.println("pago no aceptado fuera del rango");
        }
        System.out.println("el balance final es = "+wallet1.getBalance());
        //proof 2
        System.out.println("SECOND TEST");
        if(wallet1.setOwner("david")==true){
          System.out.println("nombre acepatdo con exito");
        }else{
            System.out.println("nombre no aceptado");
        }
        //recarga
        if(wallet1.settopUp(-50000)==true){
          System.out.println("recarga aceptada con exito");
        }else{
            System.out.println("recarga no aceptada");
        }
        //pago
        if(wallet1.setpayment(200)==true){
          System.out.println("pago aceptado con exito");
        }else{
            System.out.println("pago no aceptado fuera del rango");
        }
        System.out.println("el balance final es = "+wallet1.getBalance());
        //proof 3
        System.out.println("THIRD TEST");
        if(wallet1.setOwner("david")==true){
          System.out.println("nombre acepatdo con exito");
        }else{
            System.out.println("nombre no aceptado");
        }
        //recarga
        if(wallet1.settopUp(300)==true){
          System.out.println("recarga aceptada con exito");
        }else{
            System.out.println("recarga no aceptada");
        }
        //pago
        if(wallet1.setpayment(-56900)==true){
          System.out.println("pago aceptado con exito");
        }else{
            System.out.println("pago no aceptado fuera del rango");
        }
        System.out.println("el balance final es = "+wallet1.getBalance());
    }
}

