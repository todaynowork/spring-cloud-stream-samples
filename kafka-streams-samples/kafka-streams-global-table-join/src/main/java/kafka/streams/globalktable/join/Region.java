package kafka.streams.globalktable.join;

public class Region {

  private String name;

  Region(String name, String region){
    this.name = name;
    this.region = region;

  }

  Region(){

  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  private String region;


}
