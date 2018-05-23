import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class InitialBoard {
static int [] positions=new int[12];
public static void modifiedBoard()
{
    System.out.println("M----------------------------------------------------");
    System.out.print("|- -|   <"+positions[11]+">             <"+positions[5]+">   |- -|                  <11>                 <5> \n" +
            "|   |        <"+positions[10]+">     <"+positions[4]+">      |   |                      <10>          <4>\n"+
            "| "+ positions[0]+" |            <"+positions[3]+">          | "+positions[6]+" |                            <3> \n" +
            "|   |        <"+positions[2]+">      <"+positions[8]+">     |   |                      <2>        <8>\n"             +
            "|   |   <"+positions[1]+">              <"+positions[7]+">  |   |               <1>                    <7>"  );


    System.out.println();

}
public static void main(String[] args) {

      for(int i=1;i<=11;i++)
      {
          if(i==6)
              continue;
          positions[i]=3;

      }

//printing board format
    System.out.println("----------------------------------------------------");
    System.out.print("|- -|   <"+positions[11]+">             <"+positions[5]+">   |- -|                  <11>                 <5> \n" +
            "|   |        <"+positions[10]+">     <"+positions[4]+">      |   |                      <10>          <4>\n"+
            "| "+ positions[0]+" |            <"+positions[3]+">          | "+positions[6]+" |                            <3> \n" +
            "|   |        <"+positions[2]+">      <"+positions[8]+">     |   |                      <2>        <8>\n"             +
            "|   |   <"+positions[1]+">              <"+positions[7]+">  |   |               <1>                    <7>"  );


System.out.println();
System.out.println();






}


}
