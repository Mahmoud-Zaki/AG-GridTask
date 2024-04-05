package Tests;

import Tests.Search.Search;
import Utilies.HelperClass;

public class Main {

    public static void main(String[] args){
        HelperClass.setUpDriver();
        HelperClass.openPage("https://www.ag-grid.com/example/");
        Search.searchByGameName();
        HelperClass.tearDown();
    }
}