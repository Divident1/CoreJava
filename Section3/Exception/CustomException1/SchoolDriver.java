package Section3.Exception.CustomException1;

 class School {
    
    public void schoolTiming(double time){
        if(time<8.3)
         throw new EarlyEntryException("You are tooo Early to come");
         else if(time > 9.0)
         {
            throw new LateEntryException("You are too Late");
         }
         else{
            System.out.println("Good you came");
         }

    }

}

    public class SchoolDriver{
        public static void main(String[] args) {
            School s = new School();
            s.schoolTiming(8);
        }
    }