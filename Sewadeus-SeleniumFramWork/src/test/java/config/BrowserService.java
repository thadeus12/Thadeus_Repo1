package config;

import java.io.IOException;

/**
 * Created by sewadeus on 28/01/2016.
 */

public interface BrowserService <T> {

    T getFirefoxCapabilities() throws IOException;
    T getChromeCapabilities();
    T getIECapabilities();

}
