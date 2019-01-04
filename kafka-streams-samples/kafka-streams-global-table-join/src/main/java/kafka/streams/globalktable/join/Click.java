package kafka.streams.globalktable.join;

public class Click {

  Click(String name, Long click){
    this.name = name;
    this.click = click;

  }

  Click(){

  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getClick() {
    return click;
  }

  public void setClick(Long click) {
    this.click = click;
  }

  private Long click;

}
