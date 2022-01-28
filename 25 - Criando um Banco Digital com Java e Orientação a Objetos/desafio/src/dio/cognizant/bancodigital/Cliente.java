package dio.cognizant.bancodigital;

import java.lang.ref.Cleaner;

public class Cliente extends Pessoa{

    public void adicionaCliente(Cliente cliente){
        if(cliente == null ){
            throw new NullPointerException("Cliente não pode ser nulo.");
        }
    }
}
