package pages

import utilty.AbstractDriver

/**
  * Created by thadeus on 19/08/16.
  */
class HomePage extends AbstractDriver{
def goToHomePage(url:String): Unit ={
    driver.get(url)
}
}
