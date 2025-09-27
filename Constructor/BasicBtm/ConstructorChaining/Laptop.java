package Constructor.BasicBtm.ConstructorChaining;

public class Laptop {

    String brand;
    int ram;
    String graphicCard;
    int rom;
    String processor;
    public Laptop(String brand) {
        this.brand = brand;
    }
    public Laptop(String brand, int ram) {
      this(brand);
        this.ram = ram;
    }
    public Laptop(String brand, int ram, String graphicCard) {
       this(brand, ram);
        this.graphicCard=graphicCard;
    }
    public Laptop(String brand, int ram, String graphicCard, int rom) {
       this(brand, ram, graphicCard);
        this.rom = rom;
    }
    public Laptop(String brand, int ram, String graphicCard, int rom, String processor) {
      this(brand, ram, graphicCard, rom);
        this.processor = processor;
    }   
    
}
