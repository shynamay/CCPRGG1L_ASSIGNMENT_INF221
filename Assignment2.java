public class App {
    public static void main(String args[]) {
    
    // FOR LOOP
    for (int firstNameCount = 5; firstNameCount != 0; firstNameCount--) {
        System.out.println("Sheena Mae");
        
    }   
    // DO WHILE
    int surNameCount = 5;
    
    do {
        System.out.println("Pader");
        surNameCount--;
    } 
    while (surNameCount != 0);
    
    //CONTINUE
    int nickNameCount = 5;

    while (nickNameCount != 0) {
    
        if (nickNameCount == 3) {
            System.out.println("Babalik ako. Hindi na ako babalik!");
            nickNameCount--;
            continue;
    }        

        System.out.println("Sheena!");
        nickNameCount--;
    
    }

        System.out.println("Mame");
        nickNameCount--;
    
    // BREAK    
    for (int i = 5; i!= 0; i--) {

        if (i == 4) {
            System.out.println("Wait! Timeout! hahahaha");
            break;
        }

        System.out.println("Sheena");
        
    
    }
        
  }
   
}
