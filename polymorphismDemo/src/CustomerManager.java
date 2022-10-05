public class CustomerManager{
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }

    public void add(){
        System.out.printf("Müşteri eklendi.");
        this.logger.log("Log Mesaji");
    }
}
