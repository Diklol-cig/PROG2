class FizzBuzz {
    public int num;
    public FizzBuzz(int num){
        this.num = num;
    }

    public void start(){
      for (int i = 1; i <= this.num; i++) 
      {
        if (((i % 5) == 0) && ((i % 3) == 0))
          System.out.println("fizzbuzz");
        else if ((i % 5) == 0)
          System.out.println("fizz");
        else if ((i % 3) == 0) 
          System.out.println("buzz");
        else
          System.out.println(i);
      }
    }
    

}
