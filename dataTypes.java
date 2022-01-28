class dataTypes {
    /*
     * DataTpes- 1)primitive 2)non-primitive
     * 
     * Primitive : byte,short,int,long,float,double,char,boolean 
     * 1 byte = 8 bit
     * byte(1 byte) [-128 to 127],
     *  short (2 bytes) [-32,768 to 32,767],
     *  int (4 bytes)[-2,14,74,83,648 to 2147483647],
     *  long (8 bytes) [-9223372036854775808 to 9223372036854775807],
     *  float (4 bytes) [6 to 7 decimal didgits],
     *  double (8 bytes) [15 decimal digits],
     *  char (2 bytes) [ASCII Characters],
     *  boolean (1 bit) [0 or 1]
     * 
     * Non-Primitve : Array,Class,String
     */
    /*
     * DataType Conversion :
     *  1) Widening Casting / Impicit casting (Automatically done by JVM) 
     *      byte < short < char < int < long < float < double
     * 
     * 2) Narrowing Casting / Explicit casting (Manually) 
     *     double > float > long > int > char > short > byte
     * 
     */
    public static void main(String[] args) {
    
        /* // Implicit converstion (i.e automatically done)
        int i=5;
        float m;
         m=i;
         System.out.println(m);
          */  

          //Explicit Conversion
          float i = 3.5f;
          int m;
          m = (int) i;
          System.out.println(m);
          
    }
}