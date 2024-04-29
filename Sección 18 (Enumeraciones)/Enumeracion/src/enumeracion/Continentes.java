package enumeracion;

public enum Continentes {
    AFRICA(53,"1 Billon"),
    AMERICA(34),
    ASIA(44),
    EUROPA(46), 
    OCEANIA(14);
    
    private final int paises;
    private final String habitantes;
    
    Continentes(int paises){
        this.paises = paises;
        this.habitantes ="";
    }
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
