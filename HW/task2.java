public class task2 {
    public static void main(String[] args) 
    {
      // простые числа от 1 до 1000
      int count = 0;
      for (int i = 1; i < 1000; i++) 
      {
        for (int j = 2; j < i ; j++) 
        {
            if( i % j ==0)
            {
                count +=1;
                break;
            }
        }
        if (count == 0) System.out.println(i);
        count = 0;
      } 
      
    }
}
