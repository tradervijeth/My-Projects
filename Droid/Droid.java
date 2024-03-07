public class Droid{
    String name;
    int batteryLevel;
  
    public Droid (String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  public void performTask(String task){
    batteryLevel = batteryLevel - 20;
    System.out.println(name + "is performing task: " + task);
  }  
  
  //new method which prints the droids current battery level
  public void energyReport(){
    System.out.println(name + "'s current battery level is: " + batteryLevel + "%");
  }
  
  // method transfers energy between this droid and another date
  public void energyTransfer(Droid otherDroid, int amount){
    if (this.batteryLevel >= amount){
      this.batteryLevel -= amount;
      otherDroid.batteryLevel += amount;
      System.out.println("Transferred" + amount + " % battery from " + this.name + " to " + otherDroid.name);
    } else {
      System.out.println("Transfer failed. " + this.name + " does not have enough battery.");
    }
  }
  
  public String toString(){
    return "Hello, I am the droid: " + name;
  }
    public static void main (String[] args){
      Droid codey = new Droid("Codey");
      Droid benny = new Droid("Benny");
  
      System.out.println(codey);
      codey.performTask("dancing");
      codey.energyReport();
  
      System.out.println(benny);
      benny.performTask("coding");
      benny.energyReport();
  
      //Transfer from Benny to Codey
      benny.energyTransfer(codey, 20);
      codey.energyReport();
      benny.energyReport();
    }
  
  }