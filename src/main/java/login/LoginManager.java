/**
 * The LoginManager file is responsible for managing user accounts and main.java.login
 * authentication.
 */

package login;

import java.util.HashMap;

/**
 * The LoginManager class is responsible for managing user accounts and main.java.login
 * authentication.
 *
 * @author Zac Healy
 *
 * @version 1.0
 * @since 2023-05-11
 */
public class LoginManager {
  // The usernames and passwords of the users.
  private final HashMap<String, String> userAccounts = new HashMap<>();

  /**
   * Constructor that initialises the default user accounts.
   * 
   * <p>Side-effect Adds a user to the global HashMap that stores user accounts. 
   */
  public LoginManager() {
    addUserAccount("KATHRYNjaneway", "coffeefiend");
    addUserAccount("HARRYkim", "promotionPlease");
    addUserAccount("SEVENofnine", "unimatrix0");
    addUserAccount("tuvok14", "kaltoh");
    addUserAccount("doctor01", "shmullus");
    addUserAccount("neelix57", "leolaroot");
  }

  /**
   * Adds a user account to the global HashMap that stores user accounts.
   * 
   * <p>Side-effect Adds a user to the global HashMap that stores
   * user accounts.
   *
   * @param username The username of the user account to be added.
   *
   * @param password The password of the user account to be added.
   */
  public void addUserAccount(String username, String password) {
    userAccounts.put(username, password);
  }

  /**
   * Checks if a username is valid.
   * 
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param username The username to check for validity.
   * @return true if the username is valid, false otherwise.
   */
  public boolean isUsernameValid(String username) {
    return userAccounts.containsKey(username);
  }

  /**
   * Checks if a username and password combination is valid.
   * 
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param username The username to check for validity.
   *
   * @param password The password to check for validity.
   * @return true if the username and password combination is valid, false
   *         otherwise.
   */
  public boolean isUsernamePasswordValid(String username, String password) {
    // Gets the actual password to match the specified username.
    String storedPassword = userAccounts.get(username); 
    return storedPassword != null && storedPassword.equals(password);
  }

  /**
   * Determines the type of main.java.login access based on the username.
   * 
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param username The username to determine the type of main.java.login access for.
   * @return LoginType.SUCCESS if the first character of the username is
   *         uppercase, LoginType.GUEST_ACCESS otherwise.
   */
  public LoginType getLoginTypeForAccess(String username) {
    // Checks if user has a Iovus username.
    if (Character.isUpperCase(username.charAt(0))) {
      // Grants user guest access.
      return LoginType.SUCCESS;
    } else {
      // Grants user guest access.
      return LoginType.GUEST_ACCESS;
    }
  }

  /**
   * Returns a string representation of the main.java.login type based on the given
   * main.java.login type.
   * 
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param loginType The main.java.login type to be converted to a string.
   * @return A string representation of the main.java.login type.
   */
  public String getLoginTypeString(LoginType loginType) {
    // To return a prompt message to the user.
	  return switch (loginType) {
		  case DENIED -> "Access Denied!";
		  case TRY_AGAIN -> "Try Again!";
		  case GUEST_ACCESS -> "Guest access, please contact IT";
		  default -> "Success";
	  };
  }

  /**
   * Prints a main.java.login message to the console based on the given main.java.login type.
   * 
   * <p>Side-effect free.
   *
   * @param loginType The main.java.login type to be used in the main.java.login message.
   */
  public void printLoginMessage(LoginType loginType) {
    // Prints the main.java.login prompt.
    System.out.println("Access Status: " + getLoginTypeString(loginType)); 
  }

  /**
   * Attempts to main.java.login with the given username and password and returns the
   * main.java.login type representing the access status.
   * 
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param username The username to be used for main.java.login.
   *
   * @param password The password to be used for main.java.login.
   * @return The LoginType enum representing the access status.
   */
  public LoginType login(String username, String password) {
    LoginType loginType;
    // Checks if users username and password are valid.
    if (!isUsernameValid(username)) {
      // Checks if the username is valid.
      loginType = LoginType.DENIED;
    } else if (!isUsernamePasswordValid(username, password)) {
      // Checks if the password matches the username.
      loginType = LoginType.TRY_AGAIN;
    } else {
      // Gets the appropriate main.java.login access.
      loginType = getLoginTypeForAccess(username);
    }
    printLoginMessage(loginType); // Prints the main.java.login prompt.
    return loginType;
  }
}


