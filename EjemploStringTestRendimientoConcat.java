public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
       String a = "a";
       String b = "b";
       String c = a;

       StringBuilder sb = new StringBuilder(a);
       long inicio = System.currentTimeMillis();

       for( int i = 0; i < 10000; i++){
             //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 213ms
            //c += a + b + "\n"; // 500 => 170ms 1000 => 109ms, 10000 => 246ms
           sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 3ms

       }

       System.gc();

       long fin = System.currentTimeMillis();
       System.out.println(fin - inicio);
       System.out.println("c = " + c);
       System.out.println("sb = " + sb.toString());
       System.exit(0);
    }
}
