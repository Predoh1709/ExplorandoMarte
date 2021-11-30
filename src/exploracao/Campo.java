package exploracao;

public class Campo {

    protected char[][] coordenadas; // protected consigo acessar fora da classe, mas somente no mesmo pacote ou heranca
    private int x; // private para acessar somente na classe
    private int y;

    public Campo(int x, int y) {
        this.x = x + 1;
        this.y = y + 1;
        this.coordenadas = new char[this.x + 1][this.y + 1]; // como matriz comeca com 0 
    }

    public void ocuparEspaco(int i, int j) {
        coordenadas[i][j] = 'x';
    }

    public int largura() { // obter a largura
        return this.x;
    }

    public int altura() { // obter a altura
        return this.y;
    }

    public boolean espacoLivre(int x, int y) { // evitar colisao de sonda e limite do campo
        boolean x_limite = (x >= 0) && (x < this.x);
        boolean y_limite = (y >= 0) && (y < this.y);
        boolean livre = (this.coordenadas[x][y] != 'x');

        return x_limite && y_limite && livre;
    }

}
