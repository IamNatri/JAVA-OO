package JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.classificacao;
import JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.modelos.Audio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//lista de Organizada
public class Preferidas extends ArrayList<Audio> {
    private List<Audio> Array;
    private final Comparator<? super Audio> comparator
            = Collections.reverseOrder();


    public Preferidas() {

        Array = new ArrayList<>();
    }


    public void addingElement(Audio obj){
        Array.add(obj);

        if (Array.size() > 1) {
            //Or Collections.sort(Array); to Commom Order

            Array.sort(comparator);
        }
    }

    public List<Audio> getArray() {
        return Array;
    }

    public Audio getElement(int e){
        return Array.get(e);
    }
}
