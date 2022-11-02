public class oneDarrays
  {
      public static void main(String[] args)
      {
          //single value containers
          int State1PopulationCount = 502;
          int State2PopulationCount = 783;
          int State3PopulationCount = 345;
          int State4PopulationCount = 456;
          int State5PopulationCount = 786;

          //Multi Value Container
          int[] StatePopulation= new int[5];
          System.out.println("countryPopulation is: "+countryPopulation);

          //Read the element in array
          //1. Read Single Element
          System.out.println("countryPopulation[0] is: "+countryPopulation[0]);
          System.out.println("countryPopulation[1] is: "+countryPopulation[1]);

          //2. Read All
          for(int i=0; i<countryPopulation.length;i++){
              System.out.println("countryPopulation["+i+"] is: "+countryPopulation[i]);
          }
            //Write/Update Operation
          int State1PopulationCount = 502;
          int State2PopulationCount = 783;
          int State3PopulationCount = 345;
          int State4PopulationCount = 456;
          int State5PopulationCount = 786;
          System.out.println();
          System.out.println("==Re Reading After Write Operation==");

          for(int i=0; i<countryPopulation.length; i++){
              System.out.println("countryPopulation["+i+"] is: "+countryPopulation[i]);

          }

      }
  }
