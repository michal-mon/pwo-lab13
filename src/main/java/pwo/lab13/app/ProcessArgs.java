package pwo.lab13.app;

import java.util.ArrayList;
import pwo.lab13.app.ProcessData.Action;

public class ProcessArgs {

    /*
    Wyszukuje w tablicy stringów pozycję, która może być
    zinterpretowana jako wartość typu ProcessData.Action.
    Wielkość czcionki nie ma znaczenia. Obowiązuje
    pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca
    wartość UNDEFINE.
    */
    
    public static Action getAction(String[] args) {
        for (String str : args) {
            try {
                Action actionType = Action.valueOf(str.toUpperCase());
                return actionType;
            } catch (Exception e) {}
        }
        return Action.UNDEFINE;
    }
    
    /*
    Wyszukuje w tablicy stringów pozycje, które mogą być
    zinterpretowane jako liczby. Tworzy z tych liczb
    tablicę. Jeżeli nie ma liczb to zwraca pustą tablicę.
    */
    public static double[] getNumbers(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        for (String str : args) {
            try {
                arr.add(Double.parseDouble(str));
            } catch (Exception e) {}
        }
        double[] arrNumbers = new double[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arrNumbers[i] = arr.get(i).doubleValue();
        }
        return arrNumbers;
    }
}