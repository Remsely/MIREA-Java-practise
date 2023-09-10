package practise2.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Shop {
    private List<Computer> computerList = new ArrayList<>();

    public void addComputer(Computer computer){
        computerList.add(computer);
    }

    public void removeComputer(Computer computer){
        computerList.remove(computer);
    }

    public Computer findComputer(String model){
        for (Computer computer : computerList){
            if(computer.getModel().equalsIgnoreCase(model))
                return computer;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computerList=" + computerList +
                '}';
    }
}
