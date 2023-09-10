package practise2.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {
    private List<Computer> computerList = new ArrayList<>();

    public void addComputer(String serialNumber){
        computerList.add(new Computer(serialNumber));
    }

    public int searchComputer(String serialNumber){
        for (int i = 0; i < computerList.size(); i++){
            if (Objects.equals(computerList.get(i).getSerialNumber(), serialNumber)){
                return i;
            }
        }
        return -1;
    }

    public void deleteComputer(String serialNumber){
        int searchResult = searchComputer(serialNumber);
        if(searchResult != -1){
            computerList.remove(searchResult);
        }
        else {
            System.out.println("Этого компьютера нет в наличии!");
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computerList=" + computerList +
                '}';
    }
}
