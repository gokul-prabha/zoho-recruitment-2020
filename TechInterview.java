public class TechInterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number..");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k=1;
        for(int i=1 ;i<= number;i++ )
        {
            int count =1;
            int h =number ;
            int z = k -1;
        for(int j=1 ; j<= number + (number -1); j++)
        {
            
            if(j > number -i && count <= number)
            {
                
                if(i%2 !=0)
                {
                System.out.print( k++ + " " );
                }
                else
                {
                    System.out.print( z + h-- + " " );
                    k++;
                }
                count++;
            }
            else
                System.out.print(" ");
        }
            System.out.println();
        }
    }
    
}
