# Desafios - Cognizant Java Developer

### Desafio Java Iniciante - Cognizant Developer
> #### Desafio - DDD
>
> Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
>
> DDD   | Valor do exemplo
> :--: | :------:
> 61 | Brasilia
> 71 | Salvador
> 11 | Sao Paulo
> 21 | Rio de Janeiro
> 32 | Juiz de Fora
> 19 | Campinas
> 27 | Vitoria
> 31 | Belo Horizante
>
>Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado
>
> #### Entrada
>A entrada consiste de um único valor inteiro.
>
> #### Saída
>Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

**Código Java**
~~~java
//Complete os espaços em branco com o seu código
import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a == 61){
          System.out.printf("Brasilia\n");
      }
      else if(a == 71){
          System.out.printf("Salvador\n");
      }
      else if(a == 11){
          System.out.printf("Sao Paulo\n");
      }
       else if(a == 21){
          System.out.printf("Rio de Janeiro\n");
      }
       else if(a == 32){
          System.out.printf("Juiz de Fora\n");
      }
       else if(a == 19){
          System.out.printf("Campinas\n");
      }
       else if(a == 27){
          System.out.printf("Vitoria\n");
      }
       else if(a == 31){
          System.out.printf("Belo Horizonte\n");
      }
       else{
           System.out.printf("DDD nao cadastrado\n");
       }
    }
    
}
~~~