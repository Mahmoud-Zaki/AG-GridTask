package Tests.Search;

import DataUtils.ExcelReader;
import Pages.HomePage;

public class Search {
    static private final HomePage homePage = new HomePage();
    static public void searchByGameName(){
        homePage.enterGameNameToSearch(ExcelReader.getGameName());

        // Assert number of result rows == 1
        if(homePage.getResultsCount() == 1){
            System.out.println("Passed  =>  Only one row is displayed.");
        } else {
            System.out.println("Failed  =>  Number of displayed rows is not as expected.");
        }

        // Assert may break down value equal expected value
        if(homePage.getMayBreakDown().equals(ExcelReader.getMayBreakDown())){
            System.out.println("Passed  =>  Actual result equal expected result.");
        } else {
            System.out.println("Failed  =>  Actual result not equal expected result.");
        }
    }
}