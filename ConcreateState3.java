class IrairaState extends DogState{
    private static IrairaState s = new IrairaState();
    private IrairaiState(){}

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
        return "普通状態";
    }
}