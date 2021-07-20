class tanoshiiState extends DogState{
    private static TanoshiiState s = new FutsuuState();
    private FutsuuiState(){}

    public static DogState getInstance(){
        return s;
    }
    public void tukareta(Dog moto){
        moto.changeState(IrairaState.getInstance());
    }
    public void tabeta(Dog moto){
        moto.changeState(TanoshiiState.getInstance());
    }
    public String toString(){
        return "普通状態";
    }
}