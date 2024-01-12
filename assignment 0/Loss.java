class Loss {
  public static void main(String[] args) {
    float l;
    int sellingprice = 200;
    int costpriec = 260;
    int loss = costpriec - sellingprice;
    // l = loss;
    float losspercent = (loss / costpriec * 100);
    System.out.println("loss :" + loss);
    System.out.println("losspercent :" + losspercent);
  }
}
