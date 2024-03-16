public class Pilha 
{
    public int array[];
    public int topo;
    public int capacidade;

    public Pilha (int capacidade) 
    {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
        this.topo = -1;
    }

    public void push (int elemento) throws PilhaCheiaException
    {
        if (isFull())
        {
            throw new PilhaCheiaException("Pilha está cheia, não pode empilhar");
        }

        else 
        {
            array[++topo] = elemento;
        }
    }

    public int pop () throws PilhaVaziaException
    {
        if (isEmpty()) 
        {
            throw new PilhaVaziaException("Pilha está vazia, não é possível desempilhar");
        }

        else 
        {
            System.out.println("O valor desempilhado foi : " + array[topo]);
            return array[topo--];
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull()
    {
        return topo == capacidade - 1;
    }


    public class PilhaCheiaException extends Exception {
        public PilhaCheiaException() {
            super("A pilha está cheia");
        }
        
        public PilhaCheiaException(String mensagem) {
            super(mensagem);
        }
    }
    
    public class PilhaVaziaException extends Exception {
        public PilhaVaziaException() {
            super("A pilha está vazia");
        }
        
        public PilhaVaziaException(String mensagem) {
            super(mensagem);
        }
    }
    
    
}