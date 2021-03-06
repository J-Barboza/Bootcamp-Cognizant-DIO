package one.digitalinnovation;

//Refatorado para Generics
public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }

        return stringRetorno;
    }
}


//Original - Com retatoramento para Object
//public class Fila {
//
//    private No refNoEntradaFila;
//
//    public Fila() {
//        this.refNoEntradaFila = null;
//    }
//
////    public void enqueue(No novoNo){
////        novoNo.setRefNo(refNoEntradaFila);
////        refNoEntradaFila = novoNo;
////    }
//
//    // c??digo refatorado
//    public void enqueue(Object obj){
//        No novoNo = new No(obj);
//        novoNo.setRefNo(refNoEntradaFila);
//        refNoEntradaFila = novoNo;
//    }
//
////    public No first(){
////        if(!this.isEmpty()){
////            No primeiroNo = refNoEntradaFila;
////            while (true){
////                if(primeiroNo.getRefNo() != null){
////                    primeiroNo = primeiroNo.getRefNo();
////                }else{
////                    break;
////                }
////            }
////            return primeiroNo;
////        }
////        return null;
////    }
//
//    //Codigo refatorado
//    public Object first(){
//        if(!this.isEmpty()){
//            No primeiroNo = refNoEntradaFila;
//            while (true){
//                if(primeiroNo.getRefNo() != null){
//                    primeiroNo = primeiroNo.getRefNo();
//                }else{
//                    break;
//                }
//            }
//            return primeiroNo.getObject();
//        }
//        return null;
//    }
//
////    public No dequeue(){
////        if (!this.isEmpty()){
////            No primeiroNo = refNoEntradaFila;
////            No noAuxiliar = refNoEntradaFila;
////            while (true){
////                if(primeiroNo.getRefNo() != null){
////                    noAuxiliar = primeiroNo;
////                    primeiroNo = primeiroNo.getRefNo();
////                }else{
////                    noAuxiliar.setRefNo(null);
////                    break;
////                }
////            }
////            return primeiroNo;
////        }
////        return null;
////    }
//
//    //Codigo refatorado
//    public Object dequeue(){
//        if (!this.isEmpty()){
//            No primeiroNo = refNoEntradaFila;
//            No noAuxiliar = refNoEntradaFila;
//            while (true){
//                if(primeiroNo.getRefNo() != null){
//                    noAuxiliar = primeiroNo;
//                    primeiroNo = primeiroNo.getRefNo();
//                }else{
//                    noAuxiliar.setRefNo(null);
//                    break;
//                }
//            }
//            return primeiroNo.getObject();
//        }
//        return null;
//    }
//
//    public boolean isEmpty(){
//        return refNoEntradaFila == null? true : false;
//    }
//
//    @Override
//    public String toString() {
//        String stringRetorno = "";
//        No noAuxiliar = refNoEntradaFila;
//
//        if(refNoEntradaFila != null){
//            while (true){
//                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
//                if(noAuxiliar.getRefNo() != null){
//                    noAuxiliar = noAuxiliar.getRefNo();
//                }else{
//                    stringRetorno += "null";
//                    break;
//                }
//            }
//        }
//
//        return stringRetorno;
//    }
//}

