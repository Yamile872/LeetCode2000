import java.util.HashMap;

public class HashMapSuma{

    public static int[] SumaNumeros(int[] arreglo, int objetivo)
    {
        Map <Integer, Integer> mapa = new HashMap();
        for(int i=0; i<arreglo.length; i++)
        {
            int complemento = objetivo - arreglo[i];
            if(mapa.constainKey(complemento)){
                return new int[]{
                    mapa.get(complemento), i
                };
            }
            mapa.put(num[i],i);
        }
        return null;
    }

    public static main(String[] args){
        
    }
}