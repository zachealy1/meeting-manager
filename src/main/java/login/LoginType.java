/**
 * The LoginType file is responsible for storing the main.java.login type constants.
 */

package login;

/**
 * The LoginType enum is responsible for storing the main.java.login type constants.
 *
 * @author Zac Healy
 *
 * @version 1.0
 * @since 2023-05-11
 */

public enum LoginType {

  /** The main.java.login type for guest access. */
  GUEST_ACCESS,
  /** The main.java.login type for access denied. */
  DENIED,
  /** The main.java.login type for an unsuccessful main.java.login. */
  TRY_AGAIN,
  /** The main.java.login type for a successful main.java.login. */
  SUCCESS
}
