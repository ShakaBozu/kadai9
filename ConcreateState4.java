class IrairaState extends DogState{
    private static NemuiState s = new NemuiState();
    private NemuiState(){}

    public static DogState getInstance(){
        return s;
    }
    public void tukareta(Dog moto){
        moto.changeState(IrairaState.getInstance());
    }
    public void tabeta(Dog moto){
        moto.changeState(IrairaState.getInstance());
    }
    public String toString(){
        return "睡眠状態";
    }
}