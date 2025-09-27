package OOPS.Encapsulation.EncapBtm;

public class Sim {
    
    private long number;        
    private String serviceProvider;
    private String plan;


    public Sim(long number, String serviceProvider, String plan) {
        this.number = number;
        this.serviceProvider = serviceProvider;
        this.plan = plan;
    }

   
    public long getNumber() {
        return number;
    }

   

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getPlan() {
        return plan;
    }

 
}
