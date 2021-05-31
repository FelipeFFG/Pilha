public class Pilha {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ef43888 (Reformat code)
    private int topo = -1;
    private int maximo;
    private char[] dado;

    public Pilha(int maximo) {
        this.maximo = maximo;
        this.dado = new char[maximo];
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public boolean Vazio() {
        return topo == -1;
    }

    public boolean Cheio() {
=======
    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
>>>>>>> ef43888 (Reformat code)
=======
    public boolean Vazio() {
        return topo == -1;
    }

    public boolean Cheio() {
>>>>>>> 9914158 (Escritas em ingles para portugues)
        return topo == maximo - 1;
    }


    public void empilhar(char a) {
        if (!isFull()) {
            topo = topo + 1;
            dado[topo] = a;
        } else {
            System.out.println("Pilha Cheia");
        }
    }

    public int getTopo() {
        if (!isEmpty()) {
            return dado[topo];
        } else {
            return -1;
        }
    }

    public int desempilhar() {
        if (!isEmpty()) {
            int x = getTopo();
            topo = topo - 1;
            return x;
        } else {
            System.out.println("Pilha vazia.");
            return -1;
        }
    }
<<<<<<< HEAD
=======
  private int topo = -1;
  private int maximo;
  private char[] dado;
  public Pilha(int maximo){
      this.maximo = maximo;
      this.dado = new char[maximo];
  }
  public boolean isEmpty(){
      return topo == -1;
  }
  public boolean isFull(){
      return topo == maximo - 1;
  }

  public void empilhar(char a){
          if (!isFull()){
                  topo = topo + 1;
                  dado[topo] =  a;
          }
          else{
          System.out.println("Pilha Cheia");
          System.out.println("Pilha Cheia");
          }

  }
 public int getTopo() {
     if (!isEmpty()) {
         return dado[topo];
     }
     else {
         return -1;
     }
 }




  public int  desempilhar(){
          if (!isEmpty()){
                 int x = getTopo();
                  topo = topo -1;
                  return x;
          }
          else{
               System.out.println("Pilha vazia.");
               return -1;
          }



  }



>>>>>>> 890500d (novo print)
=======
>>>>>>> ef43888 (Reformat code)
}
